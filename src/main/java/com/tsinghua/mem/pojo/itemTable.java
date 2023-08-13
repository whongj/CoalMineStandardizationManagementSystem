package com.tsinghua.mem.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class itemTable {
    private String taskid;

    private String itemid;

    private String itemname;

    private String itemtypeid;

    private String itemtypename;

    private Integer itemstate;

    private String itemoper;

    private Date itemdate;

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid == null ? null : taskid.trim();
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public String getItemtypeid() {
        return itemtypeid;
    }

    public void setItemtypeid(String itemtypeid) {
        this.itemtypeid = itemtypeid == null ? null : itemtypeid.trim();
    }

    public String getItemtypename() {
        return itemtypename;
    }

    public void setItemtypename(String itemtypename) {
        this.itemtypename = itemtypename == null ? null : itemtypename.trim();
    }

    public Integer getItemstate() {
        return itemstate;
    }

    public void setItemstate(Integer itemstate) {
        this.itemstate = itemstate;
    }

    public String getItemoper() {
        return itemoper;
    }

    public void setItemoper(String itemoper) {
        this.itemoper = itemoper == null ? null : itemoper.trim();
    }

    public Date getItemdate() {
        return itemdate;
    }

    public void setItemdate(Date itemdate) {
        this.itemdate = itemdate;
    }
}