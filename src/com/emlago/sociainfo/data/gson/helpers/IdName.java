package com.emlago.sociainfo.data.gson.helpers;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class IdName extends Id implements Serializable {
    @SerializedName("name")
    private String name = "";

    public String getName() {
        return name;
    }

    @Override public boolean equals(Object other) {
        if(other == null)
            return false;

        if(!(other instanceof IdName))
            return false;

        IdName idName = (IdName) other;

        if(!idName.getId().equals(this.getId()))
            return false;

        if(!((IdName) other).getName().equals(this.getName()))
            return false;

        return true;
    }

    @Override public int hashCode() {
        int prime = 73;
        int result = 1;

        result += prime * prime + this.getId().hashCode();
        result += prime * prime + this.getName().hashCode();

        return result;
    }
}