package org.work.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RepeatedLettersTest {

    @Test
    void getRepeatedLetter() {
        Assertions.assertEquals('l', RepeatedLetters.getRepeatedLetter("Hello"));
    }
    @Test
    void getZeroRepeatedLetter(){
        Assertions.assertEquals(0, RepeatedLetters.getRepeatedLetter("cat"));
    }
}