package gui.buttons;

import gui.BaseButton;
import gui.GUI;
import gui.pages.Eindscherm;
import gui.pages.HomePage;

import javax.swing.*;
import java.awt.*;

public class Snel50Button extends BaseButton {
    public Snel50Button() {
        super();
        button.setLocation(LEFT,Y_POS(2));
        button.setText("Snel 50 euro opnemen");
        button.addActionListener(e -> GUI.gotoPage(Eindscherm.KEY));
    }
}
