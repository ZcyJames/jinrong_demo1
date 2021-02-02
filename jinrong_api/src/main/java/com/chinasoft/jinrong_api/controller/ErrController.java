package com.chinasoft.jinrong_api.controller;

import com.chinasoft.jinrong_api.pojo.ReturnData;
import com.chinasoft.jinrong_api.pojo.StatusCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrController {
    @RequestMapping("/error")
    public Object error(Exception exception){
        return new ReturnData(StatusCode.RETURN_ERROR,"请求异常!");
    }
}
