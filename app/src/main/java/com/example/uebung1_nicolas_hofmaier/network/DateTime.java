package com.example.uebung1_nicolas_hofmaier.network;

import com.google.gson.annotations.SerializedName;

public class DateTime {
    @SerializedName("hour")
    private String hour;

    @SerializedName("minute")
    private String minute;

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }
}
