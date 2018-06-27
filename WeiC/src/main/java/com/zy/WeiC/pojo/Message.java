package com.zy.WeiC.pojo;

public class Message {
    private Integer id;

    private String username;

    private String message;

    private Integer messagestatus;

    private Integer usercode;

    private Integer informationcode;

    private String messagecreattime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Integer getMessagestatus() {
        return messagestatus;
    }

    public void setMessagestatus(Integer messagestatus) {
        this.messagestatus = messagestatus;
    }

    public Integer getUsercode() {
        return usercode;
    }

    public void setUsercode(Integer usercode) {
        this.usercode = usercode;
    }

    public Integer getInformationcode() {
        return informationcode;
    }

    public void setInformationcode(Integer informationcode) {
        this.informationcode = informationcode;
    }

    public String getMessagecreattime() {
        return messagecreattime;
    }

    public void setMessagecreattime(String messagecreattime) {
        this.messagecreattime = messagecreattime == null ? null : messagecreattime.trim();
    }
}