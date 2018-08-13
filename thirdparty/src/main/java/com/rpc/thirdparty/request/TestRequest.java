package com.rpc.thirdparty.request;

import com.rpc.thirdparty.RequestMethodEnum;
import com.rpc.thirdparty.response.TestResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: http
 * @description:
 * @author: Napoleon
 * @create: 2018/8/10 22:21
 * @version: 0.0.1
 **/
public class TestRequest implements Request<TestResponse> {

    private static final String URL = "/person/listPage";

    private static final RequestMethodEnum METHOD = RequestMethodEnum.POST;

    private String name;

    private Integer pageNum;

    private Integer pageSize;


    @Override
    public RequestMethodEnum getRequestMethodType() {
        return this.METHOD;
    }

    @Override
    public String getRequestUrl() {
        return this.URL;
    }

    @Override
    public Map<String, Object> getRequestParams() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("pageNum", pageNum);
        map.put("pageSize", pageSize);
        return map;
    }

    @Override
    public Class<TestResponse> getClazz() {
        return TestResponse.class;
    }

    @Override
    public Boolean isRest() {
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
