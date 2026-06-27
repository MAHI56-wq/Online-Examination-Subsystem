public class ProgrammingRenderer implements QuestionRenderer {
    public void render(Question q) {
        System.out.println("[Programming] " + q.getText());
    }
}