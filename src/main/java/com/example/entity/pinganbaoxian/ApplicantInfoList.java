package com.example.entity.pinganbaoxian;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wangH  投保人信息
 * @date 2020/8/18 15:27
 */
public class ApplicantInfoList implements Serializable {

    private static final long serialVersionUID = 2716917968497832760L;
    /**
     * 个团标志,编码值域【1:个人，0:团体】
     */
    private String personnelType;
    /**
     * 投保人名称
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
     * 出生年月 【当为个人时必传】
     */
    private String birthday;
    /**2
     * 年龄
     */
    private Short age;
    /**
     * 性别（男：M，女：F）【当为个人时必传】
     */
    private String sexCode;
    /**
     * 国籍
     */
    private String nationality;
    /**
     * 地址
     */
    private String address;
    /**
     * 邮政编码
     */
    private String postcode;
    /**
     * email
     */
    private String email;
    /**
     * 手机号
     */
    private String mobileTelephone;
    /**
     * 办公电话
     */
    private String officeTelephone;
    /**
     * 家庭电话
     */
    private String homeTelephone;
    /**
     * 发票打印类型 【01普票 02专票 03无需开票】【当为02时才需要传下面六项信息】(需要发票时必传)
     */
    private String invoicePrintType;
    /**
     * 纳税人证件类型（01纳税识别号，02统一社会信用代码）(需要发票时必传)
     */
    private String taxpayerCertificateType;
    /**
     * 纳税人识别号(需要发票时必传)
     */
    private String taxpayerCertificateNo;
    /**
     * 开票地址
     */
    private String billingAddress;
    /**
     * 开票电话
     */
    private String billingPhone;
    /**
     * 开票开户行
     */
    private String billingDepositBank;
    /**
     * 开票开户银行账户
     */
    private String billingDepositBankAccount;
    /**
     * 公司名称
     */
    private String companyName;

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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
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

    public String getInvoicePrintType() {
        return invoicePrintType;
    }

    public void setInvoicePrintType(String invoicePrintType) {
        this.invoicePrintType = invoicePrintType;
    }

    public String getTaxpayerCertificateType() {
        return taxpayerCertificateType;
    }

    public void setTaxpayerCertificateType(String taxpayerCertificateType) {
        this.taxpayerCertificateType = taxpayerCertificateType;
    }

    public String getTaxpayerCertificateNo() {
        return taxpayerCertificateNo;
    }

    public void setTaxpayerCertificateNo(String taxpayerCertificateNo) {
        this.taxpayerCertificateNo = taxpayerCertificateNo;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getBillingPhone() {
        return billingPhone;
    }

    public void setBillingPhone(String billingPhone) {
        this.billingPhone = billingPhone;
    }

    public String getBillingDepositBank() {
        return billingDepositBank;
    }

    public void setBillingDepositBank(String billingDepositBank) {
        this.billingDepositBank = billingDepositBank;
    }

    public String getBillingDepositBankAccount() {
        return billingDepositBankAccount;
    }

    public void setBillingDepositBankAccount(String billingDepositBankAccount) {
        this.billingDepositBankAccount = billingDepositBankAccount;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
