package com.zy.WeiC.pojo;

import java.util.Date;

public class RelationCode {
    private Integer codeId;

    private Integer parentcode;

    private Integer childcode;

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

    public Date getCodeDate() {
        return codeDate;
    }

    public void setCodeDate(Date codeDate) {
        this.codeDate = codeDate;
    }
}