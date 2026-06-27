public class ProgrammingEvaluator implements QuestionEvaluator {
    public int evaluate(Question q, String answer) {
        return answer.contains("public") ? q.getPoints() : 0;
    }
}