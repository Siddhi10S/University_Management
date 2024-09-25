package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    public static void main(String[] args) {
        new About();
    }

    About(){
        setSize(800,600);
        setLocation(400,100);
        getContentPane().setBackground(Color.white);

//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpeg"));
//        Image i2 = i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(320, 100, 500, 400);
//        add(image);

        JLabel heading = new JLabel("<html>University<br/>Management System");
        heading.setBounds(70, 20, 400, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);

        JLabel name = new JLabel("<html>University<br/>Management System");
        name.setBounds(70, 20, 400, 130);
        name.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name);

//        JLabel para = new JLabel("<html>Dr. D. Y. Patil Unitech Society in Pune houses many institutions & colleges to impart knowledge in various Disciplines to meet " +
//                "global challenges of the 21st century under the guidance of great visionary Hon’ble Dr. P. D. Patil, the Chairman of Dr. D. Y. Patil Unitech Society. " +
//                "Dr. D. Y. Patil Arts, Commerce & Science College, Akurdi is established under the umbrella of Dr. D. Y. Patil Vidya Pratishtan Society (Presently Dr. D. Y. Patil Unitech Society) in the year 2001." +
//                " It is a distinguished degree college affiliated to Savitribai Phule Pune University. The college is located in Nigadi Pradhikaran, Akurdi, which is the twin city of Pune. " +
//                "The college was started in the rental premises of PCMC to provide quality education and to impart pragmatic and technical education to rural area students.");
//        para.setBounds(25, 100, 700, 300);  // Adjust the width and height as per your layout
//        para.setFont(new Font("Tahoma", Font.PLAIN, 15));
//        add(para);

        JLabel para = new JLabel("<html>Dr. D. Y. Patil Unitech Society in Pune houses many institutions & colleges to impart knowledge in various Disciplines to meet " +
                "global challenges of the 21st century under the guidance of great visionary Hon’ble Dr. P. D. Patil, the Chairman of Dr. D. Y. Patil Unitech Society. " +
                "Dr. D. Y. Patil Arts, Commerce & Science College, Akurdi is established under the umbrella of Dr. D. Y. Patil Vidya Pratishtan Society (Presently Dr. D. Y. Patil Unitech Society) in the year 2001." +
                " It is a distinguished degree college affiliated to Savitribai Phule Pune University. The college is located in Nigadi Pradhikaran, Akurdi, which is the twin city of Pune. " +
                "The college was started in the rental premises of PCMC to provide quality education and to impart pragmatic and technical education to rural area students.");
        para.setBounds(30, 90, 400, 400); // Adjust the width and height as needed
        para.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(para);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 100, 400, 300); // Adjust the position and size as needed
        add(image);



        setLayout(null);
        setVisible(true);


    }
}
