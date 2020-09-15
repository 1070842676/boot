package com.example.entity.pinganbaoxian;

import java.io.Serializable;

/**
 * @author wangH
 * @date 2020/8/20 14:12
 */
public class InsureResult implements Serializable {

    private static final long serialVersionUID = -3615994586262105708L;
    private String applyPolicyNo;
    private String policyNo;
    private String noticeNo;
    private String totalInsuredAmount;
    private String amountCurrencyCode;
    private String totalActualPremium;
    private String premiumCurrencyCode;
    private String insuranceBeginDate;
    private String insuranceEndDate;

    public String getApplyPolicyNo() {
        return applyPolicyNo;
    }

    public void setApplyPolicyNo(String applyPolicyNo) {
        this.applyPolicyNo = applyPolicyNo;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getNoticeNo() {
        return noticeNo;
    }

    public void setNoticeNo(String noticeNo) {
        this.noticeNo = noticeNo;
    }

    public String getTotalInsuredAmount() {
        return totalInsuredAmount;
    }

    public void setTotalInsuredAmount(String totalInsuredAmount) {
        this.totalInsuredAmount = totalInsuredAmount;
    }

    public String getAmountCurrencyCode() {
        return amountCurrencyCode;
    }

    public void setAmountCurrencyCode(String amountCurrencyCode) {
        this.amountCurrencyCode = amountCurrencyCode;
    }

    public String getTotalActualPremium() {
        return totalActualPremium;
    }

    public void setTotalActualPremium(String totalActualPremium) {
        this.totalActualPremium = totalActualPremium;
    }

    public String getPremiumCurrencyCode() {
        return premiumCurrencyCode;
    }

    public void setPremiumCurrencyCode(String premiumCurrencyCode) {
        this.premiumCurrencyCode = premiumCurrencyCode;
    }

    public String getInsuranceBeginDate() {
        return insuranceBeginDate;
    }

    public void setInsuranceBeginDate(String insuranceBeginDate) {
        this.insuranceBeginDate = insuranceBeginDate;
    }

    public String getInsuranceEndDate() {
        return insuranceEndDate;
    }

    public void setInsuranceEndDate(String insuranceEndDate) {
        this.insuranceEndDate = insuranceEndDate;
    }
}
