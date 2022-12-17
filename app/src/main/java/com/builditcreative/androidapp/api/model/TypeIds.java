package com.builditcreative.androidapp.api.model;

import com.google.gson.annotations.SerializedName;

   
public class TypeIds {

   @SerializedName("name")
   String name;

   @SerializedName("color")
   String color;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    
}