package com.emlago.sociainfo.data.gson;


import com.emlago.sociainfo.data.gson.helpers.Id;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cover extends Id implements Serializable {
    @SerializedName("offset_y")
    private Integer offsetY = 0;
    @SerializedName("offset_x")
    private Integer offsetX = 0;
    @SerializedName("source")
    private String source = "";
}