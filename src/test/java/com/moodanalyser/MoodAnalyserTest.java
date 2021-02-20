package com.moodanalyser;

import org.junit.jupiter.api.*;

public class MoodAnalyserTest {
    @Test
    public void moodAnalyseSadTest() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in sad mood");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void moodAnalyseHappyTest() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in happy mood");
        Assertions.assertEquals("HAPPY", mood);
    }
}

