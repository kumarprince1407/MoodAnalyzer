package com.bridgelabz.mood_analyzer;
import com.bridgelabz.mood_analyzer.MoodAnalyzer.Mood;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void SadMood(){
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad mood.");
    try {
        String mood = moodAnalyzer.alalyseMood("I am in sad mood.");
        Assert.assertEquals("SAD", mood);
    }
    catch (MoodAnalysisException e){
        e.printStackTrace();
    }
    }

    @Test
    public void HappyMood(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any mood.");
        try {
            String mood = moodAnalyzer.alalyseMood("I am in sad mood.");
            Assert.assertEquals("HAPPY", mood);
        }
        catch (MoodAnalysisException e){
            e.printStackTrace();
        }
    }
//   @Test
//   public void NullMood(){
//        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
//        try {
//            String mood = moodAnalyzer.alalyseMood();
//            Assert.assertEquals("HAPPY", mood);
//        }
//        catch (MoodAnalysisException e){
//            Assert.assertEquals(MoodAnalysisException.ErrorType.EMPTY_OR_NULL_MOOD,e.getErrorType());
//        }
//    }
//    @Test
//    public void emptyMessage(){
//        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
//        try {
//            moodAnalyzer.alalyseMood();
//        }
//        catch (MoodAnalysisException e) {
//            Assert.assertEquals(MoodAnalyzer.ErrorType.EMPTY_OR_NULL_MOOD, e.getErrorType());
//        }
//        }
    @Test
    public void testSadMood() throws MoodAnalysisException{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.alalyseMood("I am in sad mood.");
        Assert.assertEquals(Mood.SAD.toString(), mood);
    }

    @Test
    public void testHappyMood() throws MoodAnalysisException{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.alalyseMood("I am in any mood.");
        Assert.assertEquals(Mood.HAPPY.toString(),mood);
    }
    @Test(expected = MoodAnalysisException.class)
    public void testNullMood() throws MoodAnalysisException{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        moodAnalyzer.alalyseMood(null);
    }
    @Test
    public void testEmptyMood()throws MoodAnalysisException{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.alalyseMood("");
        Assert.assertEquals(MoodAnalysisException.class, mood);
    }
    }




