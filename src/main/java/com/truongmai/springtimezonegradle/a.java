package com.truongmai.springtimezonegradle;

import java.util.Date;
import java.util.TimeZone;

public class a {
    public static void main(String[] args) {
        Date date = new Date(); // lay thoi gian hien tai
        System.out.println("------" + date);

        TimeZone local = TimeZone.getDefault(); // lay ra timezone hien tai
        System.out.println("------" + local);

        TimeZone locale = TimeZone.getTimeZone("Asia/Hong_Kong"); // lay ra timezone cua 1 thanh pho cu the
        System.out.println("------" + locale);

        long localTime = date.getTime() + (locale.getRawOffset() - local.getRawOffset()); // tinh thoi  gian hien tai cua thanh pho cu the
        System.out.println("------" + localTime);

        date.setTime(localTime); // cai dat lai thoi gian cho bien "date" thanh thoi gian hien tai cua 1 thanh pho cu the
        System.out.println("------" + date);


    }
}
