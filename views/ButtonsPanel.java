/*
* File: ButtonsPanel.java
* Author: Tóth Júlia
* Copyright: 2022, Tóth Júlia
* Group: Szoft 2/n
* Date: 2022-12-17
* Github: https://github.com/haribomaci
* Licenc: GNU GPL
*/

package views;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel{
    public JButton calcDistrictButton;
    public JButton calcAreaButton;
    public JButton aboutButton;

    public ButtonsPanel(){
        this.calcDistrictButton = new JButton("Kerület számítás");
        this.calcAreaButton = new JButton("Terület számítás");
        this.aboutButton = new JButton("Névjegy");
        this.addComponents();
    }
    public void addComponents(){
        this.add(this.calcDistrictButton);
        this.add(this.calcAreaButton);
        this.add(this.aboutButton);

    }
}
