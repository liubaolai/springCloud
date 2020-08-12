package com.atguigu.springcloud.Controller;

import com.atguigu.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 九月墨色
 * @date 2020/8/7 11:25
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value="/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }
}
