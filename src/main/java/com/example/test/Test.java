package com.example.test;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSONObject;
import com.example.entity.pinganbaoxian.*;
import com.example.util.IdCardUtil;
import com.example.util.TimeUtil;
import com.example.util.httputil.HttpUtils;
import com.tyt.service.common.snowflake.SnowflakeId;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author wangH
 * @date 2020/4/17 18:22
 */
public class Test {

    private String url = "https://test-api.pingan.com.cn:20443/oauth/oauth2/access_token";
    private String charset = "utf-8";

    public static void main(String[] args) {
        Map<String,Object> map=new HashMap<>();
        map.put("partnerName","P_BJBLD");
        map.put("departmentCode","224");
        map.put("transferCode","APPLY");
        map.put("schemeName","");

        map.put("transSerialNo", SnowflakeId.generateId());
        Contract contract=new Contract();
        //投保人信息
        ApplicantInfoList applicantInfoList=new ApplicantInfoList();
        applicantInfoList.setPersonnelType("1");
        applicantInfoList.setName("王衡");
        applicantInfoList.setCertificateType("01");
        applicantInfoList.setCertificateNo("372922199303297379");
        applicantInfoList.setLinkManName("王衡");
        applicantInfoList.setBirthday(IdCardUtil.getBirthday("372922199303297379"));
        applicantInfoList.setSexCode(IdCardUtil.getGender("372922199303297379").equals(1) ? "M" : "F");
        applicantInfoList.setAge(Short.parseShort(IdCardUtil.evaluate("372922199303297379")));
        applicantInfoList.setNationality("中国");
        applicantInfoList.setAddress("暂无");
        applicantInfoList.setMobileTelephone("17610365096");
        //被保人信息
        InsurantInfoList insurantInfoList=new InsurantInfoList();
        insurantInfoList.setPersonnelType("1");
        insurantInfoList.setName("王衡");
        insurantInfoList.setCertificateType("01");
        insurantInfoList.setCertificateNo("372922199303297379");
        insurantInfoList.setLinkManName("王衡");
        insurantInfoList.setBirthday(IdCardUtil.getBirthday("372922199303297379"));
        insurantInfoList.setSexCode(IdCardUtil.getGender("372922199303297379").equals(1) ? "M" : "F");
        insurantInfoList.setAge(Short.parseShort(IdCardUtil.evaluate("372922199303297379")));
        insurantInfoList.setAddress("暂无");
        insurantInfoList.setMobileTelephone("17610365096");
        //baseInfo
        Map<String,Object> baseInfo=new HashMap<>();
        baseInfo.put("productCode","MP09110010");
        baseInfo.put("inputNetworkFlag","internet");
        baseInfo.put("totalInsuredAmount",new Double("1000000"));
        baseInfo.put("expectRate","0.02");
        baseInfo.put("dataSource","openApi");
        baseInfo.put("inputBy","王衡");
        //extendInfo
        Map<String,Object> extendInfo=new HashMap<>();
        extendInfo.put("isPolicyBeforePayfee","1");
        //riskGroupInfoList 标的组信息
        List<Map<String,Object>> riskGroupInfoList=new ArrayList<>();
        Map<String,Object> riskPropertyInfoList= new HashMap<>();
        List<Map<String,Object>> riskPropertyInfo=new ArrayList<>();
        Map<String,Object> riskPropertyMap=new HashMap<>();
        riskPropertyMap.put("cargoBigType","17");
        riskPropertyMap.put("cargoDetailType","8608");
        riskPropertyMap.put("conveyanceType","01");
        riskPropertyMap.put("cargoRiskDepict","挖掘机");
        Map<String,Object> cargoPort=new HashMap<>();
        cargoPort.put("startPortProvince","130000");
        cargoPort.put("startPortCity","130200");
        cargoPort.put("startPortDepict","河北省唐山市");
        cargoPort.put("terminiProvince","210000");
        cargoPort.put("terminiCity","210100");
        cargoPort.put("terminiDepict","辽宁省沈阳市");
        //途经港可为空
        //cargoPort.put("approachPortDepict","openApi");
        riskPropertyMap.put("cargoPort",cargoPort);
        Map<String,Object> riskProperty=new HashMap<>();
        riskProperty.put("riskPropertyMap",riskPropertyMap);
        riskPropertyInfo.add(riskProperty);
        riskPropertyInfoList.put("riskPropertyInfoList",riskPropertyInfo);
        //planInfoList
        Map<String,Object> planInfoList=new HashMap<>();
        List<Map<String,Object>> planInfo=new ArrayList<>();
        Map<String,Object> isMain=new HashMap<>();
        isMain.put("isMain","1");
        isMain.put("planCode","PL0900025");
        planInfo.add(isMain);
        planInfoList.put("planInfoList",planInfo);
        planInfoList.put("riskPropertyInfoList",riskPropertyInfo);
        riskGroupInfoList.add(planInfoList);
        //riskGroupInfoList.add(riskPropertyInfoList);
        //extendGroupInfo
        Map<String,Object> extendGroupInfo=new HashMap<>();
        ExtendDetailMap extendDetailMap=new ExtendDetailMap();
        extendDetailMap.setCargoInfo("挖掘机");
        extendDetailMap.setCasingFashion("f7");
        extendDetailMap.setLicensePlate("冀FP9563");
        extendDetailMap.setConsignorDate("2020-09-27");
        extendDetailMap.setInvoiceMoney(Double.valueOf("1000000"));
        extendDetailMap.setRatePrintFormat("01");
        extendDetailMap.setInsurancePrintFormat("01");
        extendGroupInfo.put("extendDetailMap",extendDetailMap);
        List<ApplicantInfoList> applicantInfo=new ArrayList<>();
        applicantInfo.add(applicantInfoList);
        contract.setApplicantInfoList(applicantInfo);
        List<InsurantInfoList> insurantInfo=new ArrayList<>();
        insurantInfo.add(insurantInfoList);
        contract.setInsurantInfoList(insurantInfo);

        contract.setBaseInfo(baseInfo);
        contract.setExtendInfo(extendInfo);
        contract.setRiskGroupInfoList(riskGroupInfoList);
        contract.setExtendGroupInfo(extendGroupInfo);
        map.put("contract",contract);
        System.out.println(JSONObject.toJSONString(map));
        String url="https://test-api.pingan.com.cn:20443/open/appsvr/property/openapi/P_BJBLD/applyForFee?access_token=01BE48AB5D244737BFA0471AEFF6FA43&request_id=applyForFee"+System.currentTimeMillis();
        System.out.println(url);
        //String s = HttpUtils.httpsPost(url, map);
        String aa="{\"partnerName\":\"P_BJBLD\",\"departmentCode\":\"224\",\"contract\":{\"applicantInfoList\":[{\"address\":\"测试\",\"age\":27,\"birthday\":\"1993-03-29\",\"certificateNo\":\"372922199303297379\",\"certificateType\":\"01\",\"linkManName\":\"王衡\",\"mobileTelephone\":\"17610365096\",\"name\":\"王衡\",\"nationality\":\"中国\",\"personnelType\":\"1\",\"sexCode\":\"F\"}],\"baseInfo\":{\"totalInsuredAmount\":1000000.0,\"productCode\":\"MP09110010\",\"inputBy\":\"王衡\",\"expectRate\":0.02,\"inputNetworkFlag\":\"internet\",\"dataSource\":\"openApi\"},\"extendGroupInfo\":{\"extendDetailMap\":{\"cargoInfo\":\"34吨铣刨机\",\"casingFashion\":\"f7\",\"consignorDate\":\"2021-08-19\",\"conveyanceNo\":\"35413501493563393\",\"insurancePrintFormat\":\"01\",\"invoiceMoney\":1000000,\"licensePlate\":\"京AAAAAA\",\"ratePrintFormat\":\"01\"}},\"extendInfo\":{\"isPolicyBeforePayfee\":\"1\"},\"insurantInfoList\":[{\"address\":\"测试\",\"age\":27,\"birthday\":\"1993-03-29\",\"certificateType\":\"01\",\"linkManName\":\"王衡\",\"mobileTelephone\":\"17610365096\",\"name\":\"王衡\",\"personnelType\":\"1\",\"sexCode\":\"F\"}],\"riskGroupInfoList\":[{\"riskPropertyInfoList\":[{\"riskPropertyMap\":{\"cargoRiskDepict\":\"34吨铣刨机\",\"cargoPort\":{\"terminiDepict\":\"湖北荆州市石首市荆州市石首市\",\"startPortCity\":\"330700\",\"startPortDepict\":\"浙江金华市婺城区金华市婺城区\",\"startPortProvince\":\"330000\",\"terminiCity\":\"421000\",\"terminiProvince\":\"420000\"},\"cargoBigType\":\"16\",\"cargoDetailType\":\"8429\",\"conveyanceType\":\"01\"}}],\"planInfoList\":[{\"isMain\":\"1\",\"planCode\":\"PL0900024\"}]}]},\"schemeName\":\"\",\"transferCode\":\"APPLY\",\"transSerialNo\":\"35413501493563392\"}";
        System.out.println("ma"+JSONObject.toJSONString(map));
        String s = HttpUtils.doPostJson(url,JSONObject.toJSONString(map));
        System.out.println(s);
        InsureReturn insureReturn = JSONObject.parseObject(s, InsureReturn.class);
        System.out.println(s);
        System.out.println(JSONObject.toJSONString(insureReturn));
    }



}
