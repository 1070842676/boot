package com.example.util;

import java.util.Calendar;
import java.util.regex.Pattern;

/**
 * 身份证号工具
 *
 * @author xuaner
 */
public class IdCardUtil {
    /**
     * 获取性别
     *
     * @param idCard
     * @return
     */
    public static String getGender(String idCard) {
        String sex = "1";
        if (idCard.length() == 15) {
            sex = idCard.substring(13, 14);
        } else {
            if (idCard.length() == 18) {
                sex = idCard.substring(16, 17);
            }
        }
        return Integer.parseInt(sex) % 2 == 0 ? "0" : "1";

    }

    /**
     * 获取性别称呼
     *
     * @param idCard 身份证号
     * @return 称呼
     */
    public static String getCallGender(String idCard) {
        String sex = getGender(idCard);
        return sex.equals("0") ? "女士" : "先生";
    }

    public static String getBirthday(String idCard) {
        if (idCard.length() == 15) {
            String a = idCard.substring(6, 12);
            return "19" + a.substring(0, 2) + "-" + a.substring(2, 4) + "-" + a.substring(4);
        } else {
            if (idCard.length() == 18) {
                String a = idCard.substring(6, 14);
                return a.substring(0, 4) + "-" + a.substring(4, 6) + "-" + a.substring(6);
            }
        }
        return "";
    }

    public static boolean checkIdCard(String idCard) {
        String regex = "[1-9]\\d{13,16}[a-zA-Z0-9]{1}";
        return Pattern.matches(regex, idCard);
    }

    public static String evaluate(String sfzjh){

        if(sfzjh == null || "".equals(sfzjh) ){
            return "身份证件号有误,无法计算年龄";
        }

        if (sfzjh.length() != 15 && sfzjh.length() != 18){
            return "身份证件号有误,无法计算年龄";
        }

        String age=null;

        Calendar cal = Calendar.getInstance();
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH)+1;
        int dayNow = cal.get(Calendar.DATE);

        int year = Integer.valueOf(sfzjh.substring(6, 10));
        int month = Integer.valueOf(sfzjh.substring(10,12));
        int day = Integer.valueOf(sfzjh.substring(12,14));

        if ((month < monthNow) || (month == monthNow && day<= dayNow) ){
            age = String.valueOf(yearNow - year);
        }else {
            age = String.valueOf(yearNow - year-1);
        }

        return age;
    }

}	
