package test2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PringToSql {
    public static void print(String path1, String path2) throws IOException {
        List<Pojo> list = GetList3.getPojo(path1);
        File file = new File(path2);
        BufferedWriter bufferedWriter =  new BufferedWriter(new FileWriter(file,true));
        for (int i=0;i<list.size();i++){
            Pojo pojo = list.get(i);
            String sql = "insert into `t_universal_form_citizen_register_kp_jt` (`FULL_NAME`,`GENDER`,`AGE`,`CERT_TYPE`," +
                    "`ID_CARD_NO`,`IS_NEW`,`MOBILE`,`STREET`,`COMUNITY`,`QUARTER`,`BUILDING`,`UNIT`,`DOOR`,`IS_LOCAL`,`CITIZEN_TYPE`,`CENSUS_NUM`," +
                    "`CENSUS_PROVICE`,`CENSUS_CITY`,`CENSUS_AREA`,`CENSUS_STREET`,`CENSUS_COMMUNITY`,`CENSUS_QUARTER`,`CENSUS_BUILDING`,`CENSUS_UNIT`," +
                    "`CENSUS_DOOR`,`OPERATOR_FULL_NAME`,`OPERATOR_MOBILE`,`CREATE_TIME`) values(" +
                    "\"" + pojo.getC1() + "\",\"" + pojo.getC2() + "\",\"" + pojo.getC3() + "\",\"" + pojo.getC4() + "\",\"" + pojo.getC5() +
                    "\",\"" + pojo.getC6() + "\",\"" + pojo.getC7() + "\",\"" + pojo.getC8()+ "\",\""  + pojo.getC9() + "\",\"" + pojo.getC10() +
                    "\",\"" + pojo.getC11() + "\",\"" + pojo.getC12() + "\",\"" + pojo.getC13() + "\",\"" + pojo.getC14() + "\",\"" + pojo.getC15() +
                    "\",\"" + pojo.getC16() + "\",\"" + pojo.getC17() + "\",\"" + pojo.getC18() + "\",\"" + pojo.getC19() + "\",\"" + pojo.getC20() +
                    "\",\"" + pojo.getC21() + "\",\"" + pojo.getC22() + "\",\"" + pojo.getC23() + "\",\"" + pojo.getC24() + "\",\"" + pojo.getC25() +
                    "\",\"" + pojo.getC26() + "\",\"" + pojo.getC27() + "\",\"" + pojo.getC28() + "\");\n" ;

            bufferedWriter.write(sql);
        }
        bufferedWriter.close();
    }

    public static void main(String[] args) throws IOException {
        String val = "第二种格式-没有居住地类型";

        String path1 = "D:\\" + val + ".xlsx";
        String path2 = "D:\\" + val + ".sql";
        PringToSql.print(path1,path2);
    }
}
