package com.tsinghua.mem.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class taskTable {
    private String taskid;

    private String tasktypeid;

    private String tasktypename;

    private Date taskdate;

    private String platenumber;

    private String taskoper;

    private Integer taskstate;

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid == null ? null : taskid.trim();
    }

    public String getTasktypeid() {
        return tasktypeid;
    }

    public void setTasktypeid(String tasktypeid) {
        this.tasktypeid = tasktypeid == null ? null : tasktypeid.trim();
    }

    public String getTasktypename() {
        return tasktypename;
    }

    public void setTasktypename(String tasktypename) {
        this.tasktypename = tasktypename == null ? null : tasktypename.trim();
    }

    public Date getTaskdate() {
        return taskdate;
    }

    public void setTaskdate(Date taskdate) {
        this.taskdate = taskdate;
    }

    public String getPlatenumber() {
        return platenumber;
    }

    public void setPlatenumber(String platenumber) {
        this.platenumber = platenumber == null ? null : platenumber.trim();
    }

    public String getTaskoper() {
        return taskoper;
    }

    public void setTaskoper(String taskoper) {
        this.taskoper = taskoper == null ? null : taskoper.trim();
    }

    public Integer getTaskstate() {
        return taskstate;
    }

    public void setTaskstate(Integer taskstate) {
        this.taskstate = taskstate;
    }
}