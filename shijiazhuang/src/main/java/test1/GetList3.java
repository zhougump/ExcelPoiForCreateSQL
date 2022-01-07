package test1;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetList3 {
    public static List<Pojo> getPojo(String path) throws IOException {

        //String path = "D:\\文河社区人口快速调查表1.30.xlsx";
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //获得一个工作簿
        Workbook workbook = null;
        try {
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //获得工作表
        Sheet sheet = workbook.getSheet("Sheet1");
        List<Pojo> list = new ArrayList<>();

        for (int i=3;i<sheet.getPhysicalNumberOfRows();i++){
            String c1 = getV(sheet.getRow(i).getCell(1));
            String c2 = getV(sheet.getRow(i).getCell(2));
            String c3 = getV(sheet.getRow(i).getCell(3));
            String c4 = getV(sheet.getRow(i).getCell(4));
            String c5 = getV(sheet.getRow(i).getCell(5));
            String c6 = getV(sheet.getRow(i).getCell(6));
            String c7 = getV(sheet.getRow(i).getCell(7));
            String c8 = getV(sheet.getRow(i).getCell(8));
            String c9 = getV(sheet.getRow(i).getCell(9));
            String c10 = getV(sheet.getRow(i).getCell(10));
            String c11 = getV(sheet.getRow(i).getCell(11));
            String c12 = getV(sheet.getRow(i).getCell(12));
            String c13 = getV(sheet.getRow(i).getCell(13));
            String c14 = getV(sheet.getRow(i).getCell(14));
            String c15 = getV(sheet.getRow(i).getCell(15));
            String c16 = getV(sheet.getRow(i).getCell(16));
            String c17 = getV(sheet.getRow(i).getCell(17));
            String c18 = getV(sheet.getRow(i).getCell(18));
            String c19 = getV(sheet.getRow(i).getCell(19));
            String c20 = getV(sheet.getRow(i).getCell(20));
            String c21 = getV(sheet.getRow(i).getCell(21));
            String c22 = getV(sheet.getRow(i).getCell(22));
            String c23 = getV(sheet.getRow(i).getCell(23));
            String c24 = getV(sheet.getRow(i).getCell(24));
            String c25 = getV(sheet.getRow(i).getCell(25));
            String c26 = getV(sheet.getRow(i).getCell(26));
            String c27 = getV(sheet.getRow(i).getCell(27));
            String c28 = getV(sheet.getRow(i).getCell(28));
            String c29 = getV(sheet.getRow(i).getCell(29));

            list.add(new Pojo(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29));

        }
        System.out.println(list.get(list.size()-1));

        fis.close();
        return list;

    }

    public static String getV(Cell cell){


        String str;
        if (cell==null){
            str = "";
        }else{
            str = cell.toString();
        }
        if( str.length()>=3 && str.substring(str.length()-2).equals(".0")){
            //System.out.println("这个有小数" + str);
            str = str.substring(0,str.length()-2);

        }
        return str;
    }
}
