package com.mcdev.SpringThymeleafDemo.objects;

import org.springframework.http.HttpStatus;

import java.util.List;

public class StaffResponse {
    private HttpStatus status;
    private String errorMessage;
    private String date;
    private List<Staff> staffs;

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }
}
