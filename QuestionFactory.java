public interface QuestionFactory {
    Question createQuestion(QuestionSource source);
    QuestionRenderer createRenderer();
    QuestionEvaluator createEvaluator();
}