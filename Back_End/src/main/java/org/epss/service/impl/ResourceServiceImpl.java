package org.epss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.epss.dao.ResourceMapper;
import org.epss.domain.Resource;
import org.epss.domain.ResourceExample;
import org.epss.service.ResourceService;

import java.util.List;

@Service(value = "resourceService")
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceMapper resourceMapper;

    @Override
    public long countByExample(ResourceExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(ResourceExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer rid) {
        return 0;
    }

    @Override
    public int insert(Resource record) {
        return 0;
    }

    @Override
    public int insertSelective(Resource record) {
        return 0;
    }

    @Override
    public List<Resource> selectByExample(ResourceExample example) {
        return null;
    }

    @Override
    public Resource selectByPrimaryKey(Integer rid) {
        return resourceMapper.selectByPrimaryKey(rid);
    }

    @Override
    public int updateByExampleSelective(Resource record, ResourceExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Resource record, ResourceExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Resource record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Resource record) {
        return 0;
    }
}
