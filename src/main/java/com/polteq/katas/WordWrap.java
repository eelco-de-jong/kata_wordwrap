package com.polteq.katas;

/**
 * Created by jongd on 26-4-2017.
 */
public class WordWrap {

    public String wrap(String sentence, int column) {
        if (sentence.length() > column) {
            String wrap = getWrap(sentence, column);
            sentence = getRestSentence(sentence, wrap);
            String wrappedSentence = wrap + sentence;
            return wrappedSentence;
        } else {
            return sentence;
        }
    }

    private String wrapOnSpace(String wrap) {
        if(wrap.contains(" ")) {
            wrap = wrap.substring(0, wrap.lastIndexOf(" "));
        }
        return wrap;
    }

    private String getRestSentence(String sentence, String wrap) {
        sentence = sentence.substring(wrap.length() - 1);
        sentence = sentence.trim();
        return sentence;
    }

    private String getWrap(String sentence, int column) {
        String wrap = sentence.substring(0, column);
        wrap = wrap.trim();
        wrap = wrapOnSpace(wrap);
        return wrap + "\n";
    }
}
