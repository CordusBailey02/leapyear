package com.caddocareer;

import javax.swing.*;

public class Main extends ConsoleProgram {

    public static JFrame frame = new JFrame();
    public static LeapYear ly =  new LeapYear();

    public static void main(String[] args)
    {
        frame.setVisible(true);
        frame.setTitle("Leap Year Program");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setContentPane(ly.getJPanel());
    }

}
