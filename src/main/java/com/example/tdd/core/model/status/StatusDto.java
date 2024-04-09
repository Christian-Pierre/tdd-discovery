package com.example.tdd.core.model.status;

import java.util.Date;;

public class StatusDto {

    private String msgPart;
    private Date datePart;

    public String getMsgPart() {
        return msgPart;
    }
    public void setMsgPart(String msgPart) {
        this.msgPart = msgPart;
    }
    public Date getDatePart() {
        return datePart;
    }
    public void setDatePart(Date datePart) {
        this.datePart = datePart;
    }
 

    
}
