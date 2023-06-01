package UI;

import UI.AccountTypeUI.AccountTypeUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BankLoginUi extends JFrame implements ActionListener {
    public JLabel titleLabel, pinLabel;
    public JTextField pinField;
    public JButton loginButton;

    public BankLoginUi() {
        super("Login to Your Account");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        titleLabel = new JLabel("Enter your Login Pin");
        titleLabel.setFont(new Font("Helvetica", Font.BOLD, 14));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(titleLabel, BorderLayout.NORTH);

        pinLabel = new JLabel("PIN:");
        pinLabel.setFont(new Font("Helvetica", Font.BOLD, 14));
        getContentPane().add(pinLabel, BorderLayout.CENTER);

        pinField = new JTextField(4);
        getContentPane().add(pinField, BorderLayout.CENTER);

        loginButton = new JButton("Log In");
        loginButton.setFont(new Font("Helvetica", Font.BOLD, 14));
        loginButton.addActionListener(this);
        getContentPane().add(loginButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String enteredPin = pinField.getText();
        if (enteredPin.length() != 4) {
            JOptionPane.showMessageDialog(this, "PIN must be 4 digits.");
        } else if (!enteredPin.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "PIN must be numeric.");
        } else if (enteredPin.equals("3333")) {
            JOptionPane.showMessageDialog(this, "PIN cannot be '3333'.");
        } else if (enteredPin.contains("5") && !enteredPin.matches("^5+$")) {
            JOptionPane.showMessageDialog(this, "PIN can only be '5'.");
        } else {
            JOptionPane.showMessageDialog(this, "Logged in successfully!");
            AccountTypeUI account= new AccountTypeUI();
            account.accountTypeUI();
        }
    }

    public static void main(String[] args) {
        new BankLoginUi();
    }
}
