package com.emlago.sociainfo.data.gson;

import com.emlago.sociainfo.data.gson.helpers.IdName;
import com.emlago.sociainfo.data.gson.helpers.NestedArray;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Photo extends IdName implements Serializable {
    @SerializedName("created_time")
    private String createdTime = "";
    @SerializedName("width")
    private String width = "";
    @SerializedName("height")
    private String height = "";
    @SerializedName("link")
    private String link = "";
    @SerializedName("icon")
    private String icon = "";
    @SerializedName("picture")
    private String picture = "";
    @SerializedName("source")
    private String source = "";
    @SerializedName("updated_time")
    private String updatedTime = "";
    @SerializedName("place")
    private Place place = null;
    @SerializedName("from")
    private IdName from = null;
    @SerializedName("images")
    private ArrayList<Image> images = new ArrayList<>();
    @SerializedName("likes")
    private NestedArray<IdName> likes = null;
    @SerializedName("tags")
    private NestedArray<IdName> tags = null;
    @SerializedName("comments")
    private NestedArray<Comment> comments = null;
}