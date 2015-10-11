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
public class Paging extends Id implements Serializable {
    @SerializedName("cursors")
    private Cursor cursors = null;
    @SerializedName("next")
    private String next = "";
    @SerializedName("previous")
    private String previous = "";
}
