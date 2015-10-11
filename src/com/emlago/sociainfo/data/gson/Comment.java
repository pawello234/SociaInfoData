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
public class Comment extends Id implements Serializable {
    @SerializedName("from")
    private IdName from = null;
    @SerializedName("message")
    private String message = "";
    @SerializedName("created_time")
    private String createdTime = "";
    @SerializedName("like_count")
    private Integer likeCount = 0;
    @SerializedName("user_likes")
    private Boolean userLikes = false;
}