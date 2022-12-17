/*
* File: InputPanel.java
* Author: Tóth Júlia
* Copyright: 2022, Tóth Júlia
* Group: Szoft 2/n
* Date: 2022-12-17
* Github: https://github.com/haribomaci
* Licenc: GNU GPL
*/

package lan.julia;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * Az InputPanel egy Swing komponens, ami segít
 * bekérni egy értéket. Van egy felirata és
 * egy beviteli mezője.
 * @author Tóth Júlia
 * @version 1.0
 * @since 2022-12-14
 */
public class InputPanel extends JPanel {
    public JLabel label;
    public JTextField field;
    public JLabel label1;
    public JTextField field1;
    /**
     * Paraméter nélküli konstruktor
     */
    public InputPanel() {
        this.label = new JLabel("Terület");
        this.field = new JTextField();
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.setBorder(new EmptyBorder(5, 10, 5, 10));
        this.label.setBorder(new EmptyBorder(0, 0, 0, 10));
        this.addComponent();
    }
    private void addComponent() {
        this.add(label);
        this.add(field);
    }
    /**
     * Konstruktor. Paraméterként a komponens
     * felirata megadható.
     * @param label A komponens felirata
     */
    public InputPanel(JLabel label, JLabel label1) {
        this.label = label;
    }
    /**
     * A komponens szövegének beállítása
     * @param text A felirat szövege
     */
    public void setText(String text) {
        this.label.setText(text);
    }
    /**
     * A komponens szövege lekérdezhető
     * @return A komponens szövegét adja
     */
    public String getText() {
        return this.label.getText();
    }
    /**
     * A komponens értékének beállítása
     * @param value A komponens értéke
     */
    public void setValue(String value) {
        this.field.setText(value);
    }
    /**
     * A komponens értékének lekérdezése
     * @return A komponens értékét adja
     */
    public String getValue() {
        return this.field.getText();
    }
}
