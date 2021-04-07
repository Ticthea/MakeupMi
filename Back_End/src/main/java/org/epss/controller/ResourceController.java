package org.epss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.epss.domain.Resource;
import org.epss.service.ResourceService;
import org.epss.utils.MessageAndData;

@Controller
@ResponseBody
@RequestMapping(value = "/resource")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @RequestMapping(value = "/opt/{rid}",method = RequestMethod.GET)
    public MessageAndData optSelectPrimaryKey(@PathVariable("rid")Integer rid){
        Resource resource = resourceService.selectByPrimaryKey(rid);
        return MessageAndData.success("查询成功").add("resource",resource);
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public MessageAndData test(){
        return MessageAndData.success("测试成功").add("键","具体的值");
    }
}
