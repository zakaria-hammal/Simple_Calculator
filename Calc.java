/*
 * Author: Zakaria HAMMAL
 * email: hammalzakaria06@gmail.com
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Calc implements ActionListener{
    
    JPanel panel1;
    JPanel panel2;
    JPanel subPanel1;
    JPanel subPanel2;

    JFrame frame;
    JLabel label;
    JButton[] button = new JButton[17];

    int a = 0, b = 0;
    int o;
    char c;

    boolean isA = true;

    public Calc() {

        panel1 = new JPanel();
        panel1.setLayout(new GridLayout());
        panel2 = new JPanel();
        subPanel1 = new JPanel();
        subPanel2 = new JPanel();

        subPanel1.setLayout(null);

        subPanel2.setLayout(null);

        frame = new JFrame();
        label = new JLabel();

        label.setText("0");
        label.setFont(new Font("MV Boli", Font.PLAIN, 50));

        label.setVerticalTextPosition(SwingConstants.CENTER);
        label.setHorizontalTextPosition(SwingConstants.RIGHT);

        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        label.setSize(new Dimension(500, 200));

        panel1.setBounds(0, 0, 500, 200);
        panel1.add(label);

        panel2.setBounds(0, 200, 500, 600);

        subPanel1.setPreferredSize(new Dimension(300, 600));
        subPanel2.setPreferredSize(new Dimension(200, 600));

        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton();
            button[i].addActionListener(this);
            button[i].setFocusable(false);
        }

        for (int i = 0; i < 9; i++) {
            button[i].setText(String.valueOf(i + 1));
        }

        button[0].setBounds(0, 0, 100, 150);
        button[1].setBounds(100, 0, 100, 150);
        button[2].setBounds(200, 0, 100, 150);
        button[3].setBounds(0, 150, 100, 150);
        button[4].setBounds(100, 150, 100, 150);
        button[5].setBounds(200, 150, 100, 150);
        button[6].setBounds(0, 300, 100, 150);
        button[7].setBounds(100, 300, 100, 150);
        button[8].setBounds(200, 300, 100, 150);

        button[9].setText("0");
        button[9].setBounds(0, 450, 300, 150);

        button[10].setText("AC");
        button[11].setText("X");
        button[12].setText("*");
        button[13].setText("/");
        button[14].setText("+");
        button[15].setText("-");

        button[10].setBounds(0, 0, 100, 150);
        button[11].setBounds(100, 0, 100, 150);
        button[12].setBounds(0, 150, 100, 150);
        button[13].setBounds(100, 150, 100, 150);
        button[14].setBounds(0, 300, 100, 150);
        button[15].setBounds(100, 300, 100, 150);

        button[16].setText("=");
        button[16].setBounds(0, 450, 200, 150);

        for (int i = 0; i < 10; i++) {
            subPanel1.add(button[i]);
        }
        
        for (int i = 10; i < 17; i++) {
            subPanel2.add(button[i]);
        }

        panel2.setLayout(new BorderLayout());
        panel2.add(subPanel1, BorderLayout.WEST);
        panel2.add(subPanel2, BorderLayout.EAST);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 800);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button[10]) {
            label.setText("");
            a = 0;
            b = 0;
            isA = true;
        }

        switch (o) {
            case 1:
                c = '*';
                break;

            case 2:
                c = '/';
                break;

            case 3:
                c = '+';
                break;
            
            case 4:
                c = '-';
                break;

            default:
                break;
        }


        if (isA) {
            if (e.getSource()==button[0]) {
                a = a * 10 + 1;
            }
            
            else if (e.getSource()==button[1]) {
                a = a * 10 + 2;
            }

            else if (e.getSource()==button[2]) {
                a = a * 10 + 3;
            }
            
            else if (e.getSource()==button[3]) {
                a = a * 10 + 4;
            }
            
            else if (e.getSource()==button[4]) {
                a = a * 10 + 5;
            }
            
            else if (e.getSource()==button[5]) {
                a = a * 10 + 6;
            }
            
            else if (e.getSource()==button[6]) {
                a = a * 10 + 7;
            }
            
            else if (e.getSource()==button[7]) {
                a = a * 10 + 8;
            }
            
            else if (e.getSource()==button[8]) {
                a = a * 10 + 9;
            }

            else if (e.getSource()==button[9]) {
                a = a * 10;
            }

            else if (e.getSource()==button[11]) {
                a = a / 10;
            }

            else if (e.getSource()==button[12]) {
                label.setText(String.valueOf(a) + " *");
                isA = false;
                o = 1;
            }

            else if (e.getSource()==button[13]) {
                label.setText(String.valueOf(a) + " /");
                isA = false;
                o = 2;
            }

            else if (e.getSource()==button[14]) {
                label.setText(String.valueOf(a) + " +");
                isA = false;
                o = 3;
            }

            else if (e.getSource()==button[15]) {
                label.setText(String.valueOf(a) + " -");
                isA = false;
                o = 4;
            }
            if (isA) {
                label.setText(String.valueOf(a));   
            }
        }
        else {
            if (e.getSource()==button[0]) {
                b = b * 10 + 1;
            }
            
            else if (e.getSource()==button[1]) {
                b = b * 10 + 2;
            }

            else if (e.getSource()==button[2]) {
                b = b * 10 + 3;
            }
            
            else if (e.getSource()==button[3]) {
                b = b * 10 + 4;
            }
            
            else if (e.getSource()==button[4]) {
                b = b * 10 + 5;
            }
            
            else if (e.getSource()==button[5]) {
                b = b * 10 + 6;
            }
            
            else if (e.getSource()==button[6]) {
                b = b * 10 + 7;
            }
            
            else if (e.getSource()==button[7]) {
                b = b * 10 + 8;
            }
            
            else if (e.getSource()==button[8]) {
                b = b * 10 + 9;
            }

            else if (e.getSource()==button[9]) {
                b = b * 10;
            }

            else if (e.getSource()==button[11]) {
                b = b / 10;
            }

            else if (e.getSource()==button[12]) {
                c = '*';
                switch (o) {
                    case 1:
                        a = a * b;
                        break;
        
                    case 2:
                        if (b == 0) {
                            label.setText("ERROR");
                        }
                        else {
                        a = a / b;
                        }
                        break;
        
                    case 3:
                        a = a + b;
                        break;
                    
                    case 4:
                        a = a - b;
                        break;
        
                    default:
                        break;
                }
                b = 0;
                o = 1;
            }

            else if (e.getSource()==button[13]) {
                c = '/';
                switch (o) {
                    case 1:
                        a = a * b;
                        break;
        
                    case 2:
                        if (b == 0) {
                            label.setText("ERROR");
                        }
                        else {
                        a = a / b;
                        }
                        break;
        
                    case 3:
                        a = a + b;
                        break;
                    
                    case 4:
                        a = a - b;
                        break;
        
                    default:
                        break;
                }
                b = 0;
                o = 2;

            }

            else if (e.getSource()==button[14]) {
                c = '+';
                switch (o) {
                    case 1:
                        a = a * b;
                        break;
        
                    case 2:
                        if (b == 0) {
                            label.setText("ERROR");
                        }
                        else {
                        a = a / b;
                        }
                        break;
        
                    case 3:
                        a = a + b;
                        break;
                    
                    case 4:
                        a = a - b;
                        break;
        
                    default:
                        break;
                }
                o = 3;
                b = 0;
                }

            else if (e.getSource()==button[15]) {
                c = '-';
                switch (o) {
                    case 1:
                        a = a * b;
                    break;
        
                    case 2:
                        if (b == 0) {
                            label.setText("ERROR");
                        }
                        else {
                        a = a / b;
                        }
                        break;
        
                    case 3:
                        a = a + b;
                        break;
                    
                    case 4:
                        a = a - b;
                        break;
        
                    default:
                        break;
                }
                o = 4;
                b = 0;
            }

            if (e.getSource()==button[16]) {
                switch (o) {
                    case 1:
                        label.setText(String.valueOf(a * b));
                        a = a * b;
                    break;
        
                    case 2:
                        if (b == 0) {
                            label.setText("ERROR");
                        }
                        else {
                            label.setText(String.valueOf(a / b));
                            a = a / b;
                        }
                        break;
        
                    case 3:
                        label.setText(String.valueOf(a + b));;
                        a = a + b;
                        break;
                    
                    case 4:
                        label.setText(String.valueOf(a - b));
                        a = a - b;
                        break;
        
                    default:
                        break;
                }
                b = 0;
                isA = true;
            }
            else {
                label.setText(String.valueOf(a) + " " + c + " " + String.valueOf(b));
            }
        }
        
    }
}
