package com.alan.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class WordReverseConfiguration extends Configuration {

    @NotEmpty
    @JsonProperty
    private String defaultWord = "Izea";


    public String getDefaultWord(){
        return defaultWord;
    }

}
