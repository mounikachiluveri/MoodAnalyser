public class MoodAnalyser {
    String message;

    public MoodAnalyser() {
        message = "default";
    }

    public String MoodAnalyser(String message) {
        this.message = message;
        return analyseMood("sad");
    }

    public String analyseMood(String message) {
        return "sad";
    }
}



