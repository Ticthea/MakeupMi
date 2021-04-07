package org.epss.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/10/22 0022
 * @描述
 */
public class UserinfoCondition extends Userinfo implements Serializable {
    private Integer uiidCondition;//对于通过指定范围的整数型内容,一般选择此种条件限定方式
    private Date startDate;
    private Date endDate;

    public UserinfoCondition() {
    }

    public UserinfoCondition(Integer uiid,Date addTime, Integer uiidCondition, Date startDate, Date endDate) {
        super(uiid, addTime);
        this.uiidCondition = uiidCondition;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "UserCondition{" +
                "uiidCondition=" + uiidCondition +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                "} " + super.toString();
    }

    public Integer getUidCondition() {
        return uiidCondition;
    }

    public void setUidCondition(Integer uidCondition) {
        this.uiidCondition = uiidCondition;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
