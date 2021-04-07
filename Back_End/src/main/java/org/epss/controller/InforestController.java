package org.epss.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.epss.domain.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vip.epss.domain.*;
import org.epss.service.InfoService;
import org.epss.utils.MessageAndData;

import java.text.ParseException;
import java.util.List;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/10/26 0026
 * @描述
 */
@Controller
@RequestMapping(value = "/inforest")
public class InforestController {
    @Autowired
    private InfoService infoService;
//  http://localhost:8888/inforest/list

    @ResponseBody
    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    public MessageAndData list(
            /*InfoCondition condition,*//*检索条件*/
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize

    ) throws ParseException {

//        InfoExample example = new InfoExample();
//        InfoExample.Criteria criteria = example.createCriteria();
//
//
//
//        criteria.andIidEqualTo(condition.getIid());
//
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date startDate1 = dateFormat.parse("1970-01-01");
//        Date endDate1 = dateFormat.parse("2999-12-31");
//
//        Date startDate = condition.getStartDate() == null ? startDate1 : condition.getStartDate();
//        Date endDate = condition.getEndDate() == null ? endDate1 : condition.getEndDate();
//        if (startDate.after(endDate)) {
//            Date tempDate = startDate;
//            startDate = endDate;
//            endDate = tempDate;
//        }
//
//        criteria.andAddTimeBetween(startDate, endDate);


        //初始化,约束
        PageHelper.startPage(pageNum, pageSize);
        List<Info> lists = infoService.selectByExampleWithObject(null);
        //使用pageHelper的方式封装数据,默认的导航列表长度为8
        PageInfo pageInfo = new PageInfo(lists, 8);
        return MessageAndData.success("").add("pageInfo", pageInfo);
    }


}
