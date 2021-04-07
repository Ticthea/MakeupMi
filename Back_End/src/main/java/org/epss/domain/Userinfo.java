package org.epss.domain;

import java.util.Date;

public class Userinfo {
    private Integer uiid;

    private String uiphone;

    private String uiaddress;

    private Integer fuid;

    private User user;//表示1对1的关系
    //添加getter和setter以及构造函数


    public Userinfo() {
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "uiid=" + uiid +
                ", uiphone='" + uiphone + '\'' +
                ", uiaddress='" + uiaddress + '\'' +
                ", fuid=" + fuid +
                ", user=" + user +
                ", addTime=" + addTime +
                '}';
    }

    public Userinfo(Integer uiid, Date addTime) {
        this.uiid = uiid;
        this.addTime = addTime;
    }

    public Userinfo(Integer uiid, String uiphone, String uiaddress, Integer fuid, User user, Date addTime) {
        this.uiid = uiid;
        this.uiphone = uiphone;
        this.uiaddress = uiaddress;
        this.fuid = fuid;
        this.user = user;
        this.addTime = addTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private Date addTime;

    public Integer getUiid() {
        return uiid;
    }

    public void setUiid(Integer uiid) {
        this.uiid = uiid;
    }

    public String getUiphone() {
        return uiphone;
    }

    public void setUiphone(String uiphone) {
        this.uiphone = uiphone;
    }

    public String getUiaddress() {
        return uiaddress;
    }

    public void setUiaddress(String uiaddress) {
        this.uiaddress = uiaddress;
    }

    public Integer getFuid() {
        return fuid;
    }

    public void setFuid(Integer fuid) {
        this.fuid = fuid;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}