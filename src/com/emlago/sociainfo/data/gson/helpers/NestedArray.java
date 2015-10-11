package com.emlago.sociainfo.data.gson.helpers;

import com.emlago.sociainfo.data.gson.Paging;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NestedArray<T> extends Id implements Serializable {
    @SerializedName("data")
    private ArrayList<T> array = new ArrayList<>();
    @SerializedName("paging")
    private Paging paging = null;

    @Override public boolean equals(Object other) {
        return super.equals(other);
    }
}
