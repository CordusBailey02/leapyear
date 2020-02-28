package com.caddocareer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class LeapYear {
    private JPanel jPanel;
    private JButton exitButton;
    private JButton clearButton;
    private JButton calculateButton;
    private JTextField textFieldMonth;
    private JTextField textFieldDay;
    private JTextField textFieldYear;
    private JLabel labelOutput;

    public Date date = new Date();

    public JPanel getJPanel() {
        return jPanel;
    }

    public LeapYear()
    {
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(-1);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                labelOutput.setText("");
                textFieldDay.setText("");
                textFieldMonth.setText("");
                textFieldYear.setText("");
            }
        });

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(textFieldYear.getText().equalsIgnoreCase(""))
                {
                    labelOutput.setText(calcYear());
                }
                else
                {
                    labelOutput.setText(calcYearInput());
                }
            }
        });
    }

    // Calculates how far it is until the next leap year.
    private String calcYearInput()
    {
        int year = Integer.parseInt(textFieldYear.getText());
        int yearOutput = year;
        while(yearOutput % 4 != 0)
        {
            yearOutput++;
        }
        if(year % 4 == 0)
        {
            return yearOutput + 4 + " is the next leap year!";
        }
        else
        {
            return yearOutput + " is the next leap year!";
        }
    }

    // Calculates the year if their is no input
    private String calcYear()
    {
        int tillNext = 0;
        if(date.getYear() % 4 == 0)
        {
            return Integer.parseInt(String.valueOf(date.getYear())) + 1904 + " is the next leap year!";
        }
        while(date.getYear() % 4 != 0)
        {
            tillNext++;
        }

        return Integer.parseInt(String.valueOf(date.getYear())) + (tillNext + 1900) + " is the next leap year!";
    }
}
