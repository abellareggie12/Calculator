
import javax.swing.*;
import java.awt.*;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FinalCalculator extends JFrame
{
   
   public FinalCalculator() {
      super("Calculator");
              
      JTextField txtfld = new JTextField();
      JButton jbBackspace = new JButton("\u2190"); 
      JButton jbCE = new JButton("CE");
      JButton jbC = new JButton("C");
      JButton jbPlusMinus = new JButton("±");
      JButton jbSqrt = new JButton("\u221A"); 
      JButton jbDivide = new JButton("/");
      JButton jbPercent = new JButton("%");
      JButton jbMultiplication = new JButton("*");
      JButton jb1X = new JButton("1/x");
      JButton jbSubtract = new JButton("-");
      JButton jbAdd = new JButton("+");
      JButton jbResults = new JButton("=");
      JButton jb1 = new JButton("1");
      JButton jb2 = new JButton("2");
      JButton jb3 = new JButton("3");
      JButton jb4 = new JButton("4");
      JButton jb5 = new JButton("5");
      JButton jb6 = new JButton("6");
      JButton jb7 = new JButton("7");
      JButton jb8 = new JButton("8");
      JButton jb9 = new JButton("9");
      JButton jb0 = new JButton("0");
      JButton jbDecimal = new JButton(".");
      
      Container c = this.getContentPane();
      c.setLayout(null);
      
      Operator operator = new Operator();
      
      txtfld.setBounds(10, 13, 196, 50);
      txtfld.setFont( new Font( "Segoe UI", Font.BOLD, 20 ) );
      txtfld.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
      txtfld.setEditable(false);
      c.add(txtfld);
      
      txtfld.setText("0");
   
      //1st Line

      Memory m = new Memory();
      
      
      
      //2nd Line
      jbBackspace.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            txtfld.setText(txtfld.getText().substring(0, txtfld.getText().length() - 1));
         }
      });

      jbBackspace.setBounds(10, 105, 35, 30);
      jbBackspace.setFont( new Font( "Segoe UI", Font.BOLD, 30 ) );
      jbBackspace.setMargin(new Insets(1,1,1,1));
      c.add(jbBackspace);
      
      jbCE.setBounds(50, 105, 35, 30);
      jbCE.setFont( new Font( "Segoe UI", Font.PLAIN, 12 ) );
      jbCE.setMargin(new Insets(1,1,1,1));
      c.add(jbCE);
      
      jbCE.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            txtfld.setText("0");
         }
      });
      
      jbC.setBounds(90, 105, 35, 30);
      jbC.setFont( new Font( "Segoe UI", Font.PLAIN, 12 ) );
      jbC.setMargin(new Insets(1,1,1,1));
      c.add(jbC);
      
      jbC.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            txtfld.setText("0");
            operator.num1 = 0;
         }
      });
      
      jbPlusMinus.setBounds(130, 105, 35, 30);
      jbPlusMinus.setFont( new Font( "Segoe UI", Font.PLAIN, 12 ) );
      jbPlusMinus.setMargin(new Insets(1,1,1,1));
      c.add(jbPlusMinus);
      
      jbPlusMinus.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            operator.operator = "PlusMinus";
            operator.num1 = Double.parseDouble(txtfld.getText());
            txtfld.setText(operator.PlusMinus(operator.num1)+"");
         }
      });
      
      jbSqrt.setBounds(170, 105, 35, 30);
      jbSqrt.setFont( new Font( "Segoe UI", Font.PLAIN, 12 ) );
      jbSqrt.setMargin(new Insets(1,1,1,1));
      c.add(jbSqrt);
      
      jbSqrt.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            operator.num1 = Double.parseDouble(txtfld.getText());
            operator.operator = "Sqrt";
            txtfld.setText(operator.Sqrt(operator.num1)+"");
         }
      });
      
      
      //3rd Line
      jb7.setBounds(10, 140, 35, 30);
      jb7.setFont( new Font( "Segoe UI", Font.PLAIN, 16 ) );
      jb7.setMargin(new Insets(1,1,1,1));
      c.add(jb7);
      
      jb7.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            if(!txtfld.getText().equals("0")) 
            {
               
               txtfld.setText(txtfld.getText() + "7");
            
            }else if (txtfld.getText().equals("0"))
            {
               
               txtfld.setText("7");
            }  
         }
      });
      
      jb8.setBounds(50, 140, 35, 30);
      jb8.setFont( new Font( "Segoe UI", Font.PLAIN, 16 ) );
      jb8.setMargin(new Insets(1,1,1,1));
      c.add(jb8);
      
      jb8.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            
            if(!txtfld.getText().equals("0")) 
            {
               
               txtfld.setText(txtfld.getText() + "8");
               
            }else if (txtfld.getText().equals("0"))
            {
               
               txtfld.setText("8");
               
            }  
         }
      });
      
      jb9.setBounds(90, 140, 35, 30);
      jb9.setFont( new Font( "Segoe UI", Font.PLAIN, 16 ) );
      jb9.setMargin(new Insets(1,1,1,1));
      c.add(jb9);
      
      jb9.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            if(!txtfld.getText().equals("0")) 
            {
               
               txtfld.setText(txtfld.getText() + "9");
            
            }else if (txtfld.getText().equals("0"))
            {
               
               txtfld.setText("9");
            }  
         }
      });
      
      jbDivide.setBounds(130, 140, 35, 30);
      jbDivide.setFont( new Font( "Segoe UI", Font.PLAIN, 12 ) );
      jbDivide.setMargin(new Insets(1,1,1,1));
      c.add(jbDivide);
      
      jbDivide.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            operator.num1 = Double.parseDouble(txtfld.getText());
            operator.operator = "Divide";
            txtfld.setText("0");
         }
      });
      
      jbPercent.setBounds(170, 140, 35, 30);
      jbPercent.setFont( new Font( "Segoe UI", Font.PLAIN, 12 ) );
      jbPercent.setMargin(new Insets(1,1,1,1));
      c.add(jbPercent);
      
      jbPercent.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            
            operator.num2 = Double.parseDouble(txtfld.getText());
            txtfld.setText(operator.Percent(operator.num2)+"");
            
         }
      });
            
      
      
      
      //4th Line
      jb4.setBounds(10, 175, 35, 30);
      jb4.setFont( new Font( "Segoe UI", Font.PLAIN, 16 ) );
      jb4.setMargin(new Insets(1,1,1,1));
      c.add(jb4);
      
      jb4.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            if(!txtfld.getText().equals("0")) 
            {
               
               txtfld.setText(txtfld.getText() + "4");
            
            }else if (txtfld.getText().equals("0"))
            {
               
               txtfld.setText("4");
            }  
         }
      });
      
      jb5.setBounds(50, 175, 35, 30);
      jb5.setFont( new Font( "Segoe UI", Font.PLAIN, 16 ) );
      jb5.setMargin(new Insets(1,1,1,1));
      c.add(jb5);
      
      jb5.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            if(!txtfld.getText().equals("0")) 
            {
               
               txtfld.setText(txtfld.getText() + "5");
            
            }else if (txtfld.getText().equals("0"))
            {
               
               txtfld.setText("5");
            }  
         }
      });
      
      jb6.setBounds(90, 175, 35, 30);
      jb6.setFont( new Font( "Segoe UI", Font.PLAIN, 16 ) );
      jb6.setMargin(new Insets(1,1,1,1));
      c.add(jb6);
      
      jb6.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            if(!txtfld.getText().equals("0")) 
            {
               
               txtfld.setText(txtfld.getText() + "6");
            
            }else if (txtfld.getText().equals("0"))
            {
               
               txtfld.setText("6");
            }  
         }
      });
      
      jbMultiplication.setBounds(130, 175, 35, 30);
      jbMultiplication.setFont( new Font( "Segoe UI", Font.PLAIN, 12 ) );
      jbMultiplication.setMargin(new Insets(1,1,1,1));
      c.add(jbMultiplication);
      
      jbMultiplication.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) {
            operator.num1 = Double.parseDouble(txtfld.getText());
            operator.operator = "Multiply";
            txtfld.setText("0");
         }
      });
      
      jb1X.setBounds(170, 175, 35, 30);
      jb1X.setFont( new Font( "Segoe UI", Font.PLAIN, 12 ) );
      jb1X.setMargin(new Insets(1,1,1,1));
      c.add(jb1X);
      
      jb1X.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            operator.num1 = Double.parseDouble(txtfld.getText());
            operator.operator = "reciprocal";
            txtfld.setText(operator.Reciprocal(operator.num1)+"");
         }
      });
      
      //5th Line
      jb1.setBounds(10, 210, 35, 30);
      jb1.setFont( new Font( "Segoe UI", Font.PLAIN, 16 ) );
      jb1.setMargin(new Insets(1,1,1,1));
      c.add(jb1);
      
      jb1.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            if(!txtfld.getText().equals("0")) 
            {
               
               txtfld.setText(txtfld.getText() + "1");
            
            }else if (txtfld.getText().equals("0"))
            {
               
               txtfld.setText("1");
            }  
         }
      });
      
      jb2.setBounds(50, 210, 35, 30);
      jb2.setFont( new Font( "Segoe UI", Font.PLAIN, 16 ) );
      jb2.setMargin(new Insets(1,1,1,1));
      c.add(jb2);
      
      jb2.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            if(!txtfld.getText().equals("0")) 
            {
               
               txtfld.setText(txtfld.getText() + "2");
            
            }else if (txtfld.getText().equals("0"))
            {
               
               txtfld.setText("2");
            }  
         }
      });
      
      jb3.setBounds(90, 210, 35, 30);
      jb3.setFont( new Font( "Segoe UI", Font.PLAIN, 16 ) );
      jb3.setMargin(new Insets(1,1,1,1));
      c.add(jb3);
      
      jb3.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            if(!txtfld.getText().equals("0")) 
            {
               
               txtfld.setText(txtfld.getText() + "3");
            
            }else if (txtfld.getText().equals("0"))
            {
               
               txtfld.setText("3");
            }  
         }
      });
      
      jbSubtract.setBounds(130, 210, 35, 30);
      jbSubtract.setFont( new Font( "Segoe UI", Font.PLAIN, 16 ) );
      jbSubtract.setMargin(new Insets(1,1,1,1));
      c.add(jbSubtract);
      
      jbSubtract.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            operator.num1 = Double.parseDouble(txtfld.getText());
            operator.operator = "Subtract";
            txtfld.setText("0");
         }
      });
      
      jbResults.setBounds(170, 210, 35, 63);
      jbResults.setFont( new Font( "Segoe UI", Font.BOLD, 18 ) );
      jbResults.setMargin(new Insets(1,1,1,1));
      c.add(jbResults);
      
      jbResults.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            operator.num2 = Double.parseDouble(txtfld.getText());
            
            if(operator.operator.equals("Sum")) 
            {
               txtfld.setText(operator.Sum(operator.num1, operator.num2)+"");
            }
            
            if(operator.operator.equals("Subtract")) 
            {
               txtfld.setText(operator.Subtract(operator.num1, operator.num2)+"");
            }
            
            if(operator.operator.equals("Multiply")) 
            {
               txtfld.setText(operator.Multiply(operator.num1, operator.num2)+"");
            }
            
            if(operator.operator.equals("Divide")) 
            {
               txtfld.setText(operator.Divide(operator.num1, operator.num2)+"");
            }
            
         }
      });
      
      //6th Line
      jb0.setBounds(10, 245, 75, 30);
      jb0.setFont( new Font( "Segoe UI", Font.PLAIN, 16 ) );
      jb0.setMargin(new Insets(1,1,1,1));
      c.add(jb0);
      
      jb0.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            if(!txtfld.getText().equals("0")) 
            {
               
               txtfld.setText(txtfld.getText() + "0");
            
            }else if (txtfld.getText().equals("0"))
            {
               
               txtfld.setText("0");
            }  
         }
      });
      
      jbDecimal.setBounds(90, 245, 35, 30);
      jbDecimal.setFont( new Font( "Segoe UI", Font.PLAIN, 16 ) );
      jbDecimal.setMargin(new Insets(1,1,1,1));
      c.add(jbDecimal);
      
      jbDecimal.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            if(!txtfld.getText().contains(".")) 
            {
               if(!txtfld.getText().equals("0")) 
               {
                  
                  txtfld.setText(txtfld.getText() + ".");
               
               }else if (txtfld.getText().equals("0"))
               {
                  
                  txtfld.setText(".");
                  
               }
            }
         }
      });
      
      jbAdd.setBounds(130, 245, 35, 30);
      jbAdd.setFont( new Font( "Segoe UI", Font.PLAIN, 16 ) );
      jbAdd.setMargin(new Insets(1,1,1,1));
      c.add(jbAdd);
      
      jbAdd.addActionListener(new ActionListener() 
      {
         public void actionPerformed(ActionEvent e) 
         {
            operator.num1 = Double.parseDouble(txtfld.getText());
            operator.operator = "Sum";
            txtfld.setText("0");
         }
      });
         
      this.setVisible(true);
      this.setSize(230,320);
      this.setResizable(false);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
//Operator 

public class Operator 
   {

	public double num1;
	public double num2;
	public double rslt;
	public String operator;

	public double Sum(double num1, double num2) 
   {
		rslt = num1 + num2;
		return rslt;
	}

	public double Subtract(double num1, double num2) 
   {
		rslt = num1 - num2;
		return rslt;
	}

	public double Multiply(double num1, double num2) 
   {
		rslt = num1 * num2;
		return rslt;
	}

	public double Divide(double num1, double num2) 
   {
		rslt = num1 / num2;
		return rslt;
	}

	public double PlusMinus(double num1) 
   {
		num1 *= (-1);
		return num1;
	}

	public double Sqrt(double num1) 
   {
		rslt = Math.sqrt(num1);
		return rslt;
	}

	public double Reciprocal(double num1) 
   {
		rslt = 1/num1;
		return rslt;
	}

	public double Percent(double num2) 
   {

		rslt = num1*(num2/100);

		return rslt;
	}

}

public class Memory 
   {

	    public double MS;
	    public double MemorySave(double MS) 
          {
	   	    return MS;
	       }

   }

 
   
   public static void main (String[]args) 
   {
      FinalCalculator calc = new FinalCalculator();
   }
}
