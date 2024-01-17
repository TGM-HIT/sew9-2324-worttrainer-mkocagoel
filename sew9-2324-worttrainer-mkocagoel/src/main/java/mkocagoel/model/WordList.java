package mkocagoel.model;

import java.util.HashSet;
import java.util.Set;

/**
 * WordList Klasse
 * Verwaltet eine Liste von WordPairs
 */
public class WordList {
    private Set<WordPair> wordPairs;
    public WordList(){
        wordPairs = new HashSet<WordPair>();
    }
    public void addWordPair(WordPair wordPair){
        this.wordPairs.add(wordPair);
    }
    public Set<WordPair> getWordPairs(){
        return this.wordPairs;
    }
    public boolean contains(WordPair wordPair){
        return this.wordPairs.contains(wordPair);
    }
    public WordPair getWordPair(String word){
        for(WordPair wordPair : this.wordPairs){
            if(wordPair.getWort().equals(word)){
                return wordPair;
            }
        }
        return null;
    }
    public int getSize(){
        return this.wordPairs.size();
    }
    public void removeWordPair(WordPair wordPair){
        this.wordPairs.remove(wordPair);
    }
    public void removeWordPair(String word){
        this.wordPairs.remove(this.getWordPair(word));
    }
    public void clear(){
        this.wordPairs.clear();
    }
    public WordPair getWordPair(int index){
        if (index < 0 || index >= this.getSize()){
            return null;
        }
        int i = 0;
        for(WordPair wordPair : this.wordPairs){
            if(i == index){
                return wordPair;
            }
            i++;
        }
        return null;
    }
}
