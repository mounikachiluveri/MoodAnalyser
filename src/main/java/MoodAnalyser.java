public class MoodAnalyser {
    String message;

    public MoodAnalyser() {
        message="default";
    }
    void MoodAnalyser(String message)
    {
        this.message=message;
    }
    public String analyseMood(String message) {
        return "Happy";
    }

}

