package com.mcdev.SpringThymeleafDemo.controllers;

import com.mcdev.SpringThymeleafDemo.objects.Staff;
import com.mcdev.SpringThymeleafDemo.objects.StaffResponse;
import com.mcdev.SpringThymeleafDemo.processors.ServiceExchange;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    Logger logger = LogManager.getLogger(ServiceController.class);


    @Autowired
    ServiceExchange serviceExchange;

    @PostMapping(value = "/addStaff")
    public StaffResponse addStaff(@NonNull @RequestBody Staff staff) {
        logger.info("Adding a new staff...");

        return serviceExchange.addStaff(staff);
    }

    @GetMapping(value = "/getstaff")
    public String getStaff() {
        logger.info("Getting staff");
        return "Hello Staff";
    }
}
