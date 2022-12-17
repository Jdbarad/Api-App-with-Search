package com.builditcreative.androidapp.api.model;

import com.google.gson.annotations.SerializedName;

   
public class Category {

   @SerializedName("Id")
   String Id;

   @SerializedName("event_id")
   String eventId;

   @SerializedName("category_name")
   String categoryName;

   @SerializedName("welcome_screen")
   String welcomeScreen;

   @SerializedName("category_image")
   String categoryImage;

   @SerializedName("created_date")
   String createdDate;

   @SerializedName("show_check_in_time")
   String showCheckInTime;

   @SerializedName("categorie_type")
   String categorieType;

   @SerializedName("sort_order")
   String sortOrder;

   @SerializedName("updated_date")
   String updatedDate;


    public void setId(String Id) {
        this.Id = Id;
    }
    public String getId() {
        return Id;
    }
    
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
    public String getEventId() {
        return eventId;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public String getCategoryName() {
        return categoryName;
    }
    
    public void setWelcomeScreen(String welcomeScreen) {
        this.welcomeScreen = welcomeScreen;
    }
    public String getWelcomeScreen() {
        return welcomeScreen;
    }
    
    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage;
    }
    public String getCategoryImage() {
        return categoryImage;
    }
    
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
    public String getCreatedDate() {
        return createdDate;
    }
    
    public void setShowCheckInTime(String showCheckInTime) {
        this.showCheckInTime = showCheckInTime;
    }
    public String getShowCheckInTime() {
        return showCheckInTime;
    }
    
    public void setCategorieType(String categorieType) {
        this.categorieType = categorieType;
    }
    public String getCategorieType() {
        return categorieType;
    }
    
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }
    public String getSortOrder() {
        return sortOrder;
    }
    
    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }
    public String getUpdatedDate() {
        return updatedDate;
    }
    
}