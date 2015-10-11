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
public class Place extends IdName implements Serializable {
    @SerializedName("location")
    private LatLng location = null;
}