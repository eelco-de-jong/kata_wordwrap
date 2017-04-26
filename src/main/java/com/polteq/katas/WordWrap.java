package com.polteq.katas;

/**
 * Created by jongd on 26-4-2017.
 */
public class WordWrap {

    public String wrap(String sentence, int column) {
        if (sentence.length() > column) {
            String wrap = sentence.substring(0, column);
            sentence = sentence.substring(wrap.length());
            String wrappedSentence = wrap + "\n" + sentence;
            return wrappedSentence;
        } else {
            return sentence;
        }
    }
}
