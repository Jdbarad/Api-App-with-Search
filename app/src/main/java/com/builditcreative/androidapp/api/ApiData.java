package com.builditcreative.androidapp.api;

import com.builditcreative.androidapp.api.model.Data;
import com.google.gson.annotations.SerializedName;

   
public class ApiData {

   @SerializedName("success")
   boolean success;

   @SerializedName("data")
   Data data;


    public void setSuccess(boolean success) {
        this.success = success;
    }
    public boolean getSuccess() {
        return success;
    }
    
    public void setData(Data data) {
        this.data = data;
    }
    public Data getData() {
        return data;
    }
    
}