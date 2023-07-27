package com.bridgelabz.mood_analyzer;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(){
        this.message="";
    }
    public MoodAnalyzer(String message){
        this.message=message;
    }
    public String alalyseMood(String message){
    try {
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
    catch (Exception e){
        return "HAPPY";
    }
    }
//    public static void main(String[] args) {
//        MoodAnalyzer moodAnalyzer1 = new MoodAnalyzer();
//        moodAnalyzer1.alalyseMood();
//    }
}
