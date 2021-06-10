package com.laioffer.job.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

//HistoryRequestBody is used for making POST request to favourite table
public class HistoryRequestBody {
    @JsonProperty("user_id")
    public String userId;

    public Item favorite;

}
