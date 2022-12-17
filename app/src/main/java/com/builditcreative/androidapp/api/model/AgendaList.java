package com.builditcreative.androidapp.api.model;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class AgendaList {

   @SerializedName("agenda_id")
   String agendaId;

   @SerializedName("Start_date")
   Date StartDate;

   @SerializedName("Start_time")
   String StartTime;

   @SerializedName("End_date")
   Date EndDate;

   @SerializedName("End_time")
   String EndTime;

   @SerializedName("checking_datetime")
   String checkingDatetime;

   @SerializedName("Maximum_People")
   String MaximumPeople;

   @SerializedName("Heading")
   String Heading;

   @SerializedName("Types")
   String Types;

   @SerializedName("Agenda_status")
   String AgendaStatus;

   @SerializedName("Speaker_id")
   String SpeakerId;

   @SerializedName("type_ids")
   List<TypeIds> typeIds;

   @SerializedName("document_id")
   String documentId;

   @SerializedName("presentation_id")
   String presentationId;

   @SerializedName("Address_map")
   String AddressMap;

   @SerializedName("other_types")
   String otherTypes;

   @SerializedName("location")
   String location;

   @SerializedName("short_desc")
   String shortDesc;

   @SerializedName("description")
   String description;

   @SerializedName("Event_show_time_zone")
   String EventShowTimeZone;

   @SerializedName("time_zone")
   String timeZone;

   @SerializedName("Documents")
   String Documents;

   @SerializedName("session_image")
   String sessionImage;

   @SerializedName("show_checking_in")
   String showCheckingIn;

   @SerializedName("speaker")
   String speaker;

   @SerializedName("sponsor")
   String sponsor;

   @SerializedName("chair")
   String chair;

   @SerializedName("survey_id")
   String surveyId;

   @SerializedName("session_tracks")
   String sessionTracks;

   @SerializedName("Address_map_id")
   String AddressMapId;

   @SerializedName("Map_title")
   String MapTitle;

   @SerializedName("tname")
   String tname;

   @SerializedName("type_id")
   String typeId;

   @SerializedName("sort_order")
   String sortOrder;

   @SerializedName("is_on_demand")
   String isOnDemand;

   @SerializedName("timestamp")
   int timestamp;

   @SerializedName("is_saved")
   String isSaved;


    public void setAgendaId(String agendaId) {
        this.agendaId = agendaId;
    }
    public String getAgendaId() {
        return agendaId;
    }
    
    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }
    public Date getStartDate() {
        return StartDate;
    }
    
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }
    public String getStartTime() {
        return StartTime;
    }
    
    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }
    public Date getEndDate() {
        return EndDate;
    }
    
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }
    public String getEndTime() {
        return EndTime;
    }
    
    public void setCheckingDatetime(String checkingDatetime) {
        this.checkingDatetime = checkingDatetime;
    }
    public String getCheckingDatetime() {
        return checkingDatetime;
    }
    
    public void setMaximumPeople(String MaximumPeople) {
        this.MaximumPeople = MaximumPeople;
    }
    public String getMaximumPeople() {
        return MaximumPeople;
    }
    
    public void setHeading(String Heading) {
        this.Heading = Heading;
    }
    public String getHeading() {
        return Heading;
    }
    
    public void setTypes(String Types) {
        this.Types = Types;
    }
    public String getTypes() {
        return Types;
    }
    
    public void setAgendaStatus(String AgendaStatus) {
        this.AgendaStatus = AgendaStatus;
    }
    public String getAgendaStatus() {
        return AgendaStatus;
    }
    
    public void setSpeakerId(String SpeakerId) {
        this.SpeakerId = SpeakerId;
    }
    public String getSpeakerId() {
        return SpeakerId;
    }
    
    public void setTypeIds(List<TypeIds> typeIds) {
        this.typeIds = typeIds;
    }
    public List<TypeIds> getTypeIds() {
        return typeIds;
    }
    
    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
    public String getDocumentId() {
        return documentId;
    }
    
    public void setPresentationId(String presentationId) {
        this.presentationId = presentationId;
    }
    public String getPresentationId() {
        return presentationId;
    }
    
    public void setAddressMap(String AddressMap) {
        this.AddressMap = AddressMap;
    }
    public String getAddressMap() {
        return AddressMap;
    }
    
    public void setOtherTypes(String otherTypes) {
        this.otherTypes = otherTypes;
    }
    public String getOtherTypes() {
        return otherTypes;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
    
    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }
    public String getShortDesc() {
        return shortDesc;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    
    public void setEventShowTimeZone(String EventShowTimeZone) {
        this.EventShowTimeZone = EventShowTimeZone;
    }
    public String getEventShowTimeZone() {
        return EventShowTimeZone;
    }
    
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
    public String getTimeZone() {
        return timeZone;
    }
    
    public void setDocuments(String Documents) {
        this.Documents = Documents;
    }
    public String getDocuments() {
        return Documents;
    }
    
    public void setSessionImage(String sessionImage) {
        this.sessionImage = sessionImage;
    }
    public String getSessionImage() {
        return sessionImage;
    }
    
    public void setShowCheckingIn(String showCheckingIn) {
        this.showCheckingIn = showCheckingIn;
    }
    public String getShowCheckingIn() {
        return showCheckingIn;
    }
    
    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }
    public String getSpeaker() {
        return speaker;
    }
    
    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }
    public String getSponsor() {
        return sponsor;
    }
    
    public void setChair(String chair) {
        this.chair = chair;
    }
    public String getChair() {
        return chair;
    }
    
    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }
    public String getSurveyId() {
        return surveyId;
    }
    
    public void setSessionTracks(String sessionTracks) {
        this.sessionTracks = sessionTracks;
    }
    public String getSessionTracks() {
        return sessionTracks;
    }
    
    public void setAddressMapId(String AddressMapId) {
        this.AddressMapId = AddressMapId;
    }
    public String getAddressMapId() {
        return AddressMapId;
    }
    
    public void setMapTitle(String MapTitle) {
        this.MapTitle = MapTitle;
    }
    public String getMapTitle() {
        return MapTitle;
    }
    
    public void setTname(String tname) {
        this.tname = tname;
    }
    public String getTname() {
        return tname;
    }
    
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }
    public String getTypeId() {
        return typeId;
    }
    
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }
    public String getSortOrder() {
        return sortOrder;
    }
    
    public void setIsOnDemand(String isOnDemand) {
        this.isOnDemand = isOnDemand;
    }
    public String getIsOnDemand() {
        return isOnDemand;
    }
    
    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }
    public int getTimestamp() {
        return timestamp;
    }
    
    public void setIsSaved(String isSaved) {
        this.isSaved = isSaved;
    }
    public String getIsSaved() {
        return isSaved;
    }
    
}