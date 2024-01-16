package mkocagoel.view;

import javax.swing.*;

/**
 * Frame Klasse
 */
public class Frame extends JFrame {
    /**
     * Konstruktor
     * @param panel
     * @param t
     */
    public Frame(JPanel panel, String t){
        super(t);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(750,750);
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.setVisible(true);
    }
}