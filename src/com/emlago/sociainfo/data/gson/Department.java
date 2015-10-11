package com.emlago.sociainfo.data.gson;

import com.emlago.sociainfo.data.gson.helpers.IdName;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;

public class Department implements Serializable {
    @SerializedName("concentration")
    private ArrayList<IdName> concentration = new ArrayList<>();
    @SerializedName("school")
    private IdName school = null;
    @SerializedName("type")
    private String type = "";
    @SerializedName("year")
    private IdName year = null;
}