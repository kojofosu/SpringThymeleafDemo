package com.mcdev.SpringThymeleafDemo.processors;

import com.mcdev.SpringThymeleafDemo.objects.Staff;
import com.mcdev.SpringThymeleafDemo.objects.StaffResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Date;

@Component
public class ServiceExchange {
    Logger logger = LogManager.getLogger(ServiceExchange.class);


    public StaffResponse addStaff(Staff staff) {
        StaffResponse response = new StaffResponse();

        try {
            response.setStaffs(Collections.singletonList(staff));
            response.setStatus(HttpStatus.OK);
        } catch (Exception e) {
            logger.info("Error occurred ", e);
            response.setErrorMessage("Error occurred. Check the logs for details.");
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.setDate(new Date().toString());
        return response;
    }
}
