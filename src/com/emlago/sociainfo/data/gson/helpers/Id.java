package com.emlago.sociainfo.data.gson.helpers;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Id implements Serializable {
    @SerializedName("id")
    private String id = "";

    public String getId() {
        return id;
    }
}