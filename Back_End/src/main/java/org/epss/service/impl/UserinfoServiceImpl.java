package org.epss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.epss.dao.UserinfoMapper;
import org.epss.domain.Userinfo;
import org.epss.domain.UserinfoExample;
import org.epss.service.UserinfoService;

import java.util.List;

@Service(value = "userinfoService")
public class UserinfoServiceImpl implements UserinfoService {

    @Autowired
    private UserinfoMapper userinfoMapper;
    @Override
    public long countByExample(UserinfoExample example) {
        return userinfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserinfoExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer uiid) {
        return 0;
    }

    @Override
    public int insert(Userinfo record) {
        return 0;
    }

    @Override
    public int insertSelective(Userinfo record) {
        return 0;
    }

    @Override
    public List<Userinfo> selectByExample(UserinfoExample example) {
        return userinfoMapper.selectByExample(example);
    }

    @Override
    public Userinfo selectByPrimaryKey(Integer uiid) {
        return userinfoMapper.selectByPrimaryKey(uiid);
    }

    @Override
    public List<Userinfo> selectByExampleWithObject(UserinfoExample example) {
        return userinfoMapper.selectByExampleWithObject(example);
    }

    @Override
    public Userinfo selectByPrimaryKeyWithObject(Integer uiid) {
        return userinfoMapper.selectByPrimaryKeyWithObject(uiid);
    }

    @Override
    public int updateByExampleSelective(Userinfo record, UserinfoExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Userinfo record, UserinfoExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Userinfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Userinfo record) {
        return 0;
    }
}
