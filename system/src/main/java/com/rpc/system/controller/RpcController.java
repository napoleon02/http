package com.rpc.system.controller;

import com.rpc.thirdparty.client.RpcClient;
import com.rpc.thirdparty.request.TestRequest;
import com.rpc.thirdparty.response.TestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: http
 * @description:
 * @author: Napoleon
 * @create: 2018/8/10 22:46
 * @version: 0.0.1
 **/
@RestController
@RequestMapping("/rpc")
@Api(description = "rpc")
public class RpcController {


    @Resource(name = "rpcClient")
    private RpcClient rpcClient;

    @PostMapping("/execute")
    @ApiOperation(value = "rpc获取人员")
    public Object getAllPerson(@ApiParam(value = "姓名", required = true)
                               @RequestParam String name) {

        TestRequest request = new TestRequest();
        request.setName(name);
        request.setPageNum(1);
        request.setPageSize(10);
        TestResponse execute = rpcClient.execute(request);
        return execute;

    }
}
