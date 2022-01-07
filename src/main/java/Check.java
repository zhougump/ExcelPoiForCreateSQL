

import java.io.IOException;
import java.util.List;

public class Check {
    public static void checkSql(String path) throws IOException{
        List<Table> list = GetExcel.getList(path);
        int m =0;
        for(int i = 0,n; i<list.size();i=i+m){
            System.out.println("CREATE TABLE  `" +  list.get(i).getEtablename() + "`  (" );
            //System.out.println(list.get(i));
            String str0 = list.get(i).getEcolname() + "  " + list.get(i).getDatatype()  + list.get(i).getDatalen() + "  " + list.get(i).getIsnull()
                    + "  COMMENT '" + list.get(i).getCcolname() + "',";
            System.out.println(str0);
            for(n=i+1;n<list.size();n++){
                if(list.get(n).getEtablename().equals(list.get(i).getEtablename())){
                    String str = list.get(n).getEcolname() + "  " + list.get(n).getDatatype()  + list.get(n).getDatalen() + "  " + list.get(n).getIsnull()
                            + " COMMENT '" + list.get(n).getCcolname() + "',";
                    System.out.println(str);
                    m = n-i+1;

                }else {
                    break;
                }
            }
            String str1 =  " `tongid` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,";
            String str2 = "  `op` VARCHAR(30) NULL DEFAULT NULL,";
            String str3 = " `tong_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,";
            List<String> keys = list.get(i).getKeys();
            String keyVar = "";
            for (int k=0;k<keys.size();k++){
                keyVar = keyVar + "," + keys.get(k);
            }
            keyVar = keyVar.substring(1);
            String str4 = "PRIMARY KEY (`tongid`," + keyVar + ") USING BTREE,";
            String str5 = "INDEX `tongid`(`tongid`) USING BTREE,";
            String str6 = "INDEX `index`(" +keyVar + ") USING BTREE COMMENT '业务主键',";
            String str7 = "INDEX `tablename_index`(`tongid`," + keyVar + ") USING BTREE COMMENT '联合主键'";
            String str8 = ") ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '" + list.get(i).getCtablename() + "' ROW_FORMAT = Dynamic;";
            System.out.println("\n" + str1);
            System.out.println(str2);
            System.out.println(str3);
            System.out.println(str4);
            System.out.println(str5);
            System.out.println(str6);
            System.out.println(str7);
            System.out.println(str8);
            System.out.println("\n\n\n");



        }
    }
}
