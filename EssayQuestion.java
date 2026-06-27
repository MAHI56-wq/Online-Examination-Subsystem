public class EssayQuestion implements Question {
    private String text;
    private int points;
    private String difficulty;

    public EssayQuestion(String text, int points, String difficulty) {
        this.text = text;
        this.points = points;
        this.difficulty = difficulty;
    }

    public String getType()       { return "Essay"; }
    public int getPoints()        { return points; }
    public String getDifficulty() { return difficulty; }
    public String getText()       { return text; }
}
