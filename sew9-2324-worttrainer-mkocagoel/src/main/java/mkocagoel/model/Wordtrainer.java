package mkocagoel.model;

public class Wordtrainer {
    private WordList currentWordList;
    private int currentWordIndex;
    private int points;
    private int missedpoints;

    public Wordtrainer(WordList wordList){
        this.currentWordList = wordList;
        this.currentWordIndex = 0;
        this.points = 0;
        this.missedpoints = 0;
    }

    public WordPair getRandomWord(){
        if(this.currentWordList.getSize() == 0){
            return null;
        }
        int randomIndex = (int) (Math.random() * this.currentWordList.getSize());
        this.currentWordIndex = randomIndex;
        return this.currentWordList.getWordPair(randomIndex);
    }
    public void addPoint(){
        this.points++;
    }
    public int getPoints(){
        return this.points;
    }
    public void addMissedPoint(){
        this.missedpoints++;
    }
    public int getMissedPoints(){
        return this.missedpoints;
    }
    public WordPair getCurrentWord(){
        return this.currentWordList.getWordPair(this.currentWordIndex);
    }
    private boolean guess(String guess){
        if(guess.equals(this.getCurrentWord().getWort())){
            this.addPoint();
            return true;
        }
        this.addMissedPoint();
        return false;
    }
    public boolean guess(String guess, boolean caseSensitive){
        if(!caseSensitive){
            guess = guess.toLowerCase();
        }
        return this.guess(guess);
    }
}