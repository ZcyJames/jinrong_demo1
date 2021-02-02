package com.chinasoft.jinrong_api.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IUserDao {
    public List<Map<String,Object>> selectGoodsAll();
    public List<Map<String,Object>> selectGoodsByWhere(@Param(value = "goodsId") String goodsId);
    public int insertGoodsByOne(Map<String,Object> map);
    public int deleteGoodsByName(List<String> goodsName);
}
