package org.epss.domain;

import java.util.Date;

public class Info {
    private Integer iid;

    private String iphone;

    private String iaddress;

    private Integer fuid;
    private User user;
    //所有的实体类都应该是：
//    实现  序列化接口，getter和setter方法，空参和全参构造，toString方法


    @Override
    public String toString() {
        return "Info{" +
                "iid=" + iid +
                ", iphone='" + iphone + '\'' +
                ", iaddress='" + iaddress + '\'' +
                ", fuid=" + fuid +
                ", user=" + user +
                ", addTime=" + addTime +
                '}';
    }

    public Info(Integer iid) {
        this.iid = iid;
    }

    public Info() {
    }

    public Info(Integer iid, String iphone, String iaddress, Integer fuid, User user, Date addTime) {
        this.iid = iid;
        this.iphone = iphone;
        this.iaddress = iaddress;
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

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public String getIaddress() {
        return iaddress;
    }

    public void setIaddress(String iaddress) {
        this.iaddress = iaddress;
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