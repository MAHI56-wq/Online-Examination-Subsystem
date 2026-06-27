public class MCQEvaluator implements QuestionEvaluator {
    public int evaluate(Question q, String answer) {
        return answer.equalsIgnoreCase("A") ? q.getPoints() : 0;
    }
}