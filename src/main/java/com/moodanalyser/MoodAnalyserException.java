package com.moodanalyser;
enum ErrorType {

    EMPTY, NULL
}
public class MoodAnalyserException extends Exception {

    public String errorType1;
    public MoodAnalyserException(String message,ErrorType error) {
    super(message);
    System.out.println("Error Type   :"+error);




    }

}
