package com.rpc.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @program: http
 * @description:
 * @author: Napoleon
 * @create: 2018/8/10 21:31
 * @version: 0.0.1
 **/
@SpringBootApplication(scanBasePackages = "com.rpc")
@EnableScheduling
@ServletComponentScan
@EnableTransactionManagement
@MapperScan(value = "com.rpc.dal.mapper")
public class SystemServer {
    public static void main(String[] args) {
        SpringApplication.run(SystemServer.class, args);
    }
}
