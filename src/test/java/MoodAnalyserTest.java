import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {
    @Test
    public void giveMessageContainsSad_ReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("sad");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("sad", mood);

    }

    @Test
    public void giveMessageContainsAny_ReturnsHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("Happy");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Happy",mood);
    }

    @Test
    public void givenNullMoodShouldReturnHappy () {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Happy",mood);
    }
}


                    