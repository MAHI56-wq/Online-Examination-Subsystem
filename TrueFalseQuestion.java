public class TrueFalseQuestion implements Question {
    private String text;
    private int points;
    private String difficulty;

    public TrueFalseQuestion(String text, int points, String difficulty) {
        this.text = text;
        this.points = points;
        this.difficulty = difficulty;
    }

    public String getType()       { return "True/False"; }
    public int getPoints()        { return points; }
    public String getDifficulty() { return difficulty; }
    public String getText()       { return text; }
}