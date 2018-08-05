package com.sjt.crm.model.po;

public class Overtime {
    /** 主键ID */
    private String overtimeId;

    /** 商机ID */
    private String businessId;

    /** 超时阶段 */
    private String stage;

    /** 超时阶段名称 */
    private String stageName;

    /** 状态（00无效， 01有效） */
    private String status;

    /** 超时次数 */
    private Integer time;

    public String getOvertimeId() {
        return overtimeId;
    }

    public void setOvertimeId(String overtimeId) {
        this.overtimeId = overtimeId == null ? null : overtimeId.trim();
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage == null ? null : stage.trim();
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName == null ? null : stageName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}