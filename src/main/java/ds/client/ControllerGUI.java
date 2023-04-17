package ds.client;

import javax.swing.*;

public class ControllerGUI extends JFrame {

    public ControllerGUI() {
        // Create an instance of your MainPanel class
        MainWindow mainPanel = new MainWindow();

        // Add the MainPanel instance to the JFrame
        add(mainPanel);

        // Set the JFrame properties
        setTitle("gRPC Client");
        setSize(900, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center the frame on the screen

        // Display the JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the MainFrame class
        ControllerGUI mainFrame = new ControllerGUI();
    }
}

