package com.challenge.opentrends.service;

import com.challenge.opentrends.exception.InvalidCharacterException;
import com.challenge.opentrends.model.Build;

public interface BuildService {

    Boolean validateBuild(Build build) throws InvalidCharacterException;
}
