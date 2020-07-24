import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {
    @Test
    public void giveMessageContainsSad_ReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Iam in sad mood");
        Assert.assertEquals("sad", mood);

    }

    @Test
    public void giveMessageContainsAny_ReturnsHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Iam in Any mood");
        Assert.assertEquals("Happy",mood);

    }
}


                    