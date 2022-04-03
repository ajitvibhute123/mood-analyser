
/**
 * Purpose -I am in Sad Mood, message in Constructor Should Return SAD
 * 
 * @author Ajit Vibhute
 * @since - 02-04-2022
 *
 */

public class MoodAnalyser {
    public static String message;

    // Constructor
    public MoodAnalyser(String message) {
        this.message = message;
        analyseMood();
    }

    //Getter
    public String getMessage() {
        return message;
    }

    //Setter
    public void setMessage(String message) {
        this.message = message;
    }

    public String analyseMood() {

        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else if (message.toLowerCase().contains("happy")) {
        }
        return "Happy";
    }
}