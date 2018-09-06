package com.example.swagger2.controller;


import com.example.swagger2.entity.User;
import com.example.swagger2.mapper.UserMapper;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: zhaofq
 * @description:
 * @create: 2018-09-04 09:56
 **/
@RestController//接口注解
@Api(value="用户接口",tags={"userAPi"})//接口简要标注，对中文的支持不太好
public class UserController {


    @Autowired(required = false)
    private UserMapper userMapper;
    
//    //接口需要的参数，可以有多个，这里只写了一个，它的paramType还有path、query、body、form几种，
//    @ApiImplicitParams({
//            @ApiImplicitParam(paramType = "header", name = "Token", value = "token", dataType = "String", required = true,defaultValue = "123")})
//    //接口功能描述
//    @ApiOperation(value = "获取一只狗")
//    //接口响应信息，这里定义了一个401，当出现401，接口返回的是自定的错误AnimalError的实例。当然可以定义多个。
//    @ApiResponses(value = { @ApiResponse(code = 401, message = "请求未通过认证.") })
//    @RequestMapping(value="/onedog", method = RequestMethod.GET)
//    public void oneDog(){
//       
//    }
//    
//    @ApiImplicitParams({
//            @ApiImplicitParam(paramType = "header", name = "Token", value = "token", dataType = "String", required = true,defaultValue = "123")})
//    @ApiOperation(value = "创建一只狗")
//    @ApiResponses(value = { @ApiResponse(code = 401, message = "请求未通过认证")})
//    @RequestMapping(value="/dog/{name}", method = RequestMethod.GET)
//    public void createDog(
//            @ApiParam(defaultValue = "二哈")//@ApiParam和@RequestParam注解作用效果相同
//            @PathVariable("name") String name,
//            @PathVariable("cc") String cc){
//        
//       
//       
//    }

   
//    @ApiImplicitParams({
//            @ApiImplicitParam()
//    })
//    @ApiOperation(value = "根据手机号获取用户信息")
//    @GetMapping(value = "/user/{mobile}")
//    public  @ResponseBody User findUserByMobile(@PathVariable("mobile") String mobile){
//        return userMapper.findUserByMobile(mobile);
//        
//    }


    @ApiImplicitParams({
            @ApiImplicitParam()
    })
    @ApiOperation(value = "根据手机号获取用户信息")
    @GetMapping(value = "/user/{mobile}")
    public  @ResponseBody User findUserByMobile(@RequestParam("mobile") String mobile){
        return userMapper.findUserByMobile(mobile);

    }
    
    
}