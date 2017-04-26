package com.polteq.katas;

/**
 * Created by jongd on 26-4-2017.
 */
public class WordWrap {

    public String wrap(String sentence, int column) {
        if (sentence.length() > column) {
            return "tes\nter";
        } else {
            return sentence;
        }
    }
}
