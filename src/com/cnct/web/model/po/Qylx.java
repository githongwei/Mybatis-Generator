package com.cnct.web.model.po;

public class Qylx {
    /** 主键 */
    private Long id;

    /** 企业类型: 1生产企业，2外贸企业，3一般纳税人，4小规模纳税人，5纯企业所得税纳税人，6双订户，7无效税种 */
    private String qylx;

    /** 企业类型名称 */
    private String qylxmc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQylx() {
        return qylx;
    }

    public void setQylx(String qylx) {
        this.qylx = qylx == null ? null : qylx.trim();
    }

    public String getQylxmc() {
        return qylxmc;
    }

    public void setQylxmc(String qylxmc) {
        this.qylxmc = qylxmc == null ? null : qylxmc.trim();
    }
}