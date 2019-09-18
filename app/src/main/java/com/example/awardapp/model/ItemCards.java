package com.example.awardapp.model;

public class ItemCards {

    private String voucherAwards;
    private String poinAwards;
    private String giftAwards;
    private String imgAwards;

    public ItemCards(String voucherAwards, String poinAwards, String giftAwards, String imgAwards) {
        this.voucherAwards = voucherAwards;
        this.poinAwards = poinAwards;
        this.giftAwards = giftAwards;
        this.imgAwards = imgAwards;
    }

    public String getVoucherAwards() {
        return voucherAwards;
    }

    public void setVoucherAwards(String voucherAwards) {
        this.voucherAwards = voucherAwards;
    }

    public String getPoinAwards() {
        return poinAwards;
    }

    public void setPoinAwards(String poinAwards) {
        this.poinAwards = poinAwards;
    }

    public String getGiftAwards() {
        return giftAwards;
    }

    public void setGiftAwards(String giftAwards) {
        this.giftAwards = giftAwards;
    }

    public String getImgAwards() {
        return imgAwards;
    }

    public void setImgAwards(String imgAwards) {
        this.imgAwards = imgAwards;
    }
}
