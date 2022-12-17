package com.builditcreative.androidapp.api.model;

import com.google.gson.annotations.SerializedName;

   
public class CategoryRelation {

   @SerializedName("Id")
   String Id;

   @SerializedName("agenda_id")
   String agendaId;

   @SerializedName("category_id")
   String categoryId;

   @SerializedName("created_date")
   String createdDate;

   @SerializedName("updated_date")
   String updatedDate;


    public void setId(String Id) {
        this.Id = Id;
    }
    public String getId() {
        return Id;
    }
    
    public void setAgendaId(String agendaId) {
        this.agendaId = agendaId;
    }
    public String getAgendaId() {
        return agendaId;
    }
    
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
    public String getCategoryId() {
        return categoryId;
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