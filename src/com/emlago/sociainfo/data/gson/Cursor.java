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
public class Cursor extends Id implements Serializable {
    @SerializedName("after")
    private String after = "";
    @SerializedName("before")
    private String before = "";
}