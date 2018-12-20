package com.hebeu.group.pojo;

public class Comment {
    private String coId;

    private String bId;

    private String cName;

    private String coMessage;

    private String coTime;

    public String getCoId() {
        return coId;
    }

    public void setCoId(String coId) {
        this.coId = coId == null ? null : coId.trim();
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getCoMessage() {
        return coMessage;
    }

    public void setCoMessage(String coMessage) {
        this.coMessage = coMessage == null ? null : coMessage.trim();
    }

    public String getCoTime() {
        return coTime;
    }

    public void setCoTime(String coTime) {
        this.coTime = coTime == null ? null : coTime.trim();
    }
}