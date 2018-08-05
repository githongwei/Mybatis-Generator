package com.yinhui.limin.model.po;

import java.util.Date;

public class Banner {
    /** 主键 */
    private String bannerId;

    /** 滚动图顺序（00，01，02，03） */
    private String bannerLocation;

    /** 名称 */
    private String bannerName;

    /** 滚动图图片 */
    private String bannerImg;

    /** 链接地址 */
    private String bannerUrl;

    /** 滚动图位置（00，01，02，03） */
    private String bannerPossion;

    /**  */
    private Date createTime;

    /** 状态00正常，01冻结 */
    private String state;

    public String getBannerId() {
        return bannerId;
    }

    public void setBannerId(String bannerId) {
        this.bannerId = bannerId == null ? null : bannerId.trim();
    }

    public String getBannerLocation() {
        return bannerLocation;
    }

    public void setBannerLocation(String bannerLocation) {
        this.bannerLocation = bannerLocation == null ? null : bannerLocation.trim();
    }

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName == null ? null : bannerName.trim();
    }

    public String getBannerImg() {
        return bannerImg;
    }

    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg == null ? null : bannerImg.trim();
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl == null ? null : bannerUrl.trim();
    }

    public String getBannerPossion() {
        return bannerPossion;
    }

    public void setBannerPossion(String bannerPossion) {
        this.bannerPossion = bannerPossion == null ? null : bannerPossion.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}