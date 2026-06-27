public class ExamConfiguration {
    String title;
    int duration;
    int passingScore;
    boolean negativeMarking;
    boolean questionShuffle;
    boolean autoSubmit;
    boolean calculatorAllowed;

    private ExamConfiguration() {}

    public static class Builder {
        private ExamConfiguration config = new ExamConfiguration();

        public Builder title(String title)            { config.title = title; return this; }
        public Builder duration(int minutes)          { config.duration = minutes; return this; }
        public Builder passingScore(int score)        { config.passingScore = score; return this; }
        public Builder negativeMarking(boolean val)   { config.negativeMarking = val; return this; }
        public Builder questionShuffle(boolean val)   { config.questionShuffle = val; return this; }
        public Builder autoSubmit(boolean val)        { config.autoSubmit = val; return this; }
        public Builder calculatorAllowed(boolean val) { config.calculatorAllowed = val; return this; }
        public ExamConfiguration build()              { return config; }
    }
}