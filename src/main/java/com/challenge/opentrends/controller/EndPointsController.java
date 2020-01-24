package com.challenge.opentrends.controller;

import com.challenge.opentrends.exception.InvalidCharacterException;
import com.challenge.opentrends.model.Build;
import com.challenge.opentrends.model.ServiceResponse;
import com.challenge.opentrends.service.BuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class EndPointsController {

    @Autowired
    BuildService buildService;

    @Autowired
    RestTemplate restTemplate;

    @Value("${restService.endpoint}")
    String restServiceEndPoint;

    @RequestMapping(method = RequestMethod.POST, value = "/checkBuild")
    public String initializeRepo(@RequestBody Build build) throws InvalidCharacterException {
        if(buildService.validateBuild(build)){
            //Uncomment to call the proper restService
//            restTemplate.postForObject(restServiceEndPoint, build, ServiceResponse.class);
            return "Valid Build!";
        }
        return "invalid build";
    }

}
