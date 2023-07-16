import com.bridgelabz.mood_analyzer.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void SadMood(){
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
    String mood = moodAnalyzer.alalyseMood("I am in Sad mood.");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void HappyMood(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.alalyseMood("I am in Any mood.");
        Assert.assertEquals("HAPPY",mood);
    }

}
