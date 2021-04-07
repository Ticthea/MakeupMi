package org.epss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.epss.dao.InfoMapper;
import org.epss.domain.Info;
import org.epss.domain.InfoExample;
import org.epss.service.InfoService;

import java.util.List;

@Service(value = "infoService")
public class InfoServiceImpl implements InfoService {

    @Autowired
    private InfoMapper infoMapper;

    @Override
    public long countByExample(InfoExample example) {
        return infoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(InfoExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer iid) {
        return 0;
    }

    @Override
    public int insert(Info record) {
        return 0;
    }

    @Override
    public int insertSelective(Info record) {
        return 0;
    }

    @Override
    public List<Info> selectByExample(InfoExample example) {
        return infoMapper.selectByExample(example);
    }

    @Override
    public Info selectByPrimaryKey(Integer iid) {
        return infoMapper.selectByPrimaryKey(iid);
    }

    @Override
    public List<Info> selectByExampleWithObject(InfoExample example) {
        return infoMapper.selectByExampleWithObject(example);
    }

    @Override
    public Info selectByPrimaryKeyWithObject(Integer iid) {
        return infoMapper.selectByPrimaryKeyWithObject(iid);
    }

    @Override
    public int updateByExampleSelective(Info record, InfoExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Info record, InfoExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Info record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Info record) {
        return 0;
    }
}
