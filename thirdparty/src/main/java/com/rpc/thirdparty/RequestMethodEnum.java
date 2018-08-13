package com.rpc.thirdparty;

/**
 * @program: http
 * @description:
 * @author: Napoleon
 * @create: 2018/8/10 22:12
 * @version: 0.0.1
 **/
public enum RequestMethodEnum {

    GET("GET", "GET"),
    POST("POST", "POST");


    private String method;

    private String message;

    RequestMethodEnum(String method, String message) {
        this.method = method;
        this.message = message;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
