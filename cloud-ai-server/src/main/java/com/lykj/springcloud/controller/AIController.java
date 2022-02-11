package com.lykj.springcloud.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 智能管理模块接口
 *
 * @author: Kaf
 * @since: 2022/02/07
 */
@RestController
@RequestMapping("/echo")
public class AIController {
    //回显服务
    @RequestMapping(value = "/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        return "echo: " + string;
    }
}
