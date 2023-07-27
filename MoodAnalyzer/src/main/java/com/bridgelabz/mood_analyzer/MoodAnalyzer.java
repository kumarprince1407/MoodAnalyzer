package com.bridgelabz.mood_analyzer;

//UC 3 - Step 2: Use an enum to differentiate the mood analysis errors in the MoodAnalyzer class.
public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(){
        this.message="";
    }
    public MoodAnalyzer(String message){
        this.message=message;
    }
    public String alalyseMood(String s)throws MoodAnalysisException{
    try {
        if (message==null ||message.isEmpty()) {
            throw new MoodAnalysisException("Mood should not be null or empty.");
        }else if(message.contains("Sad")){
        return Mood.SAD.toString();
        }
        else {
            return Mood.HAPPY.toString();
        }
    }
    catch (NullPointerException e){
        throw new MoodAnalysisException("Mood should not be null or empty.");
    }
    }
    //enum to differentiate mood analysis errors (for UC3)
    public enum Mood{
        HAPPY, SAD;
    }
}
