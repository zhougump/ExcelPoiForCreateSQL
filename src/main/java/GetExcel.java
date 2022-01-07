import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetExcel {
    public static List<Table> getList(String path) throws IOException {
        List<Table> list = new ArrayList<Table>();
        FileInputStream fis = new FileInputStream(path);
        //获得一个工作簿
        Workbook workbook = new XSSFWorkbook(fis);
        //获得工作表
        Sheet sheet = workbook.getSheet("归集注册");
        Table table;
        for(int i=1; i<sheet.getPhysicalNumberOfRows(); i++){
            //中文表名
            String ctablename;
            if (sheet.getRow(i).getCell(8) == null){
                ctablename = "";
            }
            else {
                ctablename = sheet.getRow(i).getCell(8).getStringCellValue();
            }

            //英文表名
            String etablename;
            if (sheet.getRow(i).getCell(9) == null){
                etablename = "";
            }else {
                etablename = sheet.getRow(i).getCell(9).getStringCellValue();
            }
            //中文列名
            String ccolname = sheet.getRow(i).getCell(10).getStringCellValue();
            //英文列名
            String ecolname = "`" + sheet.getRow(i).getCell(11).getStringCellValue() + "`";
            //数据类型
            String datatype = sheet.getRow(i).getCell(13).getStringCellValue();
            //数据长度
            String datalen = sheet.getRow(i).getCell(14).getStringCellValue();
            //这也是数据长度，对数据长度进行判断
            String datalen1;

            if (datalen.equals("") || datalen.equals("0") || datatype.equals("TEXT") || datatype.equals("text")
                    || datatype.equals("datetime") || datatype.equals("DATETIME") || datatype.equals("DATE")){
                datalen1 = "";
            }
            else {
                datalen1 = "(" + datalen + ")";
            }

            //判断是否为主键
            String iskey = sheet.getRow(i).getCell(15).getStringCellValue();
            //判断字段是否允许为空
            String isnull = sheet.getRow(i).getCell(16).getStringCellValue();
            //表的所属单位
            String dpname;
            if(sheet.getRow(i).getCell(3) == null){
                dpname = list.get(i-2).getDpname();
            }else {
                dpname = sheet.getRow(i).getCell(3).getStringCellValue();
            }



            //对字段是否为空进行判断操作，根据情况填充为不同的字符
            if(isnull.equals("是")) {
                isnull = "";
            }else if(isnull.equals("否")) {
                isnull = "NOT NULL";
            }
            //创建一个集合用来存放主键
            List<String> keys = new ArrayList<String>();
            //将主键存放在主键集合中
            if(iskey.equals("是")){
                keys.add(ecolname);

            }

            //将所有行全部存放在list集合中
            list.add(new Table(ctablename,etablename,ccolname,ecolname,datatype,datalen1,isnull,keys,dpname));

        }
        fis.close();
        String ctablename0;
        String etablename0;
        String dpname0;
        for(int i = 0; i<list.size();i++){
            ctablename0 = list.get(i).getCtablename();
            etablename0 = list.get(i).getEtablename();
            dpname0 = list.get(i).getDpname();
            for(int n=i+1;n<list.size();n++){
                //判定条件：如果表的第二行的中文表名为空，则执行
                if(list.get(n).getCtablename().equals("")){
                    list.get(n).setCtablename(ctablename0);
                    list.get(n).setEtablename(etablename0);
                    list.get(n).setDpname(dpname0);
                    if (list.get(n-1).getKeys().size()>0){
                        list.get(n).getKeys().addAll(list.get(n-1).getKeys());
                    }
                }else {
                    break;
                }
            }
            //System.out.println("第" + i + "个对象" +list.get(i));
        }
        List<String> key0 = new ArrayList<String>();
        for(int i=list.size()-1;i>=0;i--){
            key0 = list.get(i).getKeys();
            for(int n=i-1;n>=0;n--){
                int len1 = list.get(n).getKeys().size();
                int len2 = list.get(i).getKeys().size();
                String engtname1 = list.get(n).getEtablename();
                String engtname2 = list.get(i).getEtablename();
                if( (len1 <= len2) && (engtname1.equals(engtname2) ) ){
                    list.get(n).setKeys(key0);
                }
                else {
                    break;
                }
            }
        }

        return list;
    }

    public static void main(String[] args) throws IOException {
        String path = "D:\\工单测试文件.xlsx";
        /*List<Table> list = new ArrayList<Table>();
        FileInputStream fis = new FileInputStream(path);
        //1.创建一个工作簿
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("归集注册");

        Cell cell = sheet.getRow(1).getCell(0);
        Comment cellComment = sheet.getCellComment(1, 1);
        String stringCellValue = cell.getStringCellValue();
        System.out.println(stringCellValue);
        int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
        System.out.println(physicalNumberOfRows);
        fis.close();*/
        GetExcel.getList(path);
    }
}

