package com.cnct.web.mapper;

import com.cnct.web.model.po.Qylx;

public interface QylxMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Qylx record);

    int insertSelective(Qylx record);

    Qylx selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Qylx record);

    int updateByPrimaryKey(Qylx record);
}