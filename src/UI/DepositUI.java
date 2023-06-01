package UI;

import javax.swing.*;
import java.awt.*;

public class DepositUi extends JFrame {
    public JLabel amountLabel;
    public JRadioButton radioButton100000;
    public JRadioButton radioButton500000;
    public JRadioButton radioButton1000000;
    public JButton amountButton;
    public JButton depositButton;

    public void makeDeposit() {
        setTitle("Deposit GUI");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 1));

        amountLabel = new JLabel("Select deposit amount:");
        radioButton100000 = new JRadioButton("₦100000");
        radioButton500000 = new JRadioButton("₦500000");
        radioButton1000000 = new JRadioButton("₦1000000");

        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(radioButton100000);
        radioButtonGroup.add(radioButton500000);
        radioButtonGroup.add(radioButton1000000);

        amountButton = new JButton("Amount");
        depositButton = new JButton("Deposit");

        mainPanel.add(amountLabel);
        mainPanel.add(radioButton100000);
        mainPanel.add(radioButton500000);
        mainPanel.add(radioButton1000000);
        mainPanel.add(amountButton);
        mainPanel.add(depositButton);

        add(mainPanel);
        setVisible(true);

        amountButton.addActionListener(e -> {
            if (radioButton100000.isSelected()) {
                JOptionPane.showMessageDialog(DepositUi.this, "Selected amount: ₦100000");
            } else if (radioButton500000.isSelected()) {
                JOptionPane.showMessageDialog(DepositUi.this, "Selected amount: ₦500000");
            } else if (radioButton1000000.isSelected()) {
                JOptionPane.showMessageDialog(DepositUi.this, "Selected amount: ₦1000000");
            } else {
                JOptionPane.showMessageDialog(DepositUi.this, "No amount selected.");
            }
        });

        depositButton.addActionListener(e -> {
            if (radioButton100000.isSelected()) {
                performDeposit(100000);
            } else if (radioButton500000.isSelected()) {
                performDeposit(500000);
            } else if (radioButton1000000.isSelected()) {
                performDeposit(1000000);
            } else {
                JOptionPane.showMessageDialog(DepositUi.this, "No amount selected.");
            }
        });
    }

    private void performDeposit(int amount) {
        JOptionPane.showMessageDialog(DepositUi.this, "Deposit amount: ₦" + amount);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DepositUi().setVisible(true));
    }
}

// Deposit GUI


