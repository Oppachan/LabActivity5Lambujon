package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    JFrame frame = new JFrame("Simple Calculator");
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleCalc();
            }
        });
    }

    public void SimpleCalc() {
        try {
            int num1, num2, result = 0;
            num1 = Integer.parseInt(tfNumber1.getText());
            num2 = Integer.parseInt(tfNumber2.getText());
            String selected = (String) cbOperations.getSelectedItem();
            if (selected.equals("+")) {
                result = num1 + num2;
            } else if (selected.equals("-")) {
                result = num1 - num2;
            } else if (selected.equals("*")) {
                result = num1 * num2;
            } else if (selected.equals("/")) {
                result = num1 / num2;
            }
            lblResult.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panel1, "Invalid Input");
        }
    }
    public static void main(String[] args){
        SimpleCalcGUI calc = new SimpleCalcGUI();
        calc.setContentPane(calc.panel1);
        calc.setSize(500, 500);
        calc.setVisible(true);
    }
}
