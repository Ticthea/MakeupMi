package org.epss.domain;

import java.util.Date;

public class Resource {
    private Integer rid;

    private String rname;

    private String ravatar;

    private Integer frtid;

    private Date addTime;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRavatar() {
        return ravatar;
    }

    public void setRavatar(String ravatar) {
        this.ravatar = ravatar;
    }

    public Integer getFrtid() {
        return frtid;
    }

    public void setFrtid(Integer frtid) {
        this.frtid = frtid;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}