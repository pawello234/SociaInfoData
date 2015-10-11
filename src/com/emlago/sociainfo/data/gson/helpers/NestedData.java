package com.emlago.sociainfo.data.gson.helpers;

import com.emlago.sociainfo.data.gson.helpers.Id;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NestedData<T> extends Id implements Serializable {
    @SerializedName("data")
    T data = null;
}