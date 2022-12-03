package com.example.uebung1_nicolas_hofmaier.network;

import com.google.gson.annotations.SerializedName;

public class Departure {

    @SerializedName("servingLine")
    private ServingLine servingLine;

    public ServingLine getServingLine() {
        return this.servingLine;
    }

    public void setServingLine(ServingLine servingLine) {
        this.servingLine = servingLine;
    }

    @SerializedName("dateTime")
    private DateTime dateTime;

    public com.example.uebung1_nicolas_hofmaier.network.DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(com.example.uebung1_nicolas_hofmaier.network.DateTime dateTime) {
        this.dateTime = dateTime;
    }
}
