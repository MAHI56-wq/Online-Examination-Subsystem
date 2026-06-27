public class EssayEvaluator implements QuestionEvaluator {
    public int evaluate(Question q, String answer) {
        return answer.length() > 100 ? q.getPoints() : q.getPoints() / 2;
    }
}