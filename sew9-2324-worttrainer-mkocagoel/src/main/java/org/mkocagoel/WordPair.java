package org.mkocagoel;

import java.net.MalformedURLException;
import java.net.URL;

public class WordPair {

    private String word;
    private URL url;
    public WordPair(String word, String url){
        this.word = word;
        try {
            this.url = new URL(url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
    public static WordPair setWort(WordPair wordPair, String word){
        wordPair.word = word;
        return wordPair;
    }
    public static WordPair setUrl(WordPair wordPair, String url){
        try {
            wordPair.url = new URL(url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return wordPair;
    }
    public static String getWort(WordPair wordPair){
        return wordPair.word;
    }
    public static URL getUrl(WordPair wordPair){
        return wordPair.url;
    }
}
