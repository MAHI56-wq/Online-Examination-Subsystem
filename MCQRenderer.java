public class MCQRenderer implements QuestionRenderer {
    public void render(Question q) {
        System.out.println("[MCQ] " + q.getText());
    }
}