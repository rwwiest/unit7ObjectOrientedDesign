public class FillInQuestion
{
    // "The inventor of Java was _James Goslin_"
    // parse the specified question into a question to display and
    // an answer to check:
    // question "The inventor of Java was _____"
    // answer: "James Gosling"
    public FillInQuestion()
    {
    }
    
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        
        super.setText(question);
        super.setAnswer(answer);
    }
}
