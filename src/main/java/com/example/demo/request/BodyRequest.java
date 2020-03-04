package com.example.demo.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BodyRequest {
    @JsonProperty("validateClientRequest")
    private ValidateClientRequest validateClientRequest;
}
