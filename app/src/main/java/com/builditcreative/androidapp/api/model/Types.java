package com.builditcreative.androidapp.api.model;

import com.google.gson.annotations.SerializedName;

   
public class Types {

   @SerializedName("type_id")
   String typeId;

   @SerializedName("type_name")
   String typeName;

   @SerializedName("type_color")
   String typeColor;

   @SerializedName("event_id")
   String eventId;

   @SerializedName("order_no")
   String orderNo;

   @SerializedName("created_date")
   String createdDate;

   @SerializedName("updated_date")
   String updatedDate;


    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }
    public String getTypeId() {
        return typeId;
    }
    
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    public String getTypeName() {
        return typeName;
    }
    
    public void setTypeColor(String typeColor) {
        this.typeColor = typeColor;
    }
    public String getTypeColor() {
        return typeColor;
    }
    
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
    public String getEventId() {
        return eventId;
    }
    
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
    public String getOrderNo() {
        return orderNo;
    }
    
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
    public String getCreatedDate() {
        return createdDate;
    }
    
    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }
    public String getUpdatedDate() {
        return updatedDate;
    }
    
}