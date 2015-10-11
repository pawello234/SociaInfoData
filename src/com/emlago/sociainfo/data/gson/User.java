package com.emlago.sociainfo.data.gson;

import com.emlago.sociainfo.data.gson.helpers.IdName;
import com.emlago.sociainfo.data.gson.helpers.IdNameCategory;
import com.emlago.sociainfo.data.gson.helpers.NestedArray;
import com.emlago.sociainfo.data.gson.helpers.NestedData;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User extends IdName implements Serializable {
    @SerializedName("first_name")
    private String firstName = "";
    @SerializedName("last_name")
    private String lastName = "";
    @SerializedName("email")
    private String email = "";
    @SerializedName("gender")
    private String gender = "";
    @SerializedName("birthday")
    private String birthday = "";
    @SerializedName("age_range")
    private Age age = new Age();
    @SerializedName("location")
    private IdName location  = new IdName();
    @SerializedName("cover")
    private Cover cover = new Cover();
    @SerializedName("picture")
    private NestedData<Picture> picture = new NestedData<>();
    @SerializedName("books")
    private NestedArray<IdNameCategory> books = new NestedArray<>();
    @SerializedName("movies")
    private NestedArray<IdNameCategory> movies = new NestedArray<>();
    @SerializedName("music")
    private NestedArray<IdNameCategory> music = new NestedArray<>();
    @SerializedName("television")
    private NestedArray<IdNameCategory> television = new NestedArray<>();
    @SerializedName("tagged_places")
    private NestedArray<TaggedPlace> taggedPlaces = new NestedArray<>();
    @SerializedName("education")
    private ArrayList<Department> education = new ArrayList<>();
    @SerializedName("work")
    private ArrayList<Work> work = new ArrayList<>();
    @SerializedName("friends")
    private NestedArray<IdName> friends = new NestedArray<>();
    @SerializedName("family")
    private NestedArray<IdName> family = new NestedArray<>();
    @SerializedName("significant_other")
    private IdName importantPerson = new IdName();
    @SerializedName("relationship_status")
    private String relationshipStatus = "";
    @SerializedName("religion")
    private String religion = "";
    @SerializedName("political")
    private String political = "";
    @SerializedName("languages")
    private ArrayList<IdName> languages = new ArrayList<>();
    @SerializedName("favorite_teams")
    private ArrayList<IdName> favoriteTeams = new ArrayList<>();
    @SerializedName("favorite_athletes")
    private ArrayList<IdName> favoriteAthletes = new ArrayList<>();
    @SerializedName("sports")
    private ArrayList<IdName> sports = new ArrayList<>();
    @SerializedName("interested_in")
    private ArrayList<String> interestedIn = new ArrayList<>();
    @SerializedName("likes")
    private NestedArray<IdNameCategory> likes = new NestedArray<>();
    @SerializedName("posts")
    private NestedArray<Post> posts = new NestedArray<>();
    @SerializedName("events")
    private NestedArray<Event> events = new NestedArray<>();
    @SerializedName("photos")
    private NestedArray<Photo> photos = new NestedArray<>();
    @SerializedName("albums")
    private NestedArray<Album> albums = new NestedArray<>();
}
