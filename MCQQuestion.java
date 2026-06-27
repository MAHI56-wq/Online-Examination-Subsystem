public class MCQQuestion implements Question {
    private String text;
    private int points;
    private String difficulty;

    public MCQQuestion(String text, int points, String difficulty) {
        this.text = text;
        this.points = points;
        this.difficulty = difficulty;
    }

    public String getType()       { return "MCQ"; }
    public int getPoints()        { return points; }
    public String getDifficulty() { return difficulty; }
    public String getText()       { return text; }
}