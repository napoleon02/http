package com.rpc.thirdparty.client;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpStatus;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.rpc.thirdparty.RequestMethodEnum;
import com.rpc.thirdparty.request.Request;
import com.rpc.thirdparty.response.Response;

import java.util.Map;

/**
 * @program: http
 * @description:
 * @author: Napoleon
 * @create: 2018/8/10 22:29
 * @version: 0.0.1
 **/
public class RpcClient {


    private String host;

    //TODO 第三方接口对接的其他参数

    public <T extends Response> T execute(Request<T> req) {
        T result = null;
        try {
            String requestUrl = this.host + req.getRequestUrl();

            RequestMethodEnum requestMethodType = req.getRequestMethodType();
            Class<T> clazz = req.getClazz();
            Map<String, Object> requestParams = req.getRequestParams();
            HttpRequest request = null;
            if (RequestMethodEnum.GET.equals(requestMethodType)) {
                request = HttpUtil.createGet(requestUrl);
            }
            if (RequestMethodEnum.POST.equals(requestMethodType)) {
                request = HttpUtil.createPost(requestUrl);
            }
            if (CollUtil.isNotEmpty(requestParams)) {
                if (req.isRest()) {
                    request.body(JSONUtil.toJsonStr(requestParams));
                } else {
                    request.form(requestParams);
                }
            }
            HttpResponse execute = request.execute();
            if (HttpStatus.HTTP_OK == execute.getStatus()) {
                result = clazz.newInstance();
                String body = execute.body();
                result = JSONUtil.toBean(body, clazz);
            } else {
                result.setCode(0);
                result.setMessage("请求rpc接口失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public RpcClient(String host) {
        this.host = host;
    }
}
