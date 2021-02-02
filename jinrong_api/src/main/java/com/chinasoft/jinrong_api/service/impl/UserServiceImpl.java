package com.chinasoft.jinrong_api.service.impl;

import com.chinasoft.jinrong_api.dao.IUserDao;
import com.chinasoft.jinrong_api.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
        private IUserDao userDao;

    @Override
    public List<Map<String, Object>> selectGoodsAll() {
        return userDao.selectGoodsAll();
    }

    @Override
    public List<Map<String, Object>> selectGoodsByWhere(String goodsId) {
        return userDao.selectGoodsByWhere(goodsId);
    }

    @Override
    public int insertGoodsByOne(Map<String, Object> map) {
        return userDao.insertGoodsByOne(map);
    }

    @Override
    public int deleteGoodsByName(List<String> goodsName) {
        return userDao.deleteGoodsByName(goodsName);
    }
}
