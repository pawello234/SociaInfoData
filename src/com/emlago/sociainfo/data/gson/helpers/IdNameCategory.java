package com.emlago.sociainfo.data.gson.helpers;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class IdNameCategory extends IdName implements Serializable {
    @SerializedName("category")
    private String category = "";
}