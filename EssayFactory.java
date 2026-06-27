public class EssayFactory implements QuestionFactory {
    public Question createQuestion(QuestionSource source) { return source.getQuestion("Essay"); }
    public QuestionRenderer createRenderer()              { return new EssayRenderer(); }
    public QuestionEvaluator createEvaluator()            { return new EssayEvaluator(); }
}