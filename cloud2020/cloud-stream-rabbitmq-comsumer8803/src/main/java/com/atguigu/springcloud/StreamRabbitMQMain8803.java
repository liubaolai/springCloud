package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * @Author 九月墨色
 * @date 2020/8/7 14:33
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamRabbitMQMain8803 {
    public static void main(String [] args) {
        SpringApplication.run(StreamRabbitMQMain8803.class, args);
     }
}
