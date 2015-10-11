package com.emlago.sociainfo.data.gson;

import com.emlago.sociainfo.data.gson.helpers.Id;
import com.emlago.sociainfo.data.gson.helpers.IdName;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LatLng extends IdName implements Serializable {
    @SerializedName("city")
    private String city = "";
    @SerializedName("country")
    private String country = "";
    @SerializedName("street")
    private String street = "";
    @SerializedName("zip")
    private String zip = "";
    @SerializedName("latitude")
    private String latitude = "";
    @SerializedName("longitude")
    private String longitude = "";
}