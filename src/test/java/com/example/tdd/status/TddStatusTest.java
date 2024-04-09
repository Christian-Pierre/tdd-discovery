package com.example.tdd.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.tdd.core.service.status.StatusService;

@SpringBootTest
public class TddStatusTest {
    @Autowired
    private StatusService statusService;
    
    @Test
    public void testStatus(){        
        Assert.notNull(statusService.getStatusDto().getDatePart(), "Datepart dont be null!");
        Assert.notNull(statusService.getStatusDto().getMsgPart(), "Msgpart dont be null!");
    }

}
