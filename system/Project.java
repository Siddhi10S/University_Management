
package university.management.system;
import java.awt.Image;
import java.awt.Color;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.event.*;


public class Project extends JFrame implements ActionListener {

    public static void main(String[] args) {
        new Project();
    }

    Project() {
        setSize(1540, 850);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dypclg.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);

        // Information
        JMenuBar mb = new JMenuBar();
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);

        JMenuItem faculty = new JMenuItem("New Faculty Information");
        faculty.setBackground(Color.WHITE);
        faculty.addActionListener(this);
        newInformation.add(faculty);

        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);

        //Details

        JMenu detail = new JMenu("View Details");
        detail.setForeground(Color.RED);
        mb.add(detail);

        JMenuItem facultydetails = new JMenuItem("View Faculty details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        detail.add(facultydetails);

        JMenuItem studentdeatils = new JMenuItem("View Student details");
        studentdeatils.setBackground(Color.WHITE);
        studentdeatils.addActionListener(this);
        detail.add(studentdeatils);

        //Leave
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
        mb.add(leave);

        JMenuItem facultyleave = new JMenuItem("Faculty leave");
        facultyleave.setBackground(Color.WHITE);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);

        JMenuItem studentleave = new JMenuItem("Student leave");
        studentleave.setBackground(Color.WHITE);
        studentleave.addActionListener(this);
        leave.add(studentleave);

        //Leave Details

        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.RED);
        mb.add(leaveDetails);

        JMenuItem facultyleavedetails = new JMenuItem("Faculty leave Details");
        facultyleavedetails.setBackground(Color.WHITE);
        facultyleavedetails.addActionListener(this);
        leaveDetails.add(facultyleavedetails);

        JMenuItem studentleavedetails = new JMenuItem("Student leave Details");
        studentleavedetails.setBackground(Color.WHITE);
        studentleavedetails.addActionListener(this);
        leaveDetails.add(studentleavedetails);

        //Exams
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLUE);
        mb.add(exam);

        JMenuItem examdetails = new JMenuItem("Examination Results");
        examdetails.setBackground(Color.WHITE);
        examdetails.addActionListener(this);
        exam.add(examdetails);

        JMenuItem entermarks = new JMenuItem("Enter Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);

        //Update Info

        JMenu updateinfo = new JMenu("Update Details");
        updateinfo.setForeground(Color.RED);
        mb.add(updateinfo);

        JMenuItem facultyinfo = new JMenuItem("Update Faculty Details");
        facultyinfo.setBackground(Color.WHITE);
        facultyinfo.addActionListener(this);
        updateinfo.add(facultyinfo);

        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateinfo.add(updatestudentinfo);

        // fee

        JMenu fee = new JMenu("Update Fee Details");
        fee.setForeground(Color.BLUE);
        mb.add(fee);

        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);

        JMenuItem feeform = new JMenuItem("Student fee form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);

        // Utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.RED);
        mb.add(utility);

        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);


     //   NotepadApp notepadApp = new NotepadApp();


        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);

        // about
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLUE);
        mb.add(about);

        JMenuItem ab = new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);

        // exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.RED);
        mb.add(exit);

        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);


        setJMenuBar(mb);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();

        if (msg.equals("Exit")) {
            setVisible(false);
        } else if (msg.equals("Calculator")) {
            try {
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {

            }
        }
//        } else if (msg.equals("Notepad")) {
//            try {
////                Runtime.getRuntime().exec("notepad.exe");
//                  NotepadApp note = new NotepadApp();
//                  note.getClass();
//                  //new NotepadApp();
//            } catch (Exception e) {
//
//            }
//       }
       else if (msg.equals("New Faculty Information")) {
            new AddTeacher();
        } else if (msg.equals("New Student Information")) {
            new AddStudent();
        } else if (msg.equals("View Faculty details")) {
            new TeacherDetails();
        } else if (msg.equals("View Student details")) {
            new StudentDetails();
        } else if (msg.equals("Faculty leave Details")) {
            new TeacherLeaveDetails();
        } else if (msg.equals("Student leave Details")) {
            new StudentLeaveDetails();
        } else if (msg.equals("Update Faculty Details")) {
            new UpdateTeacher();
        } else if (msg.equals("Update Student Details")) {
            new UpdateStudent();
        }else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        }else if (msg.equals("Examination Results")) {
            new ExaminationDetails();
        }else if (msg.equals("Fee Structure")) {
            new FeeStructure();
        }else if (msg.equals("Faculty leave")) {
            new TeacherLeave();
        }else if (msg.equals("Student leave")) {
            new StudentLeave();
        }else if (msg.equals("About")) {
            new About();
        }else if (msg.equals("Student fee form")) {
            new StudentFeeForm();
        }else if (msg.equals("Notepad")) {
            new NotepadApp();
        }



    }
}