/*
* File: MainWindow.java
* Author: Tóth Júlia
* Copyright: 2022, Tóth Júlia
* Group: Szoft 2/n
* Date: 2022-12-17
* Github: https://github.com/haribomaci
* Licenc: GNU GPL
*/

package views;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class MainWindow extends JFrame {
    public AsizePanel asizePanel;
    public ButtonsPanel buttonsPanel;
    public AreaPanel areaPanel;
    public DistrictPanel districtPanel;
    public AlfaPanel alfaPanel;

    public MainWindow() {
        this.asizePanel = new AsizePanel();
        this.buttonsPanel = new ButtonsPanel();
        this.areaPanel = new AreaPanel();
        this.districtPanel = new DistrictPanel();
        this.alfaPanel = new AlfaPanel();

        this.initWindow();
    }
    public void initWindow() {
        this.setTitle("rombitak");
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.addComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
    public void addComponents() {
        this.add(this.asizePanel);
        this.add(this.alfaPanel);
        this.add(this.buttonsPanel);
        this.add(this.areaPanel);
        this.add(this.districtPanel);
    }
    
}
