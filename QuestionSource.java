public interface QuestionSource {
    Question getQuestion(String type);
    String getStrategyName();
}