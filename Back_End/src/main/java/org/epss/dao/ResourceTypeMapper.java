package org.epss.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.epss.domain.ResourceType;
import org.epss.domain.ResourceTypeExample;

public interface ResourceTypeMapper {
    long countByExample(ResourceTypeExample example);

    int deleteByExample(ResourceTypeExample example);

    int deleteByPrimaryKey(Integer rtid);

    int insert(ResourceType record);

    int insertSelective(ResourceType record);

    List<ResourceType> selectByExample(ResourceTypeExample example);

    ResourceType selectByPrimaryKey(Integer rtid);

    int updateByExampleSelective(@Param("record") ResourceType record, @Param("example") ResourceTypeExample example);

    int updateByExample(@Param("record") ResourceType record, @Param("example") ResourceTypeExample example);

    int updateByPrimaryKeySelective(ResourceType record);

    int updateByPrimaryKey(ResourceType record);
}