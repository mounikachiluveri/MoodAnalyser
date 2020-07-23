public class MoodAnalyser {
    String message;

    public MoodAnalyser() {
        message = "default";
    }

    public void MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(String message) {
        try {
            return "Sad";
        } catch (NullPointerException e) {
            return "Happy";
        }
    }

}

