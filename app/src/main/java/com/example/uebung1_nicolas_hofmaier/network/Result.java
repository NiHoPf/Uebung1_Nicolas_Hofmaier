package com.example.uebung1_nicolas_hofmaier.network;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Result {
    private List<Departure> departureList;

    @SerializedName("departureList")

    public List<Departure> getDepartureList() {
        return departureList;
    }

    public void setDepartureList(List<Departure> departureList) {
        this.departureList = departureList;
    }
}
