package com.cnct.web.mapper;

import com.cnct.web.model.po.BillingCompany;

public interface BillingCompanyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BillingCompany record);

    int insertSelective(BillingCompany record);

    BillingCompany selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BillingCompany record);

    int updateByPrimaryKey(BillingCompany record);
}