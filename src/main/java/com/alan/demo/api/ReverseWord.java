package com.alan.demo.api;

/**
 * Created by alanhaikal on 11/1/15.
 */
public class ReverseWord {
    private final String word;

    public ReverseWord(String word){
        this.word = word;
    }

    public String getWord(){
        String reversed = new StringBuffer(word).reverse().toString();
        return reversed;
    }
}
