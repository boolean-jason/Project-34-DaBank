package gui.pages;

import gui.BasePage;
import gui.buttons.BackButton;
import gui.buttons.MainPageButton;
import gui.buttons.StopTransactionButton;
import gui.popups.TransactionDialog;

public class SaldoCheckPage extends BasePage {
    public static final String KEY = "SALDOCHECKPAGE"; // Correct key for SaldoCheckPage
    private final TransactionDialog transactionDialog;

    public SaldoCheckPage() {
        super();

        transactionDialog = new TransactionDialog();

        page.add(new StopTransactionButton().getButton());
        page.add(new BackButton(ChoicePage.KEY).getButton());
        page.add(new MainPageButton().getButton());
        page.add(transactionDialog.getDisplayText());
    }
}
