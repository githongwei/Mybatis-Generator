package com.cnct.goods.model.po;

public class PaySource {
    /** 支付来源主键 */
    private String paySourceId;

    /** 支付来源名称 */
    private String paySourceName;

    public String getPaySourceId() {
        return paySourceId;
    }

    public void setPaySourceId(String paySourceId) {
        this.paySourceId = paySourceId == null ? null : paySourceId.trim();
    }

    public String getPaySourceName() {
        return paySourceName;
    }

    public void setPaySourceName(String paySourceName) {
        this.paySourceName = paySourceName == null ? null : paySourceName.trim();
    }
}