package com.moodanalyser;

import org.junit.jupiter.api.*;

public class MoodAnalyserTest {
    @Test
    public void moodAnalyseSadTest() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void moodAnalyseHappyTest() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
}

