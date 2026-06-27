public class EssayRenderer implements QuestionRenderer {
    public void render(Question q) {
        System.out.println("[Essay] " + q.getText());
    }
}