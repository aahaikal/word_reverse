package com.alan.demo.resources;

import com.alan.demo.api.ReverseWord;
import com.google.common.base.Optional;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by alanhaikal on 11/1/15.
 */
public class WordReverseResourceTest {
    private WordReverseResource resource;

    @Before
    public void setup(){

        resource = new WordReverseResource("Izea");
    }

    @Test
    public void returnsReversedWord(){
        ReverseWord word = resource.reverseWord(Optional.of("Test"));
        assert(word.getWord()).contains("tseT");
    }

    @Test
    public void returnsDefaultReversedWord(){
        ReverseWord word = resource.reverseWord(Optional.<String>absent());
        assert(word.getWord()).contains("aezI");
    }

}
