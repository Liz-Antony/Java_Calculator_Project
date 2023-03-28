/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author eliza
 */
public class Calculator implements ActionListener{
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton zeroButton;
    JButton equalButton;
    JButton dotButton;
    JButton divButton;
    JButton mulButton;
    JButton minusButton;
    JButton plusButton,clearButton,delButton;
    String oldValue;
    boolean isOperatorClicked = false;
    char operator;
    float resultAssign;
    
      

 public Calculator(){
     jf = new JFrame("Calculator");
     jf.setLayout(null);
     jf.setSize(600,600);
     jf.setLocation(200, 150);
     
     Font font=new Font("Impact",Font.BOLD,25);
     
     displayLabel = new JLabel();
     displayLabel.setBounds(30, 30, 540, 40);
     displayLabel.setBackground(Color.GRAY);
     displayLabel.setOpaque(true);
     displayLabel.setHorizontalAlignment(SwingConstants.RIGHT); 
     displayLabel.setForeground(Color.white);
     jf.add(displayLabel);
     displayLabel.setFont(font);
     
     
     
     sevenButton = new JButton("7");
     sevenButton.setBounds(30,130,80,80);
     jf.add(sevenButton);
     sevenButton.setFont(font);
     sevenButton.addActionListener(this);
     
     eightButton = new JButton("8");
     eightButton.setBounds(130,130,80,80);
     jf.add(eightButton);
     eightButton.setFont(font);
     eightButton.addActionListener(this);
     
     nineButton = new JButton("9");
     nineButton.setBounds(230,130,80,80);
     jf.add(nineButton);
     nineButton.setFont(font);
     nineButton.addActionListener(this);
     
     fourButton = new JButton("4");
     fourButton.setBounds(30,230,80,80);
     jf.add(fourButton);
     fourButton.setFont(font);
     fourButton.addActionListener(this);
     
     fiveButton = new JButton("5");
     fiveButton.setBounds(130,230,80,80);
     jf.add(fiveButton);
     fiveButton.setFont(font);
     fiveButton.addActionListener(this);
     
     sixButton = new JButton("6");
     sixButton.setBounds(230,230,80,80);
     jf.add(sixButton);
     sixButton.setFont(font);
     sixButton.addActionListener(this);
     
     oneButton = new JButton("1");
     oneButton.setBounds(30,330,80,80);
     jf.add(oneButton);
     oneButton.setFont(font);
     oneButton.addActionListener(this);
     
     twoButton = new JButton("2");
     twoButton.setBounds(130,330,80,80);
     jf.add(twoButton);
     twoButton.setFont(font);
     twoButton.addActionListener(this);
     
     threeButton = new JButton("3");
     threeButton.setBounds(230,330,80,80);
     jf.add(threeButton);
     threeButton.setFont(font);
     threeButton.addActionListener(this);
     
     dotButton = new JButton(".");
     dotButton.setBounds(30,430,80,80);
     jf.add(dotButton);
     dotButton.setFont(font);
     dotButton.addActionListener(this);
     
     zeroButton = new JButton("0");
     zeroButton.setBounds(130,430,80,80);
     jf.add(zeroButton);
     zeroButton.setFont(font);
     zeroButton.addActionListener(this);
     
     equalButton = new JButton("=");
     equalButton.setBounds(230,430,80,80);
     jf.add(equalButton);
     equalButton.setFont(font);
     equalButton.addActionListener(this);
     
     divButton = new JButton("/");
     divButton.setBounds(330,130,80,80);
     jf.add(divButton);
     divButton.setFont(font);
     divButton.addActionListener(this);
     
     mulButton = new JButton("*");
     mulButton.setBounds(330,230,80,80);
     jf.add(mulButton);
     mulButton.setFont(font);
     mulButton.addActionListener(this);
     
     minusButton = new JButton("-");
     minusButton.setBounds(330,330,80,80);
     jf.add(minusButton);
     minusButton.setFont(font);
     minusButton.addActionListener(this);
     
     plusButton = new JButton("+");
     plusButton.setBounds(330,430,80,80);
     jf.add(plusButton);
     plusButton.setFont(font);
     plusButton.addActionListener(this);
     
     clearButton = new JButton("CL");
      clearButton.setBounds(430,430,80,80);
     jf.add(clearButton);
     clearButton.setFont(font);
     clearButton.addActionListener(this);
     
     
     delButton = new JButton("DEL");
     delButton.setBounds(430,330,80,80);
     jf.add(delButton);
     delButton.setFont(font);
     delButton.addActionListener(this);
     
     
   
     
     jf.setVisible(true);
     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public static void main(String[] args){
     new Calculator();
 }   

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == sevenButton) 
            {
              if(isOperatorClicked)
              {
               displayLabel.setText("7"); 
                isOperatorClicked=false;
              }
              else
              {
               displayLabel.setText(displayLabel.getText()+"7");
              }
            }
       else if(e.getSource() == eightButton)
            {
              if(isOperatorClicked)
              {
               displayLabel.setText("8"); 
                isOperatorClicked=false;
              }
              else
              {
               displayLabel.setText(displayLabel.getText()+"8");
              }
            }
       else if(e.getSource() == nineButton)
            {
              if(isOperatorClicked)
              {
               displayLabel.setText("9"); 
                isOperatorClicked=false;
              }
              else
              {
               displayLabel.setText(displayLabel.getText()+"9");
              }
            }
       else if(e.getSource() == fourButton)
            {
              if(isOperatorClicked)
              {
               displayLabel.setText("4"); 
                isOperatorClicked=false;
              }
              else
              {
               displayLabel.setText(displayLabel.getText()+"4");
              }
            }
       else if(e.getSource() == fiveButton)
            {
              if(isOperatorClicked)
              {
               displayLabel.setText("5"); 
                isOperatorClicked=false;
              }
              else
              {
               displayLabel.setText(displayLabel.getText()+"5");
              }
            }
       else if(e.getSource() == sixButton)
            {
              if(isOperatorClicked)
              {
               displayLabel.setText("6"); 
                isOperatorClicked=false;
              }
              else
              {
               displayLabel.setText(displayLabel.getText()+"6");
              }
            }
       else if(e.getSource() == oneButton)
            {
              if(isOperatorClicked)
              {
               displayLabel.setText("1"); 
                isOperatorClicked=false;
              }
              else
              {
               displayLabel.setText(displayLabel.getText()+"1");
              }
            }
       else if(e.getSource() == twoButton)
            {
              if(isOperatorClicked)
              {
               displayLabel.setText("2"); 
                isOperatorClicked=false;
              }
              else
              {
               displayLabel.setText(displayLabel.getText()+"2");
              }
            }
       else if(e.getSource() == threeButton)
            {
              if(isOperatorClicked)
              {
               displayLabel.setText("3"); 
                isOperatorClicked=false;
              }
              else
              {
               displayLabel.setText(displayLabel.getText()+"3");
              }
            }
       else if(e.getSource() == zeroButton)
            {
              if(isOperatorClicked)
              {
               displayLabel.setText("0"); 
                isOperatorClicked=false;
              }
              else
              {
               displayLabel.setText(displayLabel.getText()+"0");
              }
            }
       else if(e.getSource() == dotButton)
            {
              if(isOperatorClicked)
              {
               displayLabel.setText("."); 
                isOperatorClicked=false;
              }
              else
              {
               displayLabel.setText(displayLabel.getText()+".");
              }
            }
       else if(e.getSource() == mulButton)
            {
                isOperatorClicked = true;
                oldValue=displayLabel.getText();
                float oldValueF =Float.parseFloat(oldValue);
                operator ='*';
                displayLabel.setText("");
            }
       else if(e.getSource() == divButton)
            {
                isOperatorClicked = true;
                oldValue=displayLabel.getText();
                float oldValueF =Float.parseFloat(oldValue);
                operator='/';
                displayLabel.setText("");
            }
       else if(e.getSource() == plusButton)
            {
                isOperatorClicked = true;
                oldValue=displayLabel.getText();
                float oldValueF =Float.parseFloat(oldValue);
                operator='+';
                displayLabel.setText("");
            }
       else if(e.getSource() == minusButton)
            {
                isOperatorClicked = true;
                oldValue=displayLabel.getText();
                float oldValueF =Float.parseFloat(oldValue);
                operator='-';
                displayLabel.setText("");
            }
       else if(e.getSource() == equalButton)
              {
              String newValue=displayLabel.getText();
              float oldValueF =Float.parseFloat(oldValue);
              float newValueF = Float.parseFloat(newValue);
              
         
              displayLabel.setText("");
              
              switch(operator){
                  case'+':
                      resultAssign=oldValueF+newValueF;
                      break;
                  case'-':
                        resultAssign=oldValueF-newValueF;
                        break; 
                  case'*':
                       resultAssign=oldValueF*newValueF;
                       break;
                  case'/':
                   resultAssign=oldValueF/newValueF;
                   break;
              }
              displayLabel.setText(String.valueOf(resultAssign));
             
              
              
              
            }
       
       else if(e.getSource() == clearButton)
            {
              displayLabel.setText("");
            }
       else if(e.getSource() ==delButton)
       {
         String stringVal = displayLabel.getText();
         displayLabel.setText("");
         for(int i=0;i<stringVal.length()-1;i++){
            displayLabel.setText(displayLabel.getText()+stringVal.charAt(i));
         }
       }
       
    }
}
