package bisharasaidlab11;

/*
course: CSC191
project: Lab 11
date due: 4/19/23
author: Bishara Said
purpose: Create a Calculator class that setups a GUI window for a calculator.
*/

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class Calculator extends JFrame{
    //JPanels
    private JPanel numberJPanel;
    private JPanel symbolJPanel;
    private JPanel miscJPanel;
    
    //JTextField to hold calculation
    private JTextField calcJTextField;
    
    //list of JButtons
    private JButton oneJButton, twoJButton, threeJButton, fourJButton, 
            fiveJButton, sixJButton, sevenJButton, eightJButton, nineJButton, 
            zeroJButton, dubzeroJButton, plusJButton, dotJButton, minusJButton, 
            starJButton, slashJButton, equalsJButton, cJButton, caJButton, 
            offJButton;
    
    public Calculator(){
        createUserInterface();
    }
    
    //method to create & position the GUI components
    private void createUserInterface(){
        Container contentPane = getContentPane();
        contentPane.setLayout(null); //layout everything ourselves maually
        
        //settup JTextField in contentPane
        calcJTextField = new JTextField();
        calcJTextField.setBounds(15, 15, 370, 20);
        calcJTextField.setHorizontalAlignment(JTextField.RIGHT);
        calcJTextField.setText("0");
        calcJTextField.setEditable(false);
        contentPane.add(calcJTextField);
        
        //settup numberJPanel in contentPane
        numberJPanel = new JPanel();
        numberJPanel.setLayout(null);
        numberJPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        numberJPanel.setBounds(15, 50, 140, 180);
        contentPane.add(numberJPanel);
        
        //JButtons going in numberJPanel;
        oneJButton = new JButton();
        oneJButton.setBounds(10, 10, 40, 40);
        oneJButton.setText("1");
        numberJPanel.add(oneJButton);
        
        twoJButton = new JButton();
        twoJButton.setBounds(50, 10, 40, 40);
        twoJButton.setText("2");
        numberJPanel.add(twoJButton);
        
        threeJButton = new JButton();
        threeJButton.setBounds(90, 10, 40, 40);
        threeJButton.setText("3");
        numberJPanel.add(threeJButton);
        
        fourJButton = new JButton();
        fourJButton.setBounds(10, 50, 40, 40);
        fourJButton.setText("4");
        numberJPanel.add(fourJButton);
        
        fiveJButton = new JButton();
        fiveJButton.setBounds(50, 50, 40, 40);
        fiveJButton.setText("5");
        numberJPanel.add(fiveJButton);
        
        sixJButton = new JButton();
        sixJButton.setBounds(90, 50, 40, 40);
        sixJButton.setText("6");
        numberJPanel.add(sixJButton);
        
        sevenJButton = new JButton();
        sevenJButton.setBounds(10, 90, 40, 40);
        sevenJButton.setText("7");
        numberJPanel.add(sevenJButton);
        
        eightJButton = new JButton();
        eightJButton.setBounds(50, 90, 40, 40);
        eightJButton.setText("8");
        numberJPanel.add(eightJButton);
        
        nineJButton = new JButton();
        nineJButton.setBounds(90, 90, 40, 40);
        nineJButton.setText("9");
        numberJPanel.add(nineJButton);
        
        zeroJButton = new JButton();
        zeroJButton.setBounds(10, 130, 40, 40);
        zeroJButton.setText("0");
        numberJPanel.add(zeroJButton);
        
        dubzeroJButton = new JButton();
        dubzeroJButton.setBounds(50, 130, 80, 40);
        dubzeroJButton.setText("00");
        numberJPanel.add(dubzeroJButton);
        
        //settup symbolJPanel in contentPane
        symbolJPanel = new JPanel();
        symbolJPanel.setLayout(null);
        symbolJPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        symbolJPanel.setBounds(175, 50, 110, 180);
        contentPane.add(symbolJPanel);
        
        //JButtons going in symbolJPanel
        //NOTE: font size 18 was too big for the dimmentions I chose,
        //I compromized by bolding it instead
        plusJButton = new JButton();
        plusJButton.setBounds(10, 10, 40, 110);
        plusJButton.setFont(new Font("SansSerif", Font.BOLD, 11));
        plusJButton.setText("+");
        symbolJPanel.add(plusJButton);
        
        dotJButton = new JButton();
        dotJButton.setBounds(10, 130, 40, 40);
        dotJButton.setFont(new Font("SansSerif", Font.BOLD, 12));
        dotJButton.setText(".");
        symbolJPanel.add(dotJButton);
        
        minusJButton = new JButton();
        minusJButton.setBounds(60, 10, 40, 40);
        minusJButton.setFont(new Font("SansSerif", Font.BOLD, 12));
        minusJButton.setText("-");
        symbolJPanel.add(minusJButton);
        
        starJButton = new JButton();
        starJButton.setBounds(60, 50, 40, 40);
        starJButton.setFont(new Font("SansSerif", Font.BOLD, 12));
        starJButton.setText("*");
        symbolJPanel.add(starJButton);
        
        slashJButton = new JButton();
        slashJButton.setBounds(60, 90, 40, 40);
        slashJButton.setFont(new Font("SansSerif", Font.BOLD, 12));
        slashJButton.setText("/");
        symbolJPanel.add(slashJButton);
        
        equalsJButton = new JButton();
        equalsJButton.setBounds(60, 130, 40, 40);
        equalsJButton.setFont(new Font("SansSerif", Font.BOLD, 11));
        equalsJButton.setText("=");
        symbolJPanel.add(equalsJButton);
        
        //settup miscJPanel in contentPane
        miscJPanel = new JPanel();
        miscJPanel.setLayout(null);
        miscJPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        miscJPanel.setBounds(305, 50, 80, 110);
        contentPane.add(miscJPanel);
        
        //JButtons going in miscJPanel
        cJButton = new JButton();
        cJButton.setBounds(10, 10, 60, 40);
        cJButton.setText("C");
        miscJPanel.add(cJButton);
        
        caJButton = new JButton();
        caJButton.setBounds(10, 60, 60, 40);
        caJButton.setText("C/A");
        miscJPanel.add(caJButton);
        
        //settup offJButton in contentPane
        offJButton = new JButton();
        offJButton.setBounds(305, 190, 80, 40);
        offJButton.setText("OFF");
        contentPane.add(offJButton);
        
        
        
        //set properties of application window
        setTitle("Calculator"); //sets title bar text window
        setSize(415, 285); //sets window's initial size
        setVisible(true); //display the window
    }
    
}//close Calculator class

public class BisharaSaidLab11 {
    
    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
