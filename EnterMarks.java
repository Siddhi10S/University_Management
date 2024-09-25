package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class EnterMarks extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new EnterMarks();
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == submit){
            try{
                Conn c = new Conn();
                String query1 ="insert into subject values('"+crollno.getSelectedItem()+"', '"+cbsemester.getSelectedItem()+"','"+tfsub1.getText()+"','"+tfsub2.getText()+"','"+tfsub3.getText()+"','"+tfsub4.getText()+"','"+tfsub5.getText()+"')";
                String query2 ="insert into marks values('"+crollno.getSelectedItem()+"', '"+cbsemester.getSelectedItem()+"','"+tfmarks1.getText()+"','"+tfmarks2.getText()+"','"+tfmarks3.getText()+"','"+tfmarks4.getText()+"','"+tfmarks5.getText()+"')";

                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);

                JOptionPane.showMessageDialog(null, "Marks inserted successfully");
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }

    Choice crollno;
    JComboBox cbsemester;

    JButton submit, cancel;
    JTextField tfsub1, tfsub2, tfsub3, tfsub4, tfsub5, tfmarks1, tfmarks2,tfmarks3,tfmarks4, tfmarks5;


    EnterMarks(){

        setSize(1000,500);
        setLocation(300,150);
        setLayout(null);

        getContentPane().setBackground(Color.white);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/exam.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(500, 40, 500, 400);
        add(image);

        JLabel heading = new JLabel("Enter Marks of Student");
        heading.setBounds(50, 0, 500, 50);
        heading.setFont(new Font("Tahoma", Font.BOLD, 25));
        add(heading);

        JLabel line = new JLabel("___________________________________________________________");
        line.setBounds(50, 40, 600, 20);
        add(line);

        JLabel lblrollnumber = new JLabel("Select Roll Number");
        lblrollnumber.setBounds(50, 80, 170, 20);
        lblrollnumber.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblrollnumber);

        crollno = new Choice();
        crollno.setBounds(230, 80, 150, 20);
        add(crollno);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next()) {
                crollno.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel lblsemester = new JLabel("Select Semester");
        lblsemester.setBounds(50, 120, 170, 20);
        lblsemester.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblsemester);

        String semester[]= {"1st sem", "2nd sem","3rd sem", "4th sem", "5th sem", "6th sem", "7th sem", "8th sem"};
        cbsemester = new JComboBox(semester);
        //cbsemester= new JComboBox();
        cbsemester.setBounds(230,120,150,20);
        add(cbsemester);

        JLabel lblentersubject = new JLabel(" Enter Subject");
        lblentersubject.setBounds(100, 170, 200, 40);
        //lblentersubject.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblentersubject);

        JLabel lblentermarks = new JLabel("Enter Marks");
        lblentermarks.setBounds(320, 170, 200, 40);
        //lblentermarks.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblentermarks);

        tfsub1 = new JTextField();
        tfsub1.setBounds(50,220,200,20);
        add(tfsub1);

        tfsub2 = new JTextField();
        tfsub2.setBounds(50,250,200,20);
        add(tfsub2);

        tfsub3 = new JTextField();
        tfsub3.setBounds(50,280,200,20);
        add(tfsub3);

        tfsub4 = new JTextField();
        tfsub4.setBounds(50,310,200,20);
        add(tfsub4);

        tfsub5 = new JTextField();
        tfsub5.setBounds(50,340,200,20);
        add(tfsub5);

        tfmarks1 = new JTextField();
        tfmarks1.setBounds(270,220,200,20);
        add(tfmarks1);

        tfmarks2 = new JTextField();
        tfmarks2.setBounds(270,250,200,20);
        add(tfmarks2);

        tfmarks3 = new JTextField();
        tfmarks3.setBounds(270,280,200,20);
        add(tfmarks3);

        tfmarks4 = new JTextField();
        tfmarks4.setBounds(270,310,200,20);
        add(tfmarks4);

        tfmarks5 = new JTextField();
        tfmarks5.setBounds(270,340,200,20);
        add(tfmarks5);

        submit = new JButton("Submit");
        submit.setBounds(70, 380, 150, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(280, 380, 150, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);

        setVisible(true);

    }
}
