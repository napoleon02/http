package com.rpc.thirdparty.response;

/**
 * @program: http
 * @description:
 * @author: Napoleon
 * @create: 2018/8/10 22:09
 * @version: 0.0.1
 **/
public abstract class Response {

    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
