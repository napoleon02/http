package com.rpc.thirdparty.request;

import com.rpc.thirdparty.RequestMethodEnum;
import com.rpc.thirdparty.response.Response;

import java.util.Map;

/**
 * @program: http
 * @description:
 * @author: Napoleon
 * @create: 2018/8/10 22:12
 * @version: 0.0.1
 **/
public interface Request<T extends Response> {

    /**
     * 请求方式
     *
     * @return
     */
    RequestMethodEnum getRequestMethodType();

    /**
     * rpc请求地址
     *
     * @return
     */
    String getRequestUrl();

    /**
     * 地址请求参数
     *
     * @return
     */
    Map<String, Object> getRequestParams();

    /**
     * 请求响应类
     *
     * @return
     */
    Class<T> getClazz();

    /**
     * ...
     *
     * @return
     */
    Boolean isRest();

}
