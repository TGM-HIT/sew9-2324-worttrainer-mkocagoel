package mkocagoel.controller;
import mkocagoel.model.*;
import mkocagoel.view.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class Controller implements ActionListener {
    private Frame frame;
    private Panel panel;
    private Wordtrainer wordtrainer;
    private WordList wordList;
    private WordPair we1=new WordPair("Hund","https://www.pinclipart.com/picdir/middle/20-206356_wenn-hund-clipart.png");
    private WordPair we2=new WordPair("Maus","https://www.jr-farm.de/media/image/ee/44/22/Maus_23162751_M_frei_ohne_SchwanzDX94OBE1aiEDz_800x800.jpg");
    public Controller() throws MalformedURLException {
        panel = new Panel(this);
        frame = new Frame(panel, "Wordtrainer");
        this.wordList = new WordList();
        this.wordList.addWordPair(we1);
        this.wordList.addWordPair(we2);
        this.wordtrainer = new Wordtrainer(this.wordList);
        panel.bild(wordtrainer.getRandomWord().getUrl());
    }
    public static void main(String[] args) {
        try {
            new Controller();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object t= e.getActionCommand();
        switch(t.toString()){
            case "reset":
                this.wordtrainer=new Wordtrainer(this.wordList);
                panel.update(0,0,true);
                break;
            case "plus":
                String temp= JOptionPane.showInputDialog(null,"Bitte das Wort eingeben: ");
                String temp1=JOptionPane.showInputDialog(null,"Bitte die URL eingeben: ");
                WordPair temp2= null;
                temp2 = new WordPair(temp,temp1);
                wordList.addWordPair(temp2);
                break;
            case "eingabe":
                if(wordtrainer.guess(panel.getEin(),true)){
                    panel.update(wordtrainer.getPoints(),wordtrainer.getMissedPoints(),true);
                    try {
                        panel.bild(wordtrainer.getRandomWord().getUrl());
                    } catch (MalformedURLException ev) {
                        ev.printStackTrace();
                    }
                }
                else{
                    panel.update(wordtrainer.getPoints(),wordtrainer.getMissedPoints(),false);
                }
                break;
            /*case "save":
                try {
                    ps.speichern(wt);
                } catch (IOException ev) {
                    ev.printStackTrace();
                }
                break;
            case "load":
                try {
                    wt=ps.laden();
                    pl.update(wt.getRichtig(),wt.getAbgf(),true);
                    pl.bild(wt.aktuell().getUrl());
                } catch (IOException ev) {
                    ev.printStackTrace();
                }
                break;*/
        }
    }
}
