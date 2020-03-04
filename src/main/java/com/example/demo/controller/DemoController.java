package com.example.demo.controller;


import com.example.demo.request.DemoRequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

@PostMapping(value = "/validate",produces = "application/json",consumes = "application/json")
    public void validateClientApp(@RequestBody DemoRequestBody demoRequestBody)
{
    System.out.println(demoRequestBody.getValidateClient());
    System.out.println(demoRequestBody.getValidateClient().getBodyRequest());
    System.out.println(demoRequestBody.getValidateClient().getHeaderRequest());
    // now here you can use getter method to extract values from the request body
}
}
