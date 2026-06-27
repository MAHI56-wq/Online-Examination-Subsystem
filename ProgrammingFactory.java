public class ProgrammingFactory implements QuestionFactory {
    public Question createQuestion(QuestionSource source) { return source.getQuestion("Programming"); }
    public QuestionRenderer createRenderer()              { return new ProgrammingRenderer(); }
    public QuestionEvaluator createEvaluator()            { return new ProgrammingEvaluator(); }
}