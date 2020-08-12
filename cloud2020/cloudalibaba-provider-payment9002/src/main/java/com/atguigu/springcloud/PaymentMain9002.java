package com.atguigu.springcloud;

import jdk.nashorn.internal.codegen.types.BooleanType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author 九月墨色
 * @date 2020/8/11 9:30
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002 {
    public static void main(String [] args) {
        SpringApplication.run(PaymentMain9002.class, args);
     }
}
