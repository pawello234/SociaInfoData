package com.emlago.sociainfo.data.gson;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Image implements Serializable {
    @SerializedName("height")
    private String height = "";
    @SerializedName("width")
    private String width = "";
    @SerializedName("source")
    private String source = "";
}