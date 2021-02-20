package com.moodanalyser;

public class MoodAnalyser {
    public String message;

    public MoodAnalyser() {

    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public static void main(String Args[]) {
        System.out.println("Welcome to mood Analyser");
    }
}
