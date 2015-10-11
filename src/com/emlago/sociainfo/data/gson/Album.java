package com.emlago.sociainfo.data.gson;

import com.emlago.sociainfo.data.gson.helpers.IdName;
import com.emlago.sociainfo.data.gson.helpers.NestedArray;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Album extends IdName implements Serializable {
    @SerializedName("from")
    private IdName from = null;
    @SerializedName("created_time")
    private String createdTime = "";
    @SerializedName("updated_time")
    private String updatedTime = "";
    @SerializedName("type")
    private String type = "";
    @SerializedName("privacy")
    private String privacy = "";
    @SerializedName("link")
    private String link = "";
    @SerializedName("cover_photo")
    private String coverPhoto = "";
    @SerializedName("description")
    private String description = "";
    @SerializedName("location")
    private String location = "";
    @SerializedName("place")
    private Place place = null;
    @SerializedName("count")
    private Integer count = 0;
    @SerializedName("photos")
    private NestedArray<Photo> photos = null;
    @SerializedName("likes")
    private NestedArray<IdName> likes = null;
    @SerializedName("comments")
    private NestedArray<Comment> comments = null;
}