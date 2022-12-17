package FoodOrdering;

import javax.swing.*;

public class FoodOrderGUI {
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

    public void FoodOrderSystem(){
        double price = 0;
        double actual_price = 0;

        if(cPizza.isSelected()){
            price += 100;
        }
        if(cBurger.isSelected()){
            price += 80;
        }
        if(cFries.isSelected()){
            price += 65;
        }
        if(cSoftDrinks.isSelected()){
            price += 55;
        }
        if(cTea.isSelected()){
            price += 50;
        }
        if(cSundae.isSelected()){
            price += 40;
        }

        if(rbNone.isSelected()){
            actual_price = price;
        }
        if(rb5.isSelected()){
            actual_price = price - (price * 0.05);
        }
        if(rb10.isSelected()){
            actual_price = price - (price * 0.1);
        }
        if(rb15.isSelected()){
            actual_price = price - (price * 0.15);
        }
        JOptionPane.showMessageDialog(panel1, "The total price is Php " + String.format("%.2f", actual_price));
    }
}
