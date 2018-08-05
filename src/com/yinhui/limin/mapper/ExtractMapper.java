package com.yinhui.limin.mapper;

import com.yinhui.limin.model.po.Extract;

public interface ExtractMapper {
    int deleteByPrimaryKey(String extractId);

    int insert(Extract record);

    int insertSelective(Extract record);

    Extract selectByPrimaryKey(String extractId);

    int updateByPrimaryKeySelective(Extract record);

    int updateByPrimaryKey(Extract record);
}