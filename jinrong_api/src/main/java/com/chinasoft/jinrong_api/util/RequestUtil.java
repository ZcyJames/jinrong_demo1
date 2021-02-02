package com.chinasoft.jinrong_api.util;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestUtil {
    public static Map<String, Object> getQueryMap(HttpServletRequest request) {
        Map<String, Object> bm = new HashMap<String, Object>();
        Map<String, String[]> tmp = request.getParameterMap();

        if (tmp != null) {
            for (String key : tmp.keySet()) {
                Object[] values = tmp.get(key);
                Object o = values.length == 1 ? values[0].toString().trim()
                        : values;
                bm.put(key, isType(o));
            }
        }
        return bm;
    }

    //将字符串转化成数值类型
    public static Object isType(Object o) {
        Object object = o;
        try {
            object = Integer.parseInt(o.toString());
        } catch (Exception e) {
            try {
                object = Double.parseDouble(o.toString());
            } catch (Exception e1) {
                object = o.toString();
            }

        }
        return object;
    }


    public static int RandomNumber(int min,int max){
        return  new Random().nextInt(max-min+1)+min;
    }



}