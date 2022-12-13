package com.truongmai.springtimezonegradle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
public class TimeController {
    @GetMapping({"/","/world-clock"})
    public String getByTimezone(@RequestParam(name = "city", required = false, defaultValue = "Asia/Ho_Chi_Minh") String city, ModelMap modelMap) {
        Date date = new Date(); // lay thoi gian hien tai
        TimeZone local = TimeZone.getDefault(); // lay ra timezone hien tai
        TimeZone locale = TimeZone.getTimeZone(city); // lay ra timezone cua 1 thanh pho cu the

        long localTime = date.getTime() + (locale.getRawOffset() - local.getRawOffset()); // tinh thoi gian hien tai cua thanh pho cu the
        date.setTime(localTime); // cai dat lai thoi gian cho bien "date" thanh thoi gian hien tai cua 1 thanh pho cu the

        modelMap.addAttribute("city", city);
        modelMap.addAttribute("date", date);

        return "index";
    }
}
