import java.util.*;

public class QuestionBank {
    private static final List<Question> bank = new ArrayList<>();

    static {
        bank.add(new MCQQuestion("What is polymorphism in OOP?",                   2, "Medium"));
        bank.add(new MCQQuestion("Which keyword creates an object in Java?",        2, "Easy"));
        bank.add(new EssayQuestion("Explain the SOLID principles in detail.",      10, "Hard"));
        bank.add(new ProgrammingQuestion("Write a method to reverse a linked list.", 20, "Hard"));
        bank.add(new TrueFalseQuestion("Java supports multiple inheritance via classes.", 1, "Easy"));
    }

    public static List<Question> getAll() { return bank; }
}