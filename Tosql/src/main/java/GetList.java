import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetList {
    public static List<Pojo> getExcel(String path) throws IOException {
        //String path = "D://数据导出1.xlsx";
        FileInputStream fis = new FileInputStream(path);
        //获得一个工作簿
        Workbook workbook = new XSSFWorkbook(fis);
        //获得工作表
        Sheet sheet = workbook.getSheet("Sheet1");

        List<Pojo> list = new ArrayList<>();
        //System.out.println(sheet.getPhysicalNumberOfRows());

        for(int i=0; i<sheet.getPhysicalNumberOfRows(); i++){
            String xzqhdm;
            if(sheet.getRow(i).getCell(0) == null){
                xzqhdm = "--";
            }else {
                xzqhdm = sheet.getRow(i).getCell(0).getStringCellValue();
            }

            String jzxq;
            if(sheet.getRow(i).getCell(1) == null){
                jzxq = "--";
            }else {
                jzxq = sheet.getRow(i).getCell(1).getStringCellValue();
            }

            String xxdz;
            if(sheet.getRow(i).getCell(2) == null){
                xxdz = "--";
            }else {
                xxdz = sheet.getRow(i).getCell(2).getStringCellValue();
            }

            String jzdlx ;
            if(sheet.getRow(i).getCell(3) == null){
                jzdlx = "--";
            }else {
                jzdlx = sheet.getRow(i).getCell(3).getStringCellValue();
            }

            String xm;
            if(sheet.getRow(i).getCell(4) == null){
                xm = "--";
            }else {
                xm = sheet.getRow(i).getCell(4).getStringCellValue();
            }

            String xb ;
            if(sheet.getRow(i).getCell(5) == null){
                xb = "--";
            }else {
                xb = sheet.getRow(i).getCell(5).getStringCellValue();
            }

            String sfzh;
            if (sheet.getRow(i).getCell(7) == null){
                sfzh = "-";
            }else {
                sfzh = sheet.getRow(i).getCell(7).getStringCellValue();
            }

            String pd;
            if (sheet.getRow(i).getCell(6) == null){
                pd = "-";
            }else {
                pd = (int) sheet.getRow(i).getCell(6).getNumericCellValue() + "";
            }



            list.add(new Pojo(xzqhdm,jzxq,xxdz,jzdlx,xm,xb,pd,sfzh));

        }
        System.out.println(list.get(list.size()-1));
        /*//String xzqhdm = sheet.getRow(0).getCell(0).getStringCellValue();
        String numericCellValue = (int)sheet.getRow(0).getCell(0).getNumericCellValue() + "";
        System.out.println(numericCellValue);*/
        /*String sfzh = sheet.getRow(0).getCell(7).getStringCellValue();
        //String pd = (int)sheet.getRow(0).getCell(6).getNumericCellValue() + "";
        System.out.println(sfzh);*/




        fis.close();
        return list;
    }
}
