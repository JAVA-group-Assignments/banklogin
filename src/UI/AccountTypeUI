package UI.AccountTypeUI;

import UI.DepositUi;
import UI.WithdrawUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AccountTypeUI extends JFrame implements ActionListener {

    public JLabel titleLabel;
    public JButton savingsButton, currentButton;
    public JPanel mainPanel;

    public void accountTypeUI() {
        setTitle("Bank App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        titleLabel = new JLabel("Select your Account Type");
        titleLabel.setFont(new Font("Helvetica", Font.BOLD, 14));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(titleLabel, BorderLayout.NORTH);

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 1));

        savingsButton = new JButton("Savings Account");
        savingsButton.setFont(new Font("Helvetica", Font.BOLD, 14));
        savingsButton.addActionListener(this);
        mainPanel.add(savingsButton);

        currentButton = new JButton("Current Account");
        currentButton.setFont(new Font("Helvetica", Font.BOLD, 14));
        currentButton.addActionListener(this);
        mainPanel.add(currentButton);

        add(mainPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == savingsButton) {
            new SavingsFrame();
            setVisible(false);
        } else if (e.getSource() == currentButton) {
            new CurrentFrame();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AccountTypeUI();
    }
}

class SavingsFrame extends JFrame implements ActionListener {

    public JLabel headerLabel;
    public JButton depositButton, withdrawButton;
    public JPanel mainPanel;

    public SavingsFrame() {
        setTitle("Savings Account");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 1));

        headerLabel = new JLabel("What Would you Like to do Today?");
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 14));
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(headerLabel, BorderLayout.NORTH);

        depositButton = new JButton("Deposit");
        depositButton.setFont(new Font("Helvetica", Font.BOLD, 14));
        depositButton.addActionListener(this);
        mainPanel.add(depositButton);

        withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(this);
        mainPanel.add(withdrawButton);

        add(mainPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == depositButton) {
            JOptionPane.showMessageDialog(null, "You have selected to deposit into your savings account.");
            DepositUi deposit = new DepositUi();
            deposit.makeDeposit();
        } else if (e.getSource() == withdrawButton) {
            JOptionPane.showMessageDialog(null, "You have selected to withdraw from your savings account.");
            WithdrawUI withdraw = new WithdrawUI();
            withdraw.makeWithdrawal();
        }
    }
}

class CurrentFrame extends JFrame implements ActionListener {

    public JLabel headerLabel;
    public JButton depositButton, withdrawButton;
    public JPanel mainPanel;

    public CurrentFrame() {
        setTitle("Current Account");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 1));

        headerLabel = new JLabel("What Would you Like to do Today?");
        headerLabel.setFont(new Font("Helvetica", Font.BOLD, 14));
        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(headerLabel, BorderLayout.NORTH);

        depositButton = new JButton("Deposit");
        depositButton.setFont(new Font("Helvetica", Font.BOLD, 14));
        depositButton.addActionListener(this);
        mainPanel.add(depositButton);

        withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(this);
        mainPanel.add(withdrawButton);

        add(mainPanel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == depositButton) {
            JOptionPane.showMessageDialog(null, "You have selected to deposit into your savings account.");
            DepositUi deposit = new DepositUi();
            deposit.makeDeposit();
        } else if (e.getSource() == withdrawButton) {
            JOptionPane.showMessageDialog(null, "You have selected to withdraw from your savings account.");
            WithdrawUI withdraw = new WithdrawUI();
            withdraw.makeWithdrawal();
        }
    }
}


