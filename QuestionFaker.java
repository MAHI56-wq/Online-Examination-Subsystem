import java.util.*;

public class QuestionFaker {
    private static final String[] DIFFICULTIES = {"Easy", "Medium", "Hard"};
    private static final String[] TOPICS = {
        "encapsulation", "inheritance", "abstraction",
        "polymorphism", "design patterns", "recursion"
    };

    public static Question generate(String type) {
        String diff  = DIFFICULTIES[new Random().nextInt(3)];
        String topic = TOPICS[new Random().nextInt(TOPICS.length)];

        switch (type) {
            case "MCQ":
                return new MCQQuestion("(Auto) Which best describes " + topic + "?", 2, diff);
            case "True/False":
                return new TrueFalseQuestion("(Auto) Is " + topic + " applicable here?", 1, diff);
            case "Essay":
                return new EssayQuestion("(Auto) Discuss: " + topic, 10, diff);
            case "Programming":
                return new ProgrammingQuestion("(Auto) Implement: " + topic, 20, diff);
            default:
                return new MCQQuestion("(Auto) General question on " + topic, 2, diff);
        }
    }
}