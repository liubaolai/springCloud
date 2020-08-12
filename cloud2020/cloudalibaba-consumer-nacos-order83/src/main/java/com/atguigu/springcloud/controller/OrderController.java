package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author 九月墨色
 * @date 2020/8/11 9:53
 */
@RestController
public class OrderController {
    //@Resource
    //private LoadBalancerClient loadBalancerClient;
    @Resource
    private RestTemplate restTemplate;


    //@Value("${spring.application.name}")
    //private String appName;
    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Long id)
    {
        //ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-provider");
        //String url = String.format("http://%s:%s/payment/nacos/"+id,serviceInstance.getHost(),serviceInstance.getPort());
        //System.out.println(url);

        //return restTemplate.getForObject(url,String.class);
        return restTemplate.getForObject(serverURL+"/payment/nacos/"+id,String.class);
    }
}
