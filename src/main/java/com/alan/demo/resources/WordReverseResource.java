package com.alan.demo.resources;

import com.alan.demo.api.ReverseWord;
import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Created by alanhaikal on 11/1/15.
 */
@Path("/word")
@Produces(MediaType.APPLICATION_JSON)
public class WordReverseResource {

    private final String defaultWord;

    public WordReverseResource(String defaultWord){
        this.defaultWord = defaultWord;
    }

    @GET
    @Timed
    public ReverseWord reverseWord(@QueryParam("term") Optional<String> term){
        return new ReverseWord(String.format(term.or(defaultWord)));
    }
}
