package com.rpc.system.config;

import com.rpc.thirdparty.client.RpcClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: http
 * @description:
 * @author: Napoleon
 * @create: 2018/8/10 22:44
 * @version: 0.0.1
 **/
@Configuration
public class ClientConfig {

    @Bean
    public RpcClient rpcClient(@Value("${lw.host}")String address){
        return new RpcClient(address);
    }

}
