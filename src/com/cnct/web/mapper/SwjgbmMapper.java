package com.cnct.web.mapper;

import com.cnct.web.model.po.Swjgbm;

public interface SwjgbmMapper {
    int deleteByPrimaryKey(String swjgbm);

    int insert(Swjgbm record);

    int insertSelective(Swjgbm record);

    Swjgbm selectByPrimaryKey(String swjgbm);

    int updateByPrimaryKeySelective(Swjgbm record);

    int updateByPrimaryKey(Swjgbm record);
}