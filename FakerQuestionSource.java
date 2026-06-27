public class FakerQuestionSource implements QuestionSource {
    public Question getQuestion(String type) {
        return QuestionFaker.generate(type);
    }
    public String getStrategyName() { return "Faker / Auto-Generator Mode"; }
}