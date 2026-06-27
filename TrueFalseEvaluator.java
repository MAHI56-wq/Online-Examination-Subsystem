public class TrueFalseEvaluator implements QuestionEvaluator {
    public int evaluate(Question q, String answer) {
        return answer.equalsIgnoreCase("True") ? q.getPoints() : 0;
    }
}