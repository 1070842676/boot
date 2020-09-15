package com.example.entity.pinganbaoxian;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wangH 被保人信息
 * @date 2020/8/18 15:50
 */
public class InsurantInfoList implements Serializable {

    private static final long serialVersionUID = 6361383920506765543L;
    /**
     * 个团标志（1个人，0团体）
     */
    private String personnelType;
    /**
     * 被保人名称
     */
    private String name;
    /**
     * 证件类型，个人(01：身份证、02：护照、03：军人证、04：港澳通行证，05：驾驶证、06：港澳回乡证或台胞证，07：临时身份证、99：其他)，
     * 团体(01：组织机构代码证、02：税务登记证、03：统一社会信用代码、04：工商营业执照号、99：其他)
     */
    private String certificateType;
    /**
     * 证件号码
     */
    private String certificateNo;
    /**
     * 联系人名称
     */
    private String linkManName;
    /**
     * 出生年月
     */
    private String birthday;
    /**
     * 年龄
     */
    private Short age;
    /**
     * 性别（男：M，女：F）【当为个人时必传】
     */
    private String sexCode;
    /**
     * 地址
     */
    private String address;
    /**
     * 有证编码
     */
    private String postcode;
    /**
     *email
     */
    private String email;
    /**
     * 手机号
     */
    private String mobileTelephone;
    /**
     * 办公号
     */
    private String officeTelephone;
    /**
     * 家庭电话
     */
    private String homeTelephone;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPersonnelType() {
        return personnelType;
    }

    public void setPersonnelType(String personnelType) {
        this.personnelType = personnelType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    public String getLinkManName() {
        return linkManName;
    }

    public void setLinkManName(String linkManName) {
        this.linkManName = linkManName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileTelephone() {
        return mobileTelephone;
    }

    public void setMobileTelephone(String mobileTelephone) {
        this.mobileTelephone = mobileTelephone;
    }

    public String getOfficeTelephone() {
        return officeTelephone;
    }

    public void setOfficeTelephone(String officeTelephone) {
        this.officeTelephone = officeTelephone;
    }

    public String getHomeTelephone() {
        return homeTelephone;
    }

    public void setHomeTelephone(String homeTelephone) {
        this.homeTelephone = homeTelephone;
    }
}
