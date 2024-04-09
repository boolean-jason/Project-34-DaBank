package gui.buttons;

import gui.BaseButton;
import gui.GUI;
import gui.pages.ChoicePage;
import gui.pages.WithdrawPage;

import javax.swing.*;
import java.awt.*;

public class WithdrawButton extends BaseButton {
    public WithdrawButton() {
        super();
        button.setLocation(LEFT, Y_POS(3));
        button.setText("Opnemen");
        button.addActionListener(e -> GUI.gotoPage(WithdrawPage.KEY)); // Using WithdrawPage.KEY
    }
}
