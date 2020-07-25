public class MoodAnalyser {

private  String message;
  public MoodAnalyser() {
        this.message = message;
        analyseMood();
    }
    public MoodAnalyser(String message) {
        this.message=message;
    }

    public String analyseMood() {
        try {
            if (message.contains("sad"))
                return "sad";
            return "Happy";
        } catch (NullPointerException e) {
            return "Happy";
        }

    }
}



