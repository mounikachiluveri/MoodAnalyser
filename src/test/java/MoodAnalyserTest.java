import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalyserSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Iam in sad mood");
        Assert.assertEquals("sad", mood);
    }

    @Test
    public void testMoodAnalyseAnyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood=moodAnalyser.analyseMood("Iam in Any Mood");
        Assert.assertEquals("Happy",mood);
    }
}
