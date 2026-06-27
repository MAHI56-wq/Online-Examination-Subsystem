public class TrueFalseRenderer implements QuestionRenderer {
    public void render(Question q) {
        System.out.println("[True/False] " + q.getText());
    }
}