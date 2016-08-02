package com.primefaces.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Geovanny Mendoza on 24/04/2016.
 */
@ManagedBean
@RequestScoped
public class ServerTimeBean {
    public String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public void updateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        this.time = sdf.format(new Date());
    }
}
