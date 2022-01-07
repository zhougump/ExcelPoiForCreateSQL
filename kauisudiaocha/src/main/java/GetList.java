import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetList {
    public static void main(String[] args) throws IOException {
        String path = "";
        FileInputStream fis = new FileInputStream(path);
        //获得一个工作簿
        Workbook workbook = new XSSFWorkbook(fis);
        //获得工作表
        Sheet sheet = workbook.getSheet("Sheet1");
        List<Table> list = new ArrayList<>();
        for(fis)
    }
}
