package com.yinhui.limin.mapper;

import com.yinhui.limin.model.po.Settlement;

public interface SettlementMapper {
    int deleteByPrimaryKey(String settlementId);

    int insert(Settlement record);

    int insertSelective(Settlement record);

    Settlement selectByPrimaryKey(String settlementId);

    int updateByPrimaryKeySelective(Settlement record);

    int updateByPrimaryKey(Settlement record);
}