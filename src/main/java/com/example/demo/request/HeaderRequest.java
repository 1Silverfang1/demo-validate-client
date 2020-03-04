package com.example.demo.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@Getter
@Setter
@ToString
public class HeaderRequest {
    @JsonProperty("country")
    private String country;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("entity")
    private String entity;
    @JsonProperty("system")
    private String system;
    @JsonProperty("subsystem")
    private String subsystem;
    @JsonProperty("operation")
    private String operation;
    @JsonProperty("timestamp")
    private Date timestamp;
    @JsonProperty("msgType")
    private String msgType;
}
