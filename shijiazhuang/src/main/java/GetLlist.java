
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetLlist {
    public static List<Table> getExcel(String path) throws IOException {
        //String path = "D:\\tosql\\25明细\\裕华区\\采集明细_石家庄市_裕华区_全部(2021-01-25 00_00_00至2021-01-25 12_00_00).xlsx";
        FileInputStream fis = new FileInputStream(path);
        //获得一个工作簿
        Workbook workbook = new XSSFWorkbook(fis);
        //获得工作表
        Sheet sheet = workbook.getSheet("Sheet1");
        List<Table> list = new ArrayList<>();
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            String shi = sheet.getRow(i).getCell(1).getStringCellValue();
            String qu = sheet.getRow(i).getCell(2).getStringCellValue();
            String jd = sheet.getRow(i).getCell(3).getStringCellValue();
            String sq = sheet.getRow(i).getCell(4).getStringCellValue();
            String cjdd = sheet.getRow(i).getCell(5).getStringCellValue();
            String cjgh = sheet.getRow(i).getCell(6).getStringCellValue();
            String sfzh = sheet.getRow(i).getCell(7).getStringCellValue();
            String xm = sheet.getRow(i).getCell(8).getStringCellValue();
            String xb = sheet.getRow(i).getCell(9).getStringCellValue();
            String dh;
            if (sheet.getRow(i).getCell(10) == null) {
                dh = "";
            } else {
                dh = sheet.getRow(i).getCell(10).getStringCellValue();
            }
            String zz;
            if (sheet.getRow(i).getCell(11) == null) {
                zz = "";
            } else {
                zz = sheet.getRow(i).getCell(11).getStringCellValue();
            }
            String cjsj = sheet.getRow(i).getCell(12).getStringCellValue();
            String cjrxm = sheet.getRow(i).getCell(13).getStringCellValue();
            String cjrdh = sheet.getRow(i).getCell(14).getStringCellValue();

            list.add(new Table(shi, qu, jd, sq, cjdd, cjgh, sfzh, xm, xb, dh, zz, cjsj, cjrxm, cjrdh));

        }
        System.out.println(list.get(list.size() - 1));
        return list;
    }
}
