package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Date;

public class WithdrawUI extends JFrame {
    public JLabel balanceLabel;
    public JTextField amountField;
    public JButton withdrawButton;

    private double balance = 100000;
    private double balance1;
    double amount;

    public void makeWithdrawal() {

        setTitle("Enter Withdrawal Amount");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel withdrawPanel = new JPanel();
        withdrawPanel.setLayout(new FlowLayout());

        balanceLabel = new JLabel("Balance: ₦" + String.format("%.2f", balance));
        withdrawPanel.add(balanceLabel);

        amountField = new JTextField(20);
        withdrawPanel.add(amountField);

        withdrawButton = new JButton("Withdraw");
        withdrawPanel.add(withdrawButton);


        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(amountField.getText());
                updateBalanceLabel();
                withdraw(amount);
                amountField.setText("");
            }
        });


        add(withdrawPanel);
        setVisible(true);
    }

    private void writeData(){
        amount = Double.parseDouble(amountField.getText());
        balance1 -= amount;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("myFile.txt", true));
            writer.write(new Date() + " You withdrew: " + amount);
            writer.newLine();
            writer.write(new Date() + " Balance: " + balance1);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void withdraw(double amount) {
        if (amount > 20000) {
            JOptionPane.showMessageDialog(this, "Withdrawal limit is ₦20000");
        } else if (amount <= balance) {
            balance -= amount;
            updateBalanceLabel();
            writeData();
        } else {
            JOptionPane.showMessageDialog(this, "Insufficient balance!");
        }
    }


    private void updateBalanceLabel() {
        balanceLabel.setText("Balance: ₦" + String.format("%.2f", balance));
    }


}
