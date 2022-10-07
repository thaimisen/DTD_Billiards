/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXTENDED;


import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.StringJoiner;

/**
 *
 * @author ADMIN
 */
public class handleTime {
    public static String totalTime(String startTime, String endTime) {
        LocalTime initialTime = LocalTime.parse(startTime);
        LocalTime finalTime = LocalTime.parse(endTime);
        StringJoiner joiner = new StringJoiner(":");
        long hours = initialTime.until(finalTime, ChronoUnit.HOURS);
        initialTime = initialTime.plusHours(hours);
        long minutes = initialTime.until(finalTime, ChronoUnit.MINUTES);
        initialTime = initialTime.plusMinutes(minutes);
        long seconds = initialTime.until(finalTime, ChronoUnit.SECONDS);
        joiner.add(String.valueOf(hours));
        joiner.add(String.valueOf(minutes));
        joiner.add(String.valueOf(seconds));
        return joiner.toString();
    }
    public static String totalPrice(String totalTime,double price){
        DecimalFormat df = new DecimalFormat("#.##");
       String[] time = totalTime.split(":");
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        int seconds = Integer.parseInt(time[2]);
        String result = df.format((hours*price)+(minutes*price/60)+(seconds*price/3600));
        return result;
    }
}
