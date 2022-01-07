public class Table {
    private String shi,qu,jd,sq,cjdd,cjgh,sfzh,xb,xm,dh,zz,cjsj,cjrxm,cjrdh;

    public Table() {
    }

    public Table(String shi, String qu, String jd, String sq, String cjdd, String cjgh, String sfzh, String xb, String xm, String dh, String zz, String cjsj, String cjrxm, String cjrdh) {
        this.shi = shi;
        this.qu = qu;
        this.jd = jd;
        this.sq = sq;
        this.cjdd = cjdd;
        this.cjgh = cjgh;
        this.sfzh = sfzh;
        this.xb = xb;
        this.xm = xm;
        this.dh = dh;
        this.zz = zz;
        this.cjsj = cjsj;
        this.cjrxm = cjrxm;
        this.cjrdh = cjrdh;
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi;
    }

    public String getQu() {
        return qu;
    }

    public void setQu(String qu) {
        this.qu = qu;
    }

    public String getJd() {
        return jd;
    }

    public void setJd(String jd) {
        this.jd = jd;
    }

    public String getSq() {
        return sq;
    }

    public void setSq(String sq) {
        this.sq = sq;
    }

    public String getCjdd() {
        return cjdd;
    }

    public void setCjdd(String cjdd) {
        this.cjdd = cjdd;
    }

    public String getCjgh() {
        return cjgh;
    }

    public void setCjgh(String cjgh) {
        this.cjgh = cjgh;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    public String getZz() {
        return zz;
    }

    public void setZz(String zz) {
        this.zz = zz;
    }

    public String getCjsj() {
        return cjsj;
    }

    public void setCjsj(String cjsj) {
        this.cjsj = cjsj;
    }

    public String getCjrxm() {
        return cjrxm;
    }

    public void setCjrxm(String cjrxm) {
        this.cjrxm = cjrxm;
    }

    public String getCjrdh() {
        return cjrdh;
    }

    public void setCjrdh(String cjrdh) {
        this.cjrdh = cjrdh;
    }

    @Override
    public String toString() {
        return "Table{" +
                "shi='" + shi + '\'' +
                ", qu='" + qu + '\'' +
                ", jd='" + jd + '\'' +
                ", sq='" + sq + '\'' +
                ", cjdd='" + cjdd + '\'' +
                ", cjgh='" + cjgh + '\'' +
                ", sfzh='" + sfzh + '\'' +
                ", xb='" + xb + '\'' +
                ", xm='" + xm + '\'' +
                ", dh='" + dh + '\'' +
                ", zz='" + zz + '\'' +
                ", cjsj='" + cjsj + '\'' +
                ", cjrxm='" + cjrxm + '\'' +
                ", cjrdh='" + cjrdh + '\'' +
                '}';
    }
}
