public class TrueFalseFactory implements QuestionFactory {
    public Question createQuestion(QuestionSource source) { return source.getQuestion("True/False"); }
    public QuestionRenderer createRenderer()              { return new TrueFalseRenderer(); }
    public QuestionEvaluator createEvaluator()            { return new TrueFalseEvaluator(); }
}