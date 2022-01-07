public class Pojo {
    String xzqhdm, jzxqmc,xxdz,jzlx,xm,xb,sfzh,pd;

    public Pojo(String xzqhdm, String jzxqmc, String xxdz, String jzlx, String xm, String xb, String sfzh, String pd) {
        this.xzqhdm = xzqhdm;
        this.jzxqmc = jzxqmc;
        this.xxdz = xxdz;
        this.jzlx = jzlx;
        this.xm = xm;
        this.xb = xb;
        this.sfzh = sfzh;
        this.pd = pd;
    }

    public Pojo() {
    }

    public String getXzqhdm() {
        return xzqhdm;
    }

    public void setXzqhdm(String xzqhdm) {
        this.xzqhdm = xzqhdm;
    }

    public String getJzxqmc() {
        return jzxqmc;
    }

    public void setJzxqmc(String jzxqmc) {
        this.jzxqmc = jzxqmc;
    }

    public String getXxdz() {
        return xxdz;
    }

    public void setXxdz(String xxdz) {
        this.xxdz = xxdz;
    }

    public String getJzlx() {
        return jzlx;
    }

    public void setJzlx(String jzlx) {
        this.jzlx = jzlx;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getPd() {
        return pd;
    }

    public void setPd(String pd) {
        this.pd = pd;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "xzqhdm='" + xzqhdm + '\'' +
                ", jzxqmc='" + jzxqmc + '\'' +
                ", xxdz='" + xxdz + '\'' +
                ", jzlx='" + jzlx + '\'' +
                ", xm='" + xm + '\'' +
                ", xb='" + xb + '\'' +
                ", sfzh='" + sfzh + '\'' +
                ", pd='" + pd + '\'' +
                '}';
    }
}
