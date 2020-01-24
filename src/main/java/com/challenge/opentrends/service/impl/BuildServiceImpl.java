package com.challenge.opentrends.service.impl;

import com.challenge.opentrends.exception.InvalidCharacterException;
import com.challenge.opentrends.model.Build;
import com.challenge.opentrends.service.BuildService;
import org.springframework.stereotype.Service;

@Service
public class BuildServiceImpl implements BuildService {

    /*
    All this cases could be different exceptions with an specific behaviour but for practical
    i did just only one.
     */
    @Override
    public Boolean validateBuild(Build build) throws InvalidCharacterException {
        if(!build.getName().matches("[a-zA-Z]+")){
            throw new InvalidCharacterException("Invalid name. must be only letters");
        }
        if(!build.getPathRepo().matches("[a-zA-Z\\Q\\\\E]+")){
            throw new InvalidCharacterException("Invalid path. Must be only letters and \\");
        }
        if(!build.getVersion().matches("\\d+\\.\\d+\\.\\d")){
            throw new InvalidCharacterException("Invalid version. Must be in format 0.0.0");
        }
        return true;
    }

}
