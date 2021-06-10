package com.laioffer.job.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

//Your input article has different
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtractResponseItem {
    public List<Extraction> extractions;
}

