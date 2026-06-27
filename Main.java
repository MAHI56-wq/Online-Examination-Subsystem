import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        // UTF-8 fix for Windows CMD
        System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));

        // STEP 1: Factory Method
        ExamFactory factory = new MidtermExamFactory();
        Exam exam = factory.createExam();

        // STEP 2: Sourcing strategy
        QuestionSource source = new BankQuestionSource();

        // STEP 3: Abstract Factories
        QuestionFactory mcqFactory = new MCQFactory();
        QuestionFactory tfFactory  = new TrueFalseFactory();
        QuestionFactory essayFact  = new EssayFactory();
        QuestionFactory progFact   = new ProgrammingFactory();

        // STEP 4: Builder
        ExamConfiguration config = new ExamConfiguration.Builder()
                .title("OOP Midterm Exam")
                .duration(60)
                .passingScore(50)
                .negativeMarking(true)
                .questionShuffle(true)
                .autoSubmit(true)
                .calculatorAllowed(false)
                .build();

        // STEP 5: Fixed questions — exact order and difficulty
        List<Question> questions = new ArrayList<>();
        questions.add(new MCQQuestion("What is polymorphism in OOP?",                    2, "Medium"));
        questions.add(new MCQQuestion("Which keyword creates an object in Java?",         2, "Easy"));
        questions.add(new EssayQuestion("Explain the SOLID principles in detail.",       10, "Hard"));
        questions.add(new ProgrammingQuestion("Write a method to reverse a linked list.", 20, "Hard"));
        questions.add(new TrueFalseQuestion("Java supports multiple inheritance.",         1, "Easy"));

        // STEP 6: Print dashboard
        printDashboard(exam, config, source, questions);
    }

    static void printDashboard(Exam exam, ExamConfiguration cfg,
                               QuestionSource source, List<Question> questions) {

        String line  = "=====================================================================";
        String tick  = "✓";
        String cross = "✗";

        System.out.println(line);
        System.out.println("                     EXAM CREATED SUCCESSFULLY");
        System.out.println(line);
        System.out.println("Type:        " + exam.getType());
        System.out.println("Title:       " + cfg.title);
        System.out.println("Duration:    " + cfg.duration + " minutes");
        System.out.println("Passing Score:  " + cfg.passingScore + " Marks");
        System.out.println("Configuration Profiles:");
        System.out.println("  " + (cfg.negativeMarking   ? tick  : cross) + " Negative Marking Enabled");
        System.out.println("  " + (cfg.questionShuffle   ? tick  : cross) + " Question Shuffle Activated");
        System.out.println("  " + (cfg.calculatorAllowed ? tick  : cross) + " Embedded Calculator Allowed");
        System.out.println("  " + (cfg.autoSubmit        ? tick  : cross) + " Auto-Submit On Timeout");
        System.out.println("Question Sourcing Strategy: " + source.getStrategyName());
        System.out.println("Compiled Structural Components:");
        for (Question q : questions) {
            System.out.printf("  - [Type: %-13s Points: %-3d Difficulty: %s%n",
                    q.getType() + "]", q.getPoints(), q.getDifficulty());
        }
        System.out.println(line);
    }
}