package FoodOrdering;

import LeapYear.LeapYearGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
class NoSelectionException extends Exception{
    public NoSelectionException(String s){
        super(s);
    }
}

public class FoodOrderGUI extends JFrame {
    JFrame frame = new JFrame("Food Ordering System");
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderGUI(){
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FoodOrderSystem();
                clearInputs();
                rbNone.setSelected(true);
            }
        });
    }

    public void FoodOrderSystem() {
        try {
            double price = 0;
            double actual_price = 0;
            if (cPizza.isSelected() || cBurger.isSelected() || cFries.isSelected() || cSoftDrinks.isSelected() || cTea.isSelected() || cSundae.isSelected()) {
            if (cPizza.isSelected()) {
                price += 100;
            }
            if (cBurger.isSelected()) {
                price += 80;
            }
            if (cFries.isSelected()) {
                price += 65;
            }
            if (cSoftDrinks.isSelected()) {
                price += 55;
            }
            if (cTea.isSelected()) {
                price += 50;
            }
            if (cSundae.isSelected()) {
                price += 40;
            }

            if (rbNone.isSelected()) {
                actual_price = price;
            }
            if (rb5.isSelected()) {
                actual_price = price - (price * 0.05);
            }
            if (rb10.isSelected()) {
                actual_price = price - (price * 0.1);
            }
            if (rb15.isSelected()) {
                actual_price = price - (price * 0.15);
            }
            JOptionPane.showMessageDialog(panel1, "The total price is Php " + String.format("%.2f", actual_price));

            } else {
                throw (new NoSelectionException("Select Your Order"));
            }
        }catch(NoSelectionException e){
        JOptionPane.showMessageDialog(panel1, "Select Your Order");
        }
    }

    public void clearInputs(){
        cPizza.setSelected(false);
        cBurger.setSelected(false);
        cFries.setSelected(false);
        cSoftDrinks.setSelected(false);
        cTea.setSelected(false);
        cSundae.setSelected(false);
    }

    public static void main(String[] args){
        FoodOrderGUI food = new FoodOrderGUI();
        food.setContentPane(food.panel1);
        food.setSize(500, 500);
        food.setVisible(true);
        food.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
