package com.example.util.xmlimportutil;

import com.example.entity.PortCity;
import com.example.util.DBUtil;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangH
 * @date 2020/8/14 15:13
 */
public class Test {
    public static void main(String[] args) {
        try {
            List<String[]> excel = InsertExcel.getExcel("F:/test.xlsx","港口省份");
            Map<String,String> provice=new HashMap<>();
            for (String[] strings : excel) {
                String s = new BigDecimal(strings[0]).stripTrailingZeros().toPlainString();
                provice.put(s,strings[1]);
                System.out.println(s+"-----"+strings[1]);
            }
            List<String[]> excels = InsertExcel.getExcel("F:/test.xlsx","港口城市");
            List<PortCity> list=new ArrayList<>();
            for (String[] strings : excels) {
                System.out.println(strings.length);
                System.out.println(strings[1]);
                System.out.println(strings[0]);
                PortCity portCity=new PortCity(strings[1],new BigDecimal(strings[0]).stripTrailingZeros().toPlainString(),provice.get(new BigDecimal(strings[2]).stripTrailingZeros().toPlainString()),new BigDecimal(strings[2]).stripTrailingZeros().toPlainString());
                list.add(portCity);
            }
            System.out.println(list.size());
            System.out.println(list);

            String sql = "insert into pingan_port_code(city_name,city_code,province_name,province_code, create_time) values (?, ?,?, ?, ?)";
            Connection conn = null;
            PreparedStatement pstmt = null;
            try {
                conn= DBUtil.getConnection();
                pstmt=conn.prepareStatement(sql);
                for (PortCity portCity : list) {
                    pstmt.setString(1,portCity.getCityName());
                    pstmt.setString(2,portCity.getCitCode());
                    pstmt.setString(3,portCity.getProvinceName());
                    pstmt.setString(4,portCity.getProvinceCode());
                    pstmt.setDate(5,new Date(System.currentTimeMillis()));
                    pstmt.addBatch();
                }
                pstmt.executeBatch();
            }catch (Exception e){
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
