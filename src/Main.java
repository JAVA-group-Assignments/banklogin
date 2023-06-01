import UI.BankLoginUi;
import UI.WithdrawUI;
public class Main {
    public static void main(String[] args) {
        BankLoginUi bankLoginUi = new BankLoginUi();
        bankLoginUi.setVisible(true);
        
        double initialBalance = 100000.00;
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new WithdrawUI();
            }
        });
    }
}
