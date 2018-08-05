package com.cnct.goods.mapper;

import com.cnct.goods.model.po.PayWay;

public interface PayWayMapper {
    int deleteByPrimaryKey(String payWayId);

    int insert(PayWay record);

    int insertSelective(PayWay record);

    PayWay selectByPrimaryKey(String payWayId);

    int updateByPrimaryKeySelective(PayWay record);

    int updateByPrimaryKey(PayWay record);
}