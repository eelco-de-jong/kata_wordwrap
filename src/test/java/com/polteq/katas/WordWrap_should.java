package com.polteq.katas;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jongd on 26-4-2017.
 *
 * TODO:
 * 1. Assert that a word is returned correct | ("tester", 7) >> "tester"
 * 2. Assert that a newline is added correct | ("tester", 3) >> "tes\nter"
 * 3. Assert that a newline is added instead of a space | ("testers test", 9) >> "testers\ntest"
 * 4. Assert that a newline is added on space | ("testers test", 11) >> "testers\ntest"
 * 5. Assert that a mulitple wraps work correct | ("testers test testthingies", 8) >> "testers\ntest\ntestthi\nngies"
 */

public class WordWrap_should {

    @Test
    public void create_class() throws Exception {
        WordWrap wordWrap = new WordWrap();
    }

    @Test
    public void return_word() throws Exception {
        WordWrap wordWrap = new WordWrap();
        assertThat(wordWrap.wrap("tester"), is("tester"));
    }
}
