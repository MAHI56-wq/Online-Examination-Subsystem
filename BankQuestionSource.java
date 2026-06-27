import java.util.*;

public class BankQuestionSource implements QuestionSource {
    private List<Question> pool = QuestionBank.getAll();

    public Question getQuestion(String type) {
        List<Question> filtered = new ArrayList<>();
        for (Question q : pool) {
            if (q.getType().equalsIgnoreCase(type)) filtered.add(q);
        }
        if (filtered.isEmpty()) return pool.get(new Random().nextInt(pool.size()));
        return filtered.get(new Random().nextInt(filtered.size()));
    }

    public String getStrategyName() { return "Question Bank Mode"; }
}