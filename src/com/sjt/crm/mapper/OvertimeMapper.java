package com.sjt.crm.mapper;

import com.sjt.crm.model.po.Overtime;

public interface OvertimeMapper {
    int deleteByPrimaryKey(String overtimeId);

    int insert(Overtime record);

    int insertSelective(Overtime record);

    Overtime selectByPrimaryKey(String overtimeId);

    int updateByPrimaryKeySelective(Overtime record);

    int updateByPrimaryKey(Overtime record);
}