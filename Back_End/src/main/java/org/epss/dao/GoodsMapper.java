package org.epss.dao;

import org.apache.ibatis.annotations.Param;
import org.epss.domain.Goods;
import org.epss.domain.GoodsExample;

import java.util.List;

public interface GoodsMapper {
    long countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    List<Goods> selectByExampleWithObject(GoodsExample example);

    Goods selectByPrimaryKey(Integer gid);

    Goods selectByPrimaryKeyWithObject(Integer gid);

    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}