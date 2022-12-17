package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    JFrame frame = new JFrame("Leap Year Checker");
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                LeapYearChecker();
            }
        });
    }
    public void LeapYearChecker(){
        try{
            int year = Integer.parseInt(tfYear.getText());
            if (year % 4 == 0 && year % 100 != 0) {
                JOptionPane.showMessageDialog(panel1, "Leap Year");
            }else if(year % 400 == 0){
                JOptionPane.showMessageDialog(panel1, "Leap Year");
            }else{
                JOptionPane.showMessageDialog(panel1, "Not a Leap Year");
            }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(panel1,"Invalid input");
        }
    }
    public static void main(String[] args){
        LeapYearGUI leap = new LeapYearGUI();
        leap.setContentPane(leap.panel1);
        leap.setSize(200, 300);
        leap.setVisible(true);
    }
}
