package com.moodanalyser;

import org.junit.jupiter.api.*;

public class MoodAnalyserTest {

    @Test
    public void moodAnalyseTestNull() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
}

