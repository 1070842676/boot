package com.example.entity.pinganbaoxian;

import java.io.Serializable;

/**
 * @author wangH 平安保险投保借口拓展信息
 * @date 2020/8/18 16:03
 */
public class ExtendDetailMap implements Serializable {

    private static final long serialVersionUID = 4541635344509669697L;
    /**
     *货物介绍(数量、包装、唛头)
     */
    private String cargoInfo;
    /**
     * 包装方式,code编码详见基础数据【包装方式】表
     */
    private String casingFashion;
    /**
     * 提单 运单号
     */
    private String conveyanceNo;
    /**
     * 车牌号 航班等
     */
    private String licensePlate;
    /**
     * 起运日期
     */
    private String consignorDate;
    /**
     * 发票金额
     */
    private Double invoiceMoney;
    /**
     * 赔款偿付地点，当运输方式为【水路】、【铁路】、【航空】必传，【公路】可空
     */
    private String claimPayableAddress;
    /**
     * 船龄
     */
    private String shipAge;
    /**
     * 签单日期打印格式,值域：【0：中文；1：英文】
     */
    private String isCnOrEn;
    /**
     * 起运日期打印格式,值域：【01：中文日期格式；02：English Date Format；03：详见提单；04：AS PER B/L；05：TO BE ADVISED；06：待告知；07：AS PER C/R；08：AS PER AWB
     */
    private String datePrintFormat;
    /**
     * 查看代理人
     */
    private String surveyAgent;
    /**
     * 费率打印格式,值域：【01：实际值；02：按约定；03：AS ARRANGED】
     */
    private String ratePrintFormat;
    /**
     * 保费打印格式,值域：【01：实际值；02：按约定；03：AS ARRANGED】
     */
    private String insurancePrintFormat;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCargoInfo() {
        return cargoInfo;
    }

    public void setCargoInfo(String cargoInfo) {
        this.cargoInfo = cargoInfo;
    }

    public String getCasingFashion() {
        return casingFashion;
    }

    public void setCasingFashion(String casingFashion) {
        this.casingFashion = casingFashion;
    }

    public String getConveyanceNo() {
        return conveyanceNo;
    }

    public void setConveyanceNo(String conveyanceNo) {
        this.conveyanceNo = conveyanceNo;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getConsignorDate() {
        return consignorDate;
    }

    public void setConsignorDate(String consignorDate) {
        this.consignorDate = consignorDate;
    }

    public Double getInvoiceMoney() {
        return invoiceMoney;
    }

    public void setInvoiceMoney(Double invoiceMoney) {
        this.invoiceMoney = invoiceMoney;
    }

    public String getClaimPayableAddress() {
        return claimPayableAddress;
    }

    public void setClaimPayableAddress(String claimPayableAddress) {
        this.claimPayableAddress = claimPayableAddress;
    }

    public String getShipAge() {
        return shipAge;
    }

    public void setShipAge(String shipAge) {
        this.shipAge = shipAge;
    }

    public String getIsCnOrEn() {
        return isCnOrEn;
    }

    public void setIsCnOrEn(String isCnOrEn) {
        this.isCnOrEn = isCnOrEn;
    }

    public String getDatePrintFormat() {
        return datePrintFormat;
    }

    public void setDatePrintFormat(String datePrintFormat) {
        this.datePrintFormat = datePrintFormat;
    }

    public String getSurveyAgent() {
        return surveyAgent;
    }

    public void setSurveyAgent(String surveyAgent) {
        this.surveyAgent = surveyAgent;
    }

    public String getRatePrintFormat() {
        return ratePrintFormat;
    }

    public void setRatePrintFormat(String ratePrintFormat) {
        this.ratePrintFormat = ratePrintFormat;
    }

    public String getInsurancePrintFormat() {
        return insurancePrintFormat;
    }

    public void setInsurancePrintFormat(String insurancePrintFormat) {
        this.insurancePrintFormat = insurancePrintFormat;
    }
}
