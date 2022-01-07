import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PrintTo {
    public static void sql(String path1,String path2) throws IOException {
        List<Pojo> list = GetList.getExcel(path1);
        File file = new File(path2);
        BufferedWriter bufferedWriter =  new BufferedWriter(new FileWriter(file,true));
        for (int i=0;i<list.size();i++){

            //file = new File(path2);
            //bufferedWriter = new BufferedWriter(new FileWriter(file,true));
            String sql = "insert into test1 " +
                    "(xzqhdm,jzxqmc,xxdz,jzdlx,xm,xb,pd,sfzh) " +
                    "VALUES (" + "\"" + list.get(i).getXzqhdm() + "\",\"" + list.get(i).getJzxqmc() + "\",\"" + list.get(i).getXxdz() + "\",\"" + list.get(i).getJzlx() + "\",\""
                    + list.get(i).getXm() + "\",\"" + list.get(i).getXb() + "\",\"" +list.get(i).getSfzh() + "\",\"" +list.get(i).getPd()  +"\");\n";
            bufferedWriter.write(sql);


        }

        bufferedWriter.close();


    }

    public static void main(String[] args) throws IOException {
        String path1 = "D://数据导出1.xlsx";
        String path2 = "D://sql.sql";
        PrintTo.sql(path1,path2);
    }
}
