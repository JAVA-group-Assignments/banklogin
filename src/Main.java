import UI.BankLoginUi;
import UI.WithdrawUI;
import UI.DepositUI;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        BankLoginUi bankLoginUi = new BankLoginUi();
        bankLoginUi.setVisible(true);
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new WithdrawUI();
            }
        });
    }
}
