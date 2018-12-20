package com.hebeu.group.pojo;

public class OrderRecord {
    private String cName;

    private String bId;

    private String bName;

    private String orderId;

    private Double bPrice;

    private Integer bNumber;

    private String bImage;

    private Double bTotalcost;

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Double getbPrice() {
        return bPrice;
    }

    public void setbPrice(Double bPrice) {
        this.bPrice = bPrice;
    }

    public Integer getbNumber() {
        return bNumber;
    }

    public void setbNumber(Integer bNumber) {
        this.bNumber = bNumber;
    }

    public String getbImage() {
        return bImage;
    }

    public void setbImage(String bImage) {
        this.bImage = bImage == null ? null : bImage.trim();
    }

    public Double getbTotalcost() {
        return bTotalcost;
    }

    public void setbTotalcost(Double bTotalcost) {
        this.bTotalcost = bTotalcost;
    }
}