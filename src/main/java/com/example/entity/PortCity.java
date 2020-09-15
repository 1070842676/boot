package com.example.entity;

/**
 * @author wangH  为写jdbc导入港口城市所用实体 于202-08-14 在北京特云通
 * @date 2020/8/14 15:35
 */
public class PortCity {
    private String cityName;
    private String citCode;
    private String provinceName;
    private String provinceCode;

    @Override
    public String toString() {
        return "PortCity{" +
                "cityName='" + cityName + '\'' +
                ", citCode='" + citCode + '\'' +
                ", provinceName='" + provinceName + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                '}';
    }

    public PortCity(String cityName, String citCode, String provinceName, String provinceCode) {
        this.cityName = cityName;
        this.citCode = citCode;
        this.provinceName = provinceName;
        this.provinceCode = provinceCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCitCode() {
        return citCode;
    }

    public void setCitCode(String citCode) {
        this.citCode = citCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
}
