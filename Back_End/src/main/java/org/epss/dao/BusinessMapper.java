package org.epss.dao;

import org.apache.ibatis.annotations.Param;
import org.epss.domain.Business;
import org.epss.domain.BusinessExample;

import java.util.List;

public interface BusinessMapper {
    long countByExample(BusinessExample example);

    int deleteByExample(BusinessExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Business record);

    int insertSelective(Business record);

    List<Business> selectByExample(BusinessExample example);

    Business selectByPrimaryKey(Integer bid);

    List<Business> selectByExampleWithObject(BusinessExample example);

    Business selectByPrimaryKeyWithObject(Integer bid);

    int updateByExampleSelective(@Param("record") Business record, @Param("example") BusinessExample example);

    int updateByExample(@Param("record") Business record, @Param("example") BusinessExample example);

    int updateByPrimaryKeySelective(Business record);

    int updateByPrimaryKey(Business record);
}