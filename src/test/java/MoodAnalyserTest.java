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
    public void testMoodAnalyserAnyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Iam in happy mood");
        Assert.assertEquals("Happy", mood);

    }
    @Test
    public void NullMethod() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood(null);
        //Assert.assertEquals("Happy", mood);

    }
}
