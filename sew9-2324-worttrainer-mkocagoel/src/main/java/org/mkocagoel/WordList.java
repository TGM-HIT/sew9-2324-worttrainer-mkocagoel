package org.mkocagoel;

import java.util.HashSet;
import java.util.Set;

public class WordList {
    private Set<WordPair> wordPairs;
    private String name;

    public WordList(String name){
        this.name = name;
        wordPairs = new HashSet<WordPair>();
    }

    public boolean addWordPair(WordPair wordPair){
        this.wordPairs.add(wordPair);
        return this.wordPairs.add(wordPair);
    }
    public boolean removeWordPair(WordPair wordPair){
        return this.wordPairs.remove(wordPair);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
