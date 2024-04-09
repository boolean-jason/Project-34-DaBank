package gui.buttons;

import gui.*;
import gui.pages.SaldoCheckPage;

import javax.swing.*;
import java.awt.*;

public class SaldoCheckButton extends BaseButton{
    public SaldoCheckButton() {
        super();
        button.setLocation(RIGHT,Y_POS(2));
        button.setText("Saldo check");
        button.setHorizontalTextPosition(SwingConstants.LEFT);
        button.addActionListener(e -> GUI.gotoPage(SaldoCheckPage.KEY));
    }
}
