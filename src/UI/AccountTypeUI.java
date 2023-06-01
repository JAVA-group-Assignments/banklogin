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



//Account Type GUI


