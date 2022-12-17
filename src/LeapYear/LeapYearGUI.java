package LeapYear;

import javax.swing.*;

public class LeapYearGUI {
    JFrame frame = new JFrame("Leap Year Checker");
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public void LeapYearChecker(){
            int year = Integer.parseInt(tfYear.getText());
            if (year % 4 == 0 && year % 100 != 0) {
                JOptionPane.showMessageDialog(panel1, "Leap Year");
            }else if(year % 400 == 0){
                JOptionPane.showMessageDialog(panel1, "Leap Year");
            }else{
                JOptionPane.showMessageDialog(panel1, "Not a Leap Year");
            }
    }
}
