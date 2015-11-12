/**
*SysDepartment.java
* Copyright(C) 2015 sinosoft
* All rights reserved.
* @Author : plc
*-------------------------------------
* @2015-10-30 Created
*/
package cn.springmvc.model;

import java.io.Serializable;
import java.util.Date;

public class SysDepartment implements Serializable {
    private static final long serialVersionUID = 1L;

    private String fdObjectid;

    private String deptId;

    private String sysCode;

    private String deptName;

    private String deptsId;

    private String roadDist;

    private String contactname;

    private String contactPhone;

    private String officeTel;

    private String officeFax;

    private Object remark;

    private Date updatedate;

    private String isDel;

    private Long sort;

    private String type;

    private String deptmentType;

    public String getFdObjectid() {
        return fdObjectid;
    }

    public void setFdObjectid(String fdObjectid) {
        this.fdObjectid = fdObjectid;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptsId() {
        return deptsId;
    }

    public void setDeptsId(String deptsId) {
        this.deptsId = deptsId;
    }

    public String getRoadDist() {
        return roadDist;
    }

    public void setRoadDist(String roadDist) {
        this.roadDist = roadDist;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getOfficeTel() {
        return officeTel;
    }

    public void setOfficeTel(String officeTel) {
        this.officeTel = officeTel;
    }

    public String getOfficeFax() {
        return officeFax;
    }

    public void setOfficeFax(String officeFax) {
        this.officeFax = officeFax;
    }

    public Object getRemark() {
        return remark;
    }

    public void setRemark(Object remark) {
        this.remark = remark;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeptmentType() {
        return deptmentType;
    }

    public void setDeptmentType(String deptmentType) {
        this.deptmentType = deptmentType;
    }
}