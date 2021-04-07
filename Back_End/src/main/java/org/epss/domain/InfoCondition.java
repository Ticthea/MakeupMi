package org.epss.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @创建人 epss[wangzhanf]
 * @创建时间 2020/10/29 0029
 * @描述
 */
public class InfoCondition extends Info implements Serializable {
    private Date startDate;
    private Date endDate;

    public InfoCondition() {
    }
    public InfoCondition(Integer iid,Date startDate, Date endDate){
        super(iid);
        this.startDate = startDate;
        this.endDate = endDate;
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
