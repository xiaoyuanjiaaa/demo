package com.fc.datastatistics.controller;

import com.fc.datastatistics.bean.Test;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class TestController {
    @RequestMapping(method = RequestMethod.POST,value = "/userById")
    @ApiOperation(value = "获取用户信息", notes = "通过用户ID获取用户信息")
    public String findById(@Valid @RequestBody Test test, BindingResult BindingResult){
        if(BindingResult.hasErrors()){
            System.out.println(BindingResult.getFieldError().getDefaultMessage());
        }
        return "1231231";

    }
}
