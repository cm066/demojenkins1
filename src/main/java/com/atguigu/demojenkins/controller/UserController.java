package com.atguigu.demojenkins.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xiaoming
 * @Date 2020/12/23 16:52
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String findAll(){

        return "hello";
    }

    /**
     * 这是分支新增的方法
     * @return
     */
    @DeleteMapping
    public String delete(){
        return "ok";
    }

    /**
     * 这是分支新增的方法的第二方法
     * @return
     */
    @DeleteMapping
    public String delete1(){
        return "ok";
    }
}
