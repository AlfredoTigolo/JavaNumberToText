import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class NumberToWord extends JPanel implements ActionListener
{
	protected JTextField textField;
	protected JTextArea textArea;
	protected JButton btnEnter;
	protected JButton btnClear;
	private final static String newline = "\n";
	
	public NumberToWord () {
		super (new GridBagLayout());
		
		textField = new JTextField(20);
		textField.addActionListener(this);
		
		textArea = new JTextArea(5,20);
		textArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(textArea);
		
		btnEnter = new JButton ("Enter");
		btnEnter.addActionListener(this);
		
		btnClear = new JButton ("Clear");
		btnClear.addActionListener(this);
		
		//Add components to this panel
		GridBagConstraints c = new GridBagConstraints();
		c.gridwidth = GridBagConstraints.REMAINDER;
		
		c.fill = GridBagConstraints.HORIZONTAL;
		add(textField, c);
		
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		c.weighty = 1.0;
		add (scrollPane, c);
		
		add ( btnEnter );
		add ( btnClear );
	}
	
	
	private static void createAndShowGUI() {
		
		//Create and set up the window.
		JFrame frame = new JFrame("TextDemo");
		//JTextField inputField = new JTextField(4);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//inputField.addActionListener(this);
		
		JLabel label = new JLabel("Hello World");
		frame.getContentPane().add(label);		
		
		frame.add(new NumberToWord());
		//frame.getContentPane().add(inputField);
		
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public String StringToInteger ( String st )
	{
		int num = Integer.parseInt(st.toString());
		
		//debugging
		// System.out.println("string length " + st.length());
		
		if (st.length() == 1)
		{
		switch ( num ) {
			case 1:
				return "one";			
			case 2:
				return "two";
			case 3:
				return "three";
			case 4:
				return "four";			
			case 5:
				return "five";
			case 6:
				return "six";
			case 7:
				return "seven";			
			case 8:
				return "eight";
			case 9:
				return "nine";			
			}
		}
		
		if (st.length() == 2)
		{
		switch ( num ) {
			case 10:
				return "ten";
			case 11:
				return "eleven";			
			case 12:
				return "twelve";
			case 13:
				return "thirteen";			
			case 14:
				return "forteen";
			case 15:
				return "fifteen";			
			case 16:
				return "sixteen";
			case 17:
				return "seventeen";			
			case 18:
				return "eighteen";
			case 19:
				return "ninteen";
				
			case 20: case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29:
				//return "twenty " + st.charAt(1);
				return "twenty " + StringToInteger( Character.toString ( st.charAt(1)));
			
			case 30: case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39:
				return "thirty " + StringToInteger( Character.toString ( st.charAt(1)));
			
			case 40: case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49:
				return "forty " + StringToInteger( Character.toString ( st.charAt(1)));
				
			case 50: case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59:
				return "fifty " + StringToInteger( Character.toString ( st.charAt(1)));
				
			case 60: case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69:
				return "sixty " + StringToInteger( Character.toString ( st.charAt(1)));
				
			case 70: case 71: case 72: case 73: case 74: case 75: case 76: case 77: case 78: case 79:
				return "seventy " + StringToInteger( Character.toString ( st.charAt(1)));
				
			case 80: case 81: case 82: case 83: case 84: case 85: case 86: case 87: case 88: case 89:
				return "eighty " + StringToInteger( Character.toString ( st.charAt(1)));
				
			case 90: case 91: case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99:
				return "ninty " + StringToInteger( Character.toString ( st.charAt(1)));
			}
		}
		
		if ( st.length() == 3 )
		{
			if ( num >= 100 && num <= 109 ||
				 num >= 200 && num <= 209 || 
				 num >= 300 && num <= 309 ||
				 num >= 400 && num <= 409 ||
				 num >= 500 && num <= 509 ||
				 num >= 600 && num <= 609 ||
				 num >= 700 && num <= 709 ||
				 num >= 800 && num <= 809 ||
				 num >= 900 && num <= 909
			   )
			{
				return StringToInteger( Character.toString ( st.charAt(0))) + " hundred " +
						StringToInteger (st.substring(1,3)) + StringToInteger( Character.toString (st.charAt(2)));
			}
			else
			{
				return StringToInteger( Character.toString ( st.charAt(0))) + " hundred " +
						StringToInteger (st.substring(1,3)); //+ StringToInteger( Character.toString (st.charAt(2)));
			}
					
		}
		
		if ( st.length() == 4 )
		{
			if ( num >= 1000 && num <= 1009 ||
				 num >= 2000 && num <= 2009 ||
				 num >= 3000 && num <= 3009 ||
				 num >= 4000 && num <= 4009 ||
				 num >= 5000 && num <= 5009 ||
				 num >= 6000 && num <= 6009 ||
				 num >= 7000 && num <= 7009 ||
				 num >= 8000 && num <= 8009 ||
				 num >= 9000 && num <= 9009
			    )
			{
			return StringToInteger( Character.toString ( st.charAt(0))) + " thousand " +
					StringToInteger( Character.toString ( st.substring(1,4).charAt(2)));
			}
			else if ( num >= 1010 && num <= 1099 ||
					  num >= 2010 && num <= 2099 ||
					  num >= 3010 && num <= 3099 ||
					  num >= 4010 && num <= 4099 ||
					  num >= 5010 && num <= 5099 ||
					  num >= 6010 && num <= 6099 ||
					  num >= 7010 && num <= 7099 ||
					  num >= 8010 && num <= 8099 ||
					  num >= 9010 && num <= 9099
					)
			{
				return StringToInteger( Character.toString ( st.charAt(0))) + " thousand " +
					StringToInteger( st.substring(2,4));
					//st.substring(1,4);
			}
			else
			{
				return StringToInteger( Character.toString ( st.charAt(0))) + " thousand " +
					StringToInteger( st.substring(1,4));
					//st.substring(1,4);
			}
		}
		
		if ( st.length() == 5 )
		{
			if ( num >= 10000 && num <= 10009 ||
				 num >= 11000 && num <= 11009 || 
				 num >= 12000 && num <= 12009 || 
				 num >= 13000 && num <= 13009 || 
				 num >= 14000 && num <= 14009 || 
				 num >= 15000 && num <= 15009 || 
				 num >= 16000 && num <= 16009 || 
				 num >= 17000 && num <= 17009 ||
				 num >= 18000 && num <= 18009 || 
				 num >= 19000 && num <= 19009 || 				 
				 num >= 20000 && num <= 20009 || 
				 num >= 30000 && num <= 30009 || 
				 num >= 40000 && num <= 40009 || 
				 num >= 50000 && num <= 50009 || 
				 num >= 60000 && num <= 60009 || 
				 num >= 70000 && num <= 70009 || 
				 num >= 80000 && num <= 80009 || 
				 num >= 90000 && num <= 90009 
				)
			{
					return StringToInteger(st.substring(0,2)) + " thousand " + 
						StringToInteger ( Character.toString (st.charAt(4)));
			}
			else if ( num >= 10010 && num <= 10099 ||
			 		  num >= 20010 && num <= 20099 ||
			 		  num >= 30010 && num <= 30099 ||
			 		  num >= 40010 && num <= 40099 ||
			 		  num >= 50010 && num <= 50099 ||
			 		  num >= 60010 && num <= 60099 ||
			 		  num >= 70010 && num <= 70099 ||
			 		  num >= 80010 && num <= 80099 ||
			 		  num >= 90010 && num <= 90099 
					)
			{
				return StringToInteger(st.substring(0,2)) + " thousand " + 
						StringToInteger( st.substring (3,5));
						//StringToInteger ( Character.toString (st.charAt(4)));
			}
			else
			{
					return StringToInteger(st.substring(0,2)) + " thousand " + 
						StringToInteger( st.substring (2,5));
						//StringToInteger ( Character.toString (st.charAt(4)));
			}
				
		}
		return "";
		
	}
	
	public String StringToInteger2 ( String st )
	{
		int num = Integer.parseInt( st.toString() );
		
		String numStr = "";
		
		String[] num1to19 = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
							"eleven", "twelve", "thirteen", "fourteen", "fiveteen", "sixteen", "seventeen",
							"eighteen", "nineteen"};
		
		String[] num20to100 = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred" };
		
		if ( num < 20 )
		{
			numStr = num1to19[num];
		}
		else if ( num >= 20 && num <= 59 )
		{
			int i = st.charAt(0) % 6;
			//System.out.println((int)st.charAt(0) % 6);
			//System.out.println(i);
			numStr = num20to100[ i ] +" "+
					//st.charAt(1);
					StringToInteger2 ( Character.toString ( st.charAt(1) ));
			
		}
		else if ( num >= 60 && num <= 79 )
		{
			int i = st.charAt(0) % 7;
			//System.out.println((int)st.charAt(0) % 6);
			//System.out.println(i);
			numStr = num20to100[ i + 1] +" "+
					//st.charAt(1);
					StringToInteger2 ( Character.toString ( st.charAt(1) ));
		}
		else if ( num >= 80 && num <= 99 )
		{
			int i = st.charAt(0) % 7;
			//System.out.println((int)st.charAt(0) % 6);
			//System.out.println(i);
			numStr = num20to100[ i + 8] +" "+
					//st.charAt(1);
					StringToInteger2 ( Character.toString ( st.charAt(1) ));
		}
		else if ( num >= 100 && num <=109 )
		{
			int i = st.charAt(0) % 7;
			//System.out.println((int)st.charAt(0) % 7);
			//System.out.println(i);
			numStr = StringToInteger2 ( Character.toString ( st.charAt(0) )) +" "+
					num20to100[ i + 10] +" "+
					//st.charAt(1);
					//StringToInteger2 ( st.substring(1,2) ) +" test "+
					//StringToInteger2 ( st.substring(1,3) ) +" "+
					//StringToInteger2 ( st.substring(0,2) ) +" "+
					StringToInteger2 ( Character.toString ( st.charAt(2) )					
					);
					//System.out.println ( st.substring (1,3) + " test ");
		}
		else if ( st.length() == 3 )
		{
			//int i = st.charAt(0) % 2;
			//System.out.println((int)st.charAt(0) % 7);
			//System.out.println(i);
			numStr = StringToInteger2 ( Character.toString ( st.charAt(0) )) + " hundred "+
					//num20to100[i + 10] +" "+
					//st.charAt(1);
					//StringToInteger2 ( st.substring(1,2) ) +" test "+
					StringToInteger2 ( st.substring(1,3) )
					//StringToInteger2 ( st.substring(0,1) )
					//StringToInteger2 ( Character.toString ( st.charAt(2) )					
					;
					//System.out.println ( st.substring (1,3) + " test ");
		}
		else if ( num >= 1000 && num <= 1009 || num >= 2000 && num <= 2009)
		{
			//int i = st.charAt(0) % 2;
			//System.out.println((int)st.charAt(0) % 7);
			//System.out.println(i);
			numStr = StringToInteger2 ( Character.toString ( st.charAt(0) )) + " thousand "+
					//num20to100[i + 10] +" "+
					//st.charAt(1);
					//StringToInteger2 ( st.substring(1,2) ) +" test "+
					//StringToInteger2 ( st.substring(1,3) )
					//StringToInteger2 ( st.substring(0,1) )
					StringToInteger2 ( Character.toString ( st.charAt(3) ))					
					;
					//System.out.println ( st.substring (1,3) + " test ");
		}
		else if ( num >= 1010 && num <= 1099 || num >= 2010 && num <= 2099)
		{
			//int i = st.charAt(0) % 2;
			//System.out.println((int)st.charAt(0) % 7);
			//System.out.println(i);
			numStr = StringToInteger2 ( Character.toString ( st.charAt(0) )) + " thousand "+
					//num20to100[i + 10] +" "+
					//StringToInteger2 ( Character.toString ( st.charAt(2) )) + " hundred "+
					//StringToInteger2 ( st.substring(1,3) ) + " " +
					StringToInteger2 ( st.substring(2,4) )
					//StringToInteger2 ( st.substring(0,1) )
					//StringToInteger2 ( Character.toString ( st.charAt(3) ))					
					;
					//System.out.println ( st.substring (1,3) + " test ");
		}
		
		else if ( st.length() == 4)
		{
			//int i = st.charAt(0) % 2;
			//System.out.println((int)st.charAt(0) % 7);
			//System.out.println(i);
			numStr = StringToInteger2 ( Character.toString ( st.charAt(0) )) + " thousand "+
					//num20to100[i + 10] +" "+
					StringToInteger2 ( Character.toString ( st.charAt(1) )) + " hundred "+
					//StringToInteger2 ( st.substring(1,3) ) + " " +
					StringToInteger2 ( st.substring(2,4) )
					//StringToInteger2 ( st.substring(0,1) )
					//StringToInteger2 ( Character.toString ( st.charAt(3) ))					
					;
					//System.out.println ( st.substring (1,3) + " test ");
		}
		
		
		return numStr;
		
	}
	
	public void actionPerformed(ActionEvent evt) {
		
		String textInput = textField.getText();
		
		//int num = StringToInteger ( textInput );
		
		textArea.append(StringToInteger(textInput) + newline);
		//textArea.append(StringToInteger2(textInput) + newline);
		
		
				
		//textArea.append(num + newline);
		
		textField.selectAll();
		
		textArea.setCaretPosition(textArea.getDocument().getLength());
		
		if ( evt.getActionCommand() == "Clear" )
		{
			textArea.setText("");
			textField.setText("");
		}
		else if ( evt.getActionCommand() == "Enter" )
		{		
			//debugging
			int start = Integer.parseInt(textInput);
			for ( int i = start; i <= 99999; i++ )
			//for ( int i = start; i <= 9999; i++ )
			{
				//textArea.append(i + newline);
				textInput = Integer.toString(i);
				textArea.append(textInput + " " + StringToInteger(textInput) + newline);
				//textArea.append(textInput + " " + StringToInteger2(textInput) + newline);
			}
		
		}
		
		//System.out.println (evt.getActionCommand());
		
	}
	
	public static void main (String args[])
	{
		
		
		//System.out.println("Hello World");
		javax.swing.SwingUtilities.invokeLater (new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
		
		//for ( int i = 1; i <=9999; i++ )
		//{
			//System.out.println ( StringToInteger( i ) );
			//textArea.append ( "Hello" ); 
		//}
	}
}