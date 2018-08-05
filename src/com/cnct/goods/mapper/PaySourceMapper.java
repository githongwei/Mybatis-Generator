package com.cnct.goods.mapper;

import com.cnct.goods.model.po.PaySource;

public interface PaySourceMapper {
    int deleteByPrimaryKey(String paySourceId);

    int insert(PaySource record);

    int insertSelective(PaySource record);

    PaySource selectByPrimaryKey(String paySourceId);

    int updateByPrimaryKeySelective(PaySource record);

    int updateByPrimaryKey(PaySource record);
}