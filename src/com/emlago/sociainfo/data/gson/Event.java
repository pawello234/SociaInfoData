package com.emlago.sociainfo.data.gson;

import com.emlago.sociainfo.data.gson.helpers.IdName;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Event extends IdName implements Serializable {
    @SerializedName("start_time")
    private String startTime = "";
    @SerializedName("rsvp_status")
    private String rsvpStatus = "";
    @SerializedName("timezone")
    private String timezone = "";
    @SerializedName("end_time")
    private String endTime = "";
}