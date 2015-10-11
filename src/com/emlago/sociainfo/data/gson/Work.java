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
public class Work implements Serializable {
    @SerializedName("employer")
    private IdName employer = null;
    @SerializedName("position")
    private IdName position = null;
    @SerializedName("location")
    private IdName location = null;
    @SerializedName("start_date")
    private String startDate = "";
    @SerializedName("end_date")
    private String endDate = "";
}