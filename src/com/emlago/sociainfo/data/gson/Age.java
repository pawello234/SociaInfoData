package com.emlago.sociainfo.data.gson;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Age implements Serializable {
    @SerializedName("min")
    private Integer min = 0;
    @SerializedName("max")
    private Integer max = 0;
}