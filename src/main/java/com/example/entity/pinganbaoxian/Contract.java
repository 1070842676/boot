package com.example.entity.pinganbaoxian;

import java.util.List;
import java.util.Map;

/**
 * @author wangH  投保参数
 * @date 2020/8/18 15:26
 */
public class Contract {
    /**
     * 投保人信息
     */
    private List<ApplicantInfoList> applicantInfoList;
    /**
     * 被保人信息
     */
    private List<InsurantInfoList> insurantInfoList;
    /**
     *
     */
    private Map<String,Object> baseInfo;
    private Map<String,Object> extendInfo;
    /**
     * 标的组信息
     */
    private List<Map<String,Object>> riskGroupInfoList;
    private Map<String,Object> extendGroupInfo;

    public List<ApplicantInfoList> getApplicantInfoList() {
        return applicantInfoList;
    }

    public void setApplicantInfoList(List<ApplicantInfoList> applicantInfoList) {
        this.applicantInfoList = applicantInfoList;
    }

    public List<InsurantInfoList> getInsurantInfoList() {
        return insurantInfoList;
    }

    public void setInsurantInfoList(List<InsurantInfoList> insurantInfoList) {
        this.insurantInfoList = insurantInfoList;
    }

    public Map<String, Object> getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(Map<String, Object> baseInfo) {
        this.baseInfo = baseInfo;
    }

    public Map<String, Object> getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(Map<String, Object> extendInfo) {
        this.extendInfo = extendInfo;
    }

    public List<Map<String,Object>> getRiskGroupInfoList() {
        return riskGroupInfoList;
    }

    public void setRiskGroupInfoList(List<Map<String,Object>> riskGroupInfoList) {
        this.riskGroupInfoList = riskGroupInfoList;
    }

    public Map<String, Object> getExtendGroupInfo() {
        return extendGroupInfo;
    }

    public void setExtendGroupInfo(Map<String, Object> extendGroupInfo) {
        this.extendGroupInfo = extendGroupInfo;
    }
}
