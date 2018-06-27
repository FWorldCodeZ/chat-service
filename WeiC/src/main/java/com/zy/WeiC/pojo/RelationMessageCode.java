package com.zy.WeiC.pojo;

import java.util.Date;

public class RelationMessageCode {
    private Integer codeId;

    private Integer parentcode;

    private Integer childcode;

    private String messageinfo;

    private Integer messagestatus;

    private Date codeDate;

    public Integer getCodeId() {
        return codeId;
    }

    public void setCodeId(Integer codeId) {
        this.codeId = codeId;
    }

    public Integer getParentcode() {
        return parentcode;
    }

    public void setParentcode(Integer parentcode) {
        this.parentcode = parentcode;
    }

    public Integer getChildcode() {
        return childcode;
    }

    public void setChildcode(Integer childcode) {
        this.childcode = childcode;
    }

    public String getMessageinfo() {
        return messageinfo;
    }

    public void setMessageinfo(String messageinfo) {
        this.messageinfo = messageinfo == null ? null : messageinfo.trim();
    }

    public Integer getMessagestatus() {
        return messagestatus;
    }

    public void setMessagestatus(Integer messagestatus) {
        this.messagestatus = messagestatus;
    }

    public Date getCodeDate() {
        return codeDate;
    }

    public void setCodeDate(Date codeDate) {
        this.codeDate = codeDate;
    }
}