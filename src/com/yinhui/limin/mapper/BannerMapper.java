package com.yinhui.limin.mapper;

import com.yinhui.limin.model.po.Banner;

public interface BannerMapper {
    int deleteByPrimaryKey(String bannerId);

    int insert(Banner record);

    int insertSelective(Banner record);

    Banner selectByPrimaryKey(String bannerId);

    int updateByPrimaryKeySelective(Banner record);

    int updateByPrimaryKey(Banner record);
}