import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PrintSql {
    public static void print(String path1,String path2) throws IOException {
        List<Table> list = GetLlist.getExcel(path1);
        File file = new File(path2);
        BufferedWriter bufferedWriter =  new BufferedWriter(new FileWriter(file,true));
        for (int i=0;i<list.size();i++){
            String sql = "insert into `schsmx` (`shi`,`qu`,`jd`,`sq`,`cjdd`,`cjgh`,`sfzh`,`xm`,`xb`,`dh`,`zz`,`cjsj`,`cjrxm`,`cjrdh`)  VALUES ("+
                    "\"" + list.get(i).getShi() +"\",\"" +list.get(i).getQu() + "\",\"" + list.get(i).getJd() + "\",\"" + list.get(i).getSq()
                    + "\",\"" + list.get(i).getCjdd() + "\",\"" + list.get(i).getCjgh() + "\",\"" + list.get(i).getSfzh() + "\",\"" + list.get(i).getXm()
                    + "\",\"" + list.get(i).getXb() + "\",\"" + list.get(i).getDh() + "\",\"" + list.get(i).getZz() + "\",\"" + list.get(i).getCjsj()
                    + "\",\"" + list.get(i).getCjrxm() + "\",\"" + list.get(i).getCjrdh() + "\");\n" ;
            bufferedWriter.write(sql);
        }
        bufferedWriter.close();

    }

    public static void main(String[] args) throws IOException {
        String val = "采集明细_石家庄市_裕华区_全部(2021-01-27 18_00_00至2021-01-27 23_59_59)";

        String path1 = "D:\\tosql\\27号明细\\" + val + ".xlsx";
        String path2 = "D:\\sql\\27\\" + val + ".sql";
        PrintSql.print(path1,path2);
    }
}
