package com.yinhui.limin.model.po;

import java.util.Date;

public class Settlement {
    /** 结算ID */
    private String settlementId;

    /** 用户id */
    private String userId;

    /** 结算月份  */
    private String settlementMonth;

    /** 收入 */
    private Double income;

    /** 技术服务费 */
    private Double tsf;

    /** 优惠 */
    private Double favourable;

    /** 扣税 */
    private Double tax;

    /** 实际收入 */
    private Double realIncome;

    /** 结算日期 */
    private Date createTime;

    public String getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(String settlementId) {
        this.settlementId = settlementId == null ? null : settlementId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getSettlementMonth() {
        return settlementMonth;
    }

    public void setSettlementMonth(String settlementMonth) {
        this.settlementMonth = settlementMonth == null ? null : settlementMonth.trim();
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Double getTsf() {
        return tsf;
    }

    public void setTsf(Double tsf) {
        this.tsf = tsf;
    }

    public Double getFavourable() {
        return favourable;
    }

    public void setFavourable(Double favourable) {
        this.favourable = favourable;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getRealIncome() {
        return realIncome;
    }

    public void setRealIncome(Double realIncome) {
        this.realIncome = realIncome;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}