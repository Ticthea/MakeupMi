package org.epss.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.epss.domain.Info;
import org.epss.domain.InfoExample;

public interface InfoMapper {
    long countByExample(InfoExample example);

    int deleteByExample(InfoExample example);

    int deleteByPrimaryKey(Integer iid);

    int insert(Info record);

    int insertSelective(Info record);

    List<Info> selectByExample(InfoExample example);

    Info selectByPrimaryKey(Integer iid);

    List<Info> selectByExampleWithObject(InfoExample example);

    Info selectByPrimaryKeyWithObject(Integer iid);

    int updateByExampleSelective(@Param("record") Info record, @Param("example") InfoExample example);

    int updateByExample(@Param("record") Info record, @Param("example") InfoExample example);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKey(Info record);
}