import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JTextField iodisp;
    JButton[] numbers = new JButton[10];
    JButton[] operations = new JButton[10];
    JButton add,sub,mul,div,equals,dot,clear;
    JPanel panel;
    double num1 = 0;
    double num2 = 0;
    Calculator(){
        setTitle("Calculator");
        setLayout(null);

        iodisp = new JTextField();
        iodisp.setEditable(false);
        iodisp.setBounds(30,30,240,40);

        add=new JButton("+");
        sub=new JButton("-");
        mul=new JButton("*");
        div=new JButton("/");
        dot=new JButton(".");
        equals=new JButton("=");
        clear=new JButton("C");

        operations[0]=add;
        operations[1]=sub;
        operations[2]=mul;
        operations[3]=div;
        operations[4]=dot;
        operations[5]=equals;
        operations[6]=clear;
        for (int i = 0; i < 7; i++) {

            operations[i].addActionListener(this);
        }
        for (int i = 0; i < 10; i++) {
            numbers[i]=new JButton(String.valueOf(i));
            numbers[i].addActionListener(this);

        }

        panel = new JPanel(new GridLayout(4,4,10,10));
        panel.setBounds(30,80,240,240);

        panel.add(numbers[1]);
        panel.add(numbers[2]);
        panel.add(numbers[3]);
        panel.add(add);
        panel.add(numbers[4]);
        panel.add(numbers[5]);
        panel.add(numbers[6]);
        panel.add(sub);
        panel.add(numbers[7]);
        panel.add(numbers[8]);
        panel.add(numbers[9]);
        panel.add(div);
        panel.add(clear);
        panel.add(numbers[0]);
        panel.add(dot);
        panel.add(equals);


        add(panel);
        add(iodisp);
        setSize(300,400);
        setVisible(true);
    }

    public static void main(String[] args) {

        new Calculator();
    }
    public void actionPerformed(ActionEvent e){

    }

}
