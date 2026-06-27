public class MCQFactory implements QuestionFactory {
    public Question createQuestion(QuestionSource source) { return source.getQuestion("MCQ"); }
    public QuestionRenderer createRenderer()              { return new MCQRenderer(); }
    public QuestionEvaluator createEvaluator()            { return new MCQEvaluator(); }
}