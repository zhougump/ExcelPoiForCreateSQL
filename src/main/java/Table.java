import java.util.List;

//这个类的目的：将Excel表中所需要的的列映射为类中的属性，使用对象来存储每行的数据信息

/*
将EXCEL表中所需要的列映射为一个java类，其中 中文表名、英文表名、主键集合、部门名存储的表的属性，
中文字段名、英文字段名、数据类型、数据长度、是否为空、是否为主键存储着列的属性
 */
public class Table {
    //中文表名
    private String ctablename;
    //英文表名
    private String etablename;
    //中文字段名
    private String ccolname;
    //英文字段名
    private String ecolname;
    //字段的mysql数据类型
    private String datatype;
    //字段的数据长度
    private String datalen;
    //字段是否为主键
    private String iskey;
    //字段是否允许为空值
    private String isnull;
    //一个存储主键的List集合
    private List<String> keys;
    //这张表的所属部门名
    private String dpname;

    public Table() {
    }

    public Table(String ctablename, String etablename, String ccolname, String ecolname, String datatype, String datalen, String isnull, List<String> keys, String dpname) {
        this.ctablename = ctablename;
        this.etablename = etablename;
        this.ccolname = ccolname;
        this.ecolname = ecolname;
        this.datatype = datatype;
        this.datalen = datalen;
        this.isnull = isnull;
        this.keys = keys;
        this.dpname = dpname;
    }

    public String getCtablename() {
        return ctablename;
    }

    public void setCtablename(String ctablename) {
        this.ctablename = ctablename;
    }

    public String getEtablename() {
        return etablename;
    }

    public void setEtablename(String etablename) {
        this.etablename = etablename;
    }

    public String getCcolname() {
        return ccolname;
    }

    public void setCcolname(String ccolname) {
        this.ccolname = ccolname;
    }

    public String getEcolname() {
        return ecolname;
    }

    public void setEcolname(String ecolname) {
        this.ecolname = ecolname;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getDatalen() {
        return datalen;
    }

    public void setDatalen(String datalen) {
        this.datalen = datalen;
    }

    public String getIskey() {
        return iskey;
    }

    public void setIskey(String iskey) {
        this.iskey = iskey;
    }

    public String getIsnull() {
        return isnull;
    }

    public void setIsnull(String isnull) {
        this.isnull = isnull;
    }

    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    public String getDpname() {
        return dpname;
    }

    public void setDpname(String dpname) {
        this.dpname = dpname;
    }

    @Override
    public String toString() {
        return "Table{" +
                "ctablename='" + ctablename + '\'' +
                ", etablename='" + etablename + '\'' +
                ", ccolname='" + ccolname + '\'' +
                ", ecolname='" + ecolname + '\'' +
                ", datatype='" + datatype + '\'' +
                ", datalen='" + datalen + '\'' +
                ", iskey='" + iskey + '\'' +
                ", isnull='" + isnull + '\'' +
                ", keys=" + keys +
                ", dpname='" + dpname + '\'' +
                '}';
    }
}
