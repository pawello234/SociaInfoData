package com.emlago.sociainfo.data.gson;

import com.emlago.sociainfo.data.gson.helpers.Id;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class TaggedPlace extends Id implements Serializable {
    @SerializedName("created_time")
    private String createdTime = "";
    @SerializedName("place")
    private Place place = null;
}