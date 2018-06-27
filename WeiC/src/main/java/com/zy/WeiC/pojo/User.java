package com.zy.WeiC.pojo;

public class User {
    private Integer id;

    private String username;

    private String userpassword;

    private Boolean sex;

    private String email;

    private String userphone;

    private String useraddress;

    private Integer userstatus;

    private Integer usercode;

    private Integer informationcode;

    private String usercreattime;

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

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public Integer getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(Integer userstatus) {
        this.userstatus = userstatus;
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

    public String getUsercreattime() {
        return usercreattime;
    }

    public void setUsercreattime(String usercreattime) {
        this.usercreattime = usercreattime == null ? null : usercreattime.trim();
    }
}