/**
*SysUserInfo.java
* Copyright(C) 2015 sinosoft
* All rights reserved.
* @Author : plc
*-------------------------------------
* @2015-11-12 Created
*/
package cn.springmvc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息
 */
public class SysUserInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 唯一标识
     */
    private String fdObjectid;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户名
     */
    private String name;

    /**
     * 显示名称
     */
    private String displayName;

    /**
     * 所属单位编号
     */
    private String unitCode;

    /**
     * 所属区域
     */
    private String area;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户类别
     */
    private String type;

    /**
     * 是否有效
     */
    private String useState;

    /**
     * 用户描述
     */
    private String description;

    /**
     * 用户电话
     */
    private String phone;

    /**
     * 用户Email
     */
    private String email;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建者编号
     */
    private String creatorId;

    /**
     * 用户绑定的IP地址
     */
    private String ipAddress;

    /**
     * 用户性别
     */
    private String gender;

    /**
     * 远特用户ID
     */
    private String refid;

    /**
     * 更新日期
     */
    private Date updatedate;

    /**
     * 删除标识
     */
    private String isDel;

    private String personCode;

    private String superiorCode;

    private String vedioState;

    private String cellphone;

    private String fax;

    private String ipphone;

    private String logintype;

    /**
     * @return 唯一标识
     */
    public String getFdObjectid() {
        return fdObjectid;
    }

    /**
     * @param fdObjectid 
	 *            唯一标识
     */
    public void setFdObjectid(String fdObjectid) {
        this.fdObjectid = fdObjectid;
    }

    /**
     * @return 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId 
	 *            用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return 用户名
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 
	 *            用户名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 显示名称
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @param displayName 
	 *            显示名称
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return 所属单位编号
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * @param unitCode 
	 *            所属单位编号
     */
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    /**
     * @return 所属区域
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area 
	 *            所属区域
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password 
	 *            密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return 用户类别
     */
    public String getType() {
        return type;
    }

    /**
     * @param type 
	 *            用户类别
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return 是否有效
     */
    public String getUseState() {
        return useState;
    }

    /**
     * @param useState 
	 *            是否有效
     */
    public void setUseState(String useState) {
        this.useState = useState;
    }

    /**
     * @return 用户描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description 
	 *            用户描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return 用户电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone 
	 *            用户电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return 用户Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email 
	 *            用户Email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime 
	 *            创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return 创建者编号
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * @param creatorId 
	 *            创建者编号
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * @return 用户绑定的IP地址
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * @param ipAddress 
	 *            用户绑定的IP地址
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * @return 用户性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender 
	 *            用户性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return 远特用户ID
     */
    public String getRefid() {
        return refid;
    }

    /**
     * @param refid 
	 *            远特用户ID
     */
    public void setRefid(String refid) {
        this.refid = refid;
    }

    /**
     * @return 更新日期
     */
    public Date getUpdatedate() {
        return updatedate;
    }

    /**
     * @param updatedate 
	 *            更新日期
     */
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    /**
     * @return 删除标识
     */
    public String getIsDel() {
        return isDel;
    }

    /**
     * @param isDel 
	 *            删除标识
     */
    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    public String getPersonCode() {
        return personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }

    public String getSuperiorCode() {
        return superiorCode;
    }

    public void setSuperiorCode(String superiorCode) {
        this.superiorCode = superiorCode;
    }

    public String getVedioState() {
        return vedioState;
    }

    public void setVedioState(String vedioState) {
        this.vedioState = vedioState;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getIpphone() {
        return ipphone;
    }

    public void setIpphone(String ipphone) {
        this.ipphone = ipphone;
    }

    public String getLogintype() {
        return logintype;
    }

    public void setLogintype(String logintype) {
        this.logintype = logintype;
    }
}