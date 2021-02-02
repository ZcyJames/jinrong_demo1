package com.chinasoft.jinrong_api.service;

import java.util.List;
import java.util.Map;

public interface IUserService {
    public List<Map<String,Object>> selectGoodsAll();
    public List<Map<String,Object>> selectGoodsByWhere(String goodsId);
    public int insertGoodsByOne(Map<String,Object> map);
    public int deleteGoodsByName(List<String> goodsName);
}
