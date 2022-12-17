/*
* File: MainController.java
* Author: Tóth Júlia
* Copyright: 2022, Tóth Júlia
* Group: Szoft 2/n
* Date: 2022-12-17
* Github: https://github.com/haribomaci
* Licenc: GNU GPL
*/

package controllers;


import javax.swing.JButton;
import javax.swing.JOptionPane;
import views.MainWindow;

public class MainController {
    MainWindow mainWindow;

    public MainController() {
        this.mainWindow = new MainWindow();
        this.handleEvents();
    }
    public void handleEvents(){
        JButton calcDistrictButton = this.mainWindow.buttonsPanel.calcDistrictButton;
        JButton calcareaButton = this.mainWindow.buttonsPanel.calcAreaButton;
        JButton aboutButton = this.mainWindow.buttonsPanel.aboutButton;
        calcDistrictButton.addActionListener(e -> OnClickCalcDistrictButton());
        calcareaButton.addActionListener(e -> OnClickCalcAreaButton());
        aboutButton.addActionListener(e -> onClickABoutButton());
    }
    public void OnClickCalcAreaButton(){
        String aSideStr= this.mainWindow.asizePanel.getValue();
        String alfaStr= this.mainWindow.asizePanel.getValue();
        double aSide = Double.parseDouble(aSideStr);
        double alfa = Double.parseDouble(alfaStr);
        Double radian = alfa * Math.PI/180;
        Double area = Math.pow(aSide, 2) * Math.sin(radian);
        this.mainWindow.areaPanel.setValue(area.toString());
    }
    public void OnClickCalcDistrictButton(){
        String aSideString = this.mainWindow.asizePanel.getValue();
        double aSide = Double.parseDouble(aSideString);
        Double volume = 4 * aSide;
        this.mainWindow.districtPanel.setValue(volume.toString());

    }
    public void onClickABoutButton(){
        String aboutMessage = "Rombitak\nVerzió: 0.1\nTóth Júlia\nSzoft 2 N\n 2022-12-17";
        JOptionPane.showMessageDialog(mainWindow,aboutMessage);
    }

}
