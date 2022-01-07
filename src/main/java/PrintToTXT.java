
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PrintToTXT {
    public static void printToTxt(String path0,String path1) throws IOException {
        List<Table> list = GetExcel.getList(path0);
        String path2 = path1 + File.separator;
        String pathname = "";
        File file ;
        BufferedWriter bufferedWriter;
        int m =0;
        for(int i = 0,n; i<list.size();i=i+m){

            if(!list.get(i).getDpname().equals(pathname)){
                pathname = list.get(i).getDpname() + ".txt";
            }

            file = new File(path2+pathname);
            bufferedWriter = new BufferedWriter(new FileWriter(file,true));
            String strTitle = "CREATE TABLE  `" +  list.get(i).getEtablename() + "`  (\n";
            bufferedWriter.write(strTitle);
            System.out.println("CREATE TABLE  `" +  list.get(i).getEtablename() + "`  (" );
            //System.out.println(list.get(i));
            String str0 = list.get(i).getEcolname() + "  " + list.get(i).getDatatype()  + list.get(i).getDatalen() + "  " + list.get(i).getIsnull()
                    + "  COMMENT '" + list.get(i).getCcolname() + "',\n";
            System.out.println(str0);
            bufferedWriter.write(str0);

            for(n=i+1;n<list.size();n++){
                if(list.get(n).getEtablename().equals(list.get(i).getEtablename())){
                    String str = list.get(n).getEcolname() + "  " + list.get(n).getDatatype()  + list.get(n).getDatalen() + "  " + list.get(n).getIsnull()
                            + " COMMENT '" + list.get(n).getCcolname() + "',\n";
                    System.out.println(str);
                    bufferedWriter.write(str);
                    m = n-i+1;

                }else {
                    break;
                }
            }
            String str1 =  " `tongid` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,\n" +
                    "  `op` VARCHAR(30) NULL DEFAULT NULL,\n" +
                    " `tong_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,\n";
            bufferedWriter.write(str1);
            List<String> keys = list.get(i).getKeys();
            String keyVar = "";
            for (int k=0;k<keys.size();k++){
                keyVar = keyVar + "," + keys.get(k);
            }
            keyVar = keyVar.substring(1);
            String str2 = "PRIMARY KEY (`tongid`," + keyVar + ") USING BTREE,\n"
                    + "INDEX `tongid`(`tongid`) USING BTREE,\n"
                    + "INDEX `index`(" +keyVar + ") USING BTREE COMMENT '业务主键',\n"
                    + "INDEX `tablename_index`(`tongid`," + keyVar + ") USING BTREE COMMENT '联合主键'\n"
                    + ") ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '" + list.get(i).getCtablename() + "' ROW_FORMAT = Dynamic;\n\n\n";
            bufferedWriter.write(str2);
            System.out.println(str2);

            bufferedWriter.close();
        }
    }
}
