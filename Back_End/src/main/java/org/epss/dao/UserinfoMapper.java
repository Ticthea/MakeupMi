package org.epss.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.epss.domain.Userinfo;
import org.epss.domain.UserinfoExample;

public interface UserinfoMapper {
    long countByExample(UserinfoExample example);

    int deleteByExample(UserinfoExample example);

    int deleteByPrimaryKey(Integer uiid);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    List<Userinfo> selectByExample(UserinfoExample example);

    Userinfo selectByPrimaryKey(Integer uiid);

    List<Userinfo> selectByExampleWithObject(UserinfoExample example);

    Userinfo selectByPrimaryKeyWithObject(Integer uiid);

    int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
}