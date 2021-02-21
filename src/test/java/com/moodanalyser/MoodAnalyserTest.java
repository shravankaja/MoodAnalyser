package com.moodanalyser;

import org.junit.jupiter.api.*;
import org.junit.rules.*;


public class MoodAnalyserTest {

    @Test
    public void moodAnalyseTestNull() throws MoodAnalyserException {
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            moodAnalyser.analyseMood();
            Assertions.assertEquals("HAPPY", moodAnalyser.checkMood);
        } catch (MoodAnalyserException e) {

        }
    }
}

