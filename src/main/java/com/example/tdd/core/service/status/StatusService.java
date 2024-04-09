package com.example.tdd.core.service.status;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.example.tdd.core.model.status.StatusDto;

@Service
public class StatusService {

    StatusDto status = new StatusDto();
    Date now = new Date();

    public StatusDto getStatusDto(){    
        status.setDatePart(now);
        status.setMsgPart("v1 - Password Generator Api");
        return status;
    }
}
