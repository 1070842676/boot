package com.example.util.xmlimportutil;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InsertExcel {



    // 记录类的输出信息
    static Log log = LogFactory.getLog(InsertExcel.class);

    /**
     * 解析方法
     *
     * @param file
     * @return
     * @throws Exception
     */
    public static List<String[]> getExcel(String filePath,String sheetName) throws Exception {
        // 创建对Excel工作簿文件的引用
        boolean isExcel2003 = filePath.toLowerCase().endsWith("xls") ? true : false;
        System.out.println(isExcel2003);
        Workbook workbook = null;
        if (isExcel2003) {
            workbook = new HSSFWorkbook(new FileInputStream(new File(filePath)));
        } else {
            workbook = new XSSFWorkbook(new FileInputStream(new File(filePath)));
        }
        // 在Excel文档中，第一张工作表的缺省索引是0
        // 其语句为：
        // HSSFSheet sheet = wookbook.getSheetAt(0);
        Sheet sheet = workbook.getSheet(sheetName);
        // 获取到Excel文件中的所有行数
        int rows = sheet.getPhysicalNumberOfRows();
        System.out.println("rows =" + rows);
        // 遍历行
        List<String[]> list_excel = new ArrayList<String[]>();
        for (int i = 1; i <= rows; i++) {
            // 读取左上端单元格
            Row row = sheet.getRow(i);
            // 行不为空
            if (row != null) {
                // 获取到Excel文件中的所有的列
                int cells = row.getPhysicalNumberOfCells();
                System.out.println("cells =" + cells);
                String value = "";
                // 遍历列
                for (int j = 0; j <= cells; j++) {
                    // 获取到列的值
                    Cell cell = row.getCell(j);
                    if (cell != null) {
                        switch (cell.getCellType()) {
                            case Cell.CELL_TYPE_FORMULA:
                                break;
                            case Cell.CELL_TYPE_NUMERIC:
                                value += cell.getNumericCellValue() + ",";
                                break;
                            case Cell.CELL_TYPE_STRING:
                                value += cell.getStringCellValue() + ",";
                                break;
                            default:
                                value += "0";
                                break;
                        }
                    }
                }
                String[] val = value.split(",");
                list_excel.add(val);
            }
        }
        return list_excel;
    }
}

