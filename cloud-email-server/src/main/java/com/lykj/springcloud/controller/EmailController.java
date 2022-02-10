//package com.lykj.springcloud.controller;
//
//import com.lykj.springcloud.service.impl.EmailServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
///**
// * 智能管理模块接口
// *
// * @author: Kaf
// * @since: 2022/02/07
// */
//@RestController
//@RequestMapping("/email")
//public class EmailController {
//    @Autowired
//    private EmailServiceImpl emailServiceImpl;
//    //回显服务
//    @RequestMapping(value = "/{string}", method = RequestMethod.GET)
//    public String echo(@PathVariable String string) {
//        return "echo: " + string;
//    }
//
//    //发送一封测试邮件
//    @GetMapping("test1")
//    public void SendTestEmail(){
//        String content = "你好，恭喜你...";
//        emailServiceImpl.sendSimpleMail("john.gao@leiyankeji.com","祝福邮件",content);
//    }
//}
