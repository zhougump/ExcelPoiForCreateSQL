

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Execute {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String format = simpleDateFormat.format(new Date());
    String path1 = "D:\\工单测试文件.xlsx";
    String path2 = "D:\\" + format;
    @Test
    public void check() throws IOException {
        Check.checkSql(path1);
    }
    @Test
    public void execute() throws IOException {
        File file = new File(path2);
        file.mkdirs();
        PrintToTXT.printToTxt(path1,path2);
    }

    //删除了自增，添加了send_time字段
    @Test
    public void executeAddSend_time() throws IOException {
        PrintAddSdTime.printToTxt(path1,path2);
    }

}
