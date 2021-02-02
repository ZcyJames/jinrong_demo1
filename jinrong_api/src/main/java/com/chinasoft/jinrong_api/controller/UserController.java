package com.chinasoft.jinrong_api.controller;

import com.alibaba.fastjson.JSONObject;
import com.chinasoft.jinrong_api.pojo.ReturnData;
import com.chinasoft.jinrong_api.pojo.StatusCode;
import com.chinasoft.jinrong_api.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/test")
    public Object test(@RequestParam Map<String,Object> map){
        System.out.println(map);
        return new ReturnData(StatusCode.REQUEST_SUCCESS,userService.selectGoodsAll(),"后端数据交互成功");
    }

    @RequestMapping("/test1")
    public Object test1(@RequestParam Map<String,Object> map){
        System.out.println(map);
        return new ReturnData(StatusCode.REQUEST_SUCCESS,userService.selectGoodsByWhere(map.get("goodsId")+""),"后端数据交互成功");
    }

    @RequestMapping("/test2")
    public Object test2(@RequestParam Map<String,Object> map){
        System.out.println(map);
        return new ReturnData(map);
    }

    /*axios异步传输所有信息到前端table*/
    @RequestMapping(value = "/test3")
    public Object test3(HttpServletRequest request, HttpServletResponse response, @RequestParam Map<String, Object> map){
        List<Map<String,Object>> list=userService.selectGoodsAll();
        return JSONObject.toJSON(new ReturnData(StatusCode.REQUEST_SUCCESS,list,"后端数据交互成功"));
    }

    /*批量删除*/
    @RequestMapping("/test4")
    public Object test4(HttpServletRequest request, HttpServletResponse response, @RequestParam Map<String,Object> map){
//        List<String> list = map.get("goodsName");
//        System.out.println("=====>>"+list);
        List<String> goodsName = Arrays.asList(map.get("goodsName").toString().split(","));
        int i = userService.deleteGoodsByName(goodsName);
        return i;
    }

    /*  新增*/
    @RequestMapping("/test5")
    public Object test5(HttpServletRequest request, HttpServletResponse response, @RequestParam Map<String,Object> map){
        userService.insertGoodsByOne(map);
        return JSONObject.toJSON(new ReturnData(StatusCode.REQUEST_SUCCESS,"数据新增成功"));
    }
}
