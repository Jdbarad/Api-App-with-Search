package com.builditcreative.androidapp.api.model;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class Data {

   @SerializedName("agenda_list")
   List<AgendaList> agendaList;

   @SerializedName("category")
   List<Category> category;

   @SerializedName("category_relation")
   List<CategoryRelation> categoryRelation;

   @SerializedName("types")
   List<Types> types;


    public void setAgendaList(List<AgendaList> agendaList) {
        this.agendaList = agendaList;
    }
    public List<AgendaList> getAgendaList() {
        return agendaList;
    }
    
    public void setCategory(List<Category> category) {
        this.category = category;
    }
    public List<Category> getCategory() {
        return category;
    }
    
    public void setCategoryRelation(List<CategoryRelation> categoryRelation) {
        this.categoryRelation = categoryRelation;
    }
    public List<CategoryRelation> getCategoryRelation() {
        return categoryRelation;
    }
    
    public void setTypes(List<Types> types) {
        this.types = types;
    }
    public List<Types> getTypes() {
        return types;
    }
    
}