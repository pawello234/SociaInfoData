package com.emlago.sociainfo.data.gson;

import com.emlago.sociainfo.data.gson.helpers.Id;
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
public class Post extends Id implements Serializable {
    @SerializedName("object_id")
    String objectId = "";
    @SerializedName("picture")
    String picture = "";
    @SerializedName("from")
    IdName from = null;
    @SerializedName("message")
    String message = "";
    @SerializedName("story")
    String story = "";
    @SerializedName("link")
    String link = "";
    @SerializedName("icon")
    String icon = "";
    @SerializedName("type")
    String type = "";
    @SerializedName("created_time")
    String createdTime = "";
    @SerializedName("with_tags")
    NestedArray<IdName> tags = null;
    @SerializedName("likes")
    NestedArray<IdName> likes = null;
    @SerializedName("comments")
    NestedArray<Comment> comments = null;
}