package com.moodanalyser;

public class MoodAnalyser {
    public String message;
    public String checkMood;

    public MoodAnalyser() {

    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message.isEmpty()) {
                emptyMood();
            }
            if (message.contains("sad")) {
                checkMood = "SAD";
            } else {
                checkMood = "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyserException("Please enter some message", ErrorType.NULL);
        } catch (IllegalArgumentException e) {
            throw new MoodAnalyserException("Please do not  enter empty message", ErrorType.EMPTY);
        }
        return checkMood;
    }

    public void emptyMood() {
        throw new IllegalArgumentException();
    }

    public static void main(String Args[]) {
        System.out.println("Welcome to mood Analyser");
    }
}
