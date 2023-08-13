package com.tsinghua.mem.pojo;

import lombok.Data;

@Data
public class achiTable {
    private String itemid;

    private String achiid;

    private String achitypeid;

    private String achitypename;

    private String achikey;

    private String achivalue;

    private String achiunit;

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid == null ? null : itemid.trim();
    }

    public String getAchiid() {
        return achiid;
    }

    public void setAchiid(String achiid) {
        this.achiid = achiid == null ? null : achiid.trim();
    }

    public String getAchitypeid() {
        return achitypeid;
    }

    public void setAchitypeid(String achitypeid) {
        this.achitypeid = achitypeid == null ? null : achitypeid.trim();
    }

    public String getAchitypename() {
        return achitypename;
    }

    public void setAchitypename(String achitypename) {
        this.achitypename = achitypename == null ? null : achitypename.trim();
    }

    public String getAchikey() {
        return achikey;
    }

    public void setAchikey(String achikey) {
        this.achikey = achikey == null ? null : achikey.trim();
    }

    public String getAchivalue() {
        return achivalue;
    }

    public void setAchivalue(String achivalue) {
        this.achivalue = achivalue == null ? null : achivalue.trim();
    }

    public String getAchiunit() {
        return achiunit;
    }

    public void setAchiunit(String achiunit) {
        this.achiunit = achiunit == null ? null : achiunit.trim();
    }
}