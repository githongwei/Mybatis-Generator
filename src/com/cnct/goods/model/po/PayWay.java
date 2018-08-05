package com.cnct.goods.model.po;

public class PayWay {
    /** 支付方式主键 */
    private String payWayId;

    /** 支付名称 */
    private String payWayName;

    public String getPayWayId() {
        return payWayId;
    }

    public void setPayWayId(String payWayId) {
        this.payWayId = payWayId == null ? null : payWayId.trim();
    }

    public String getPayWayName() {
        return payWayName;
    }

    public void setPayWayName(String payWayName) {
        this.payWayName = payWayName == null ? null : payWayName.trim();
    }
}