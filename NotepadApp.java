package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class NotepadApp {
    public static void main(String[] args) {
        new NotepadApp();
    }
        // Create the main frame
        NotepadApp(){
            JFrame frame = new JFrame("Notepad");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 800);

            // Create a text area for editing and display
            JTextArea textArea = new JTextArea();
            frame.add(new JScrollPane(textArea));

            // Create a menu bar
            JMenuBar menuBar = new JMenuBar();
            frame.setJMenuBar(menuBar);

            // Create the "File" menu
            JMenu fileMenu = new JMenu("File");
            menuBar.add(fileMenu);

            // Create the "Save" menu item
            JMenuItem saveMenuItem = new JMenuItem("Save");
            fileMenu.add(saveMenuItem);
            saveMenuItem.addActionListener(e -> saveFile(textArea));

            // Show the GUI
            frame.setVisible(true);

        }


    private static void saveFile(JTextArea textArea) {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showSaveDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(textArea.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
