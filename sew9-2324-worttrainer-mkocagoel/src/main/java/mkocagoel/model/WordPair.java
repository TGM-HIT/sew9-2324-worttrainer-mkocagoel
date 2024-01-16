package mkocagoel.model;

import java.net.MalformedURLException;
import java.net.URL;

public class WordPair {

    private String word;
    private String url;
    public WordPair(String word, String url){
        this.word = word;
        this.url = url;
    }
    public void setWort(String word){
        this.word = word;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public String getWort(){
        return this.word;
    }
    public String getUrl(){
        return this.url;
    }
}
