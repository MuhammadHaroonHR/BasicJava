
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
public class GUI extends JPanel{
	private JLabel l1,l2,l3,l4,l5,ratiom,ration,result,resulte;
	private JTextField t1,t2,t3,t4,t5,t6;
	
	private JButton Find;
	private JRadioButton J1,J2;
	private int x1,x2,x3,x4,m,n,resx1,resx2,linebreak;
	private JMenu menu;
	private JMenuItem i1,i2;
	GUI(){
		l1 = new JLabel("POINT 1 X1 = ");
		l2 = new JLabel("POINT 1 Y1 = ");
		t1 = new JTextField(4);
		t2 = new JTextField(4);
	 	l3 = new JLabel("POINT 2 X2 = ");
		l4 = new JLabel("POINT 2 Y2 = ");
		t3 = new JTextField(4);
		t4 = new JTextField(4);
		ratiom = new JLabel("Div Ratio M = ");
		ration = new JLabel("Div Ratio N = ");
		t5 = new JTextField(4);
		t6 = new JTextField(4);
		JFrame f = new JFrame("Menu");
		JMenuBar mb=new JMenuBar();  
		menu = new JMenu("Find Points");
		JButton b = new JButton("Find");
		
		b.addActionListener(new buttonListener());
		i1 = new JRadioButtonMenuItem("Internal Division");
		
		
		i2 = new JRadioButtonMenuItem("External Division");
		 add(l1);
	     add(t1);
	     add(l2);     
	     add(t2);
		
		add(l3);
	    add(t3);
	    add(l4);     
	    add(t4);
	    add(ratiom);
	    add(t5);
	    add(ration);
	    add(t6);
	    add(menu);
	    menu.add(i1);
	    menu.add(i2);
	    mb.add(menu);
	    add(mb);
	    mb.setVisible(true);
	    add(b);
	   result = new JLabel("");
	   resulte = new JLabel("");
	   
	   add(result);
	   add(resulte);
	   
	    
		setPreferredSize(new Dimension(300, 250));

		
		
	}
	public class buttonListener implements ActionListener
    {
        @Override
        public void actionPerformed (ActionEvent e)
        {            
        	if(t1.getText().trim().length()==0 &&t2.getText().trim().length()==0  && t1.getText().trim().length()==0  && t1.getText().trim().length()==0 ) {
        		result.setText("Kindly fill the fields to get points");
        		
        	}
        	else {
        	if(i1.isSelected()) {
        	result.setText("The Internal points are  ("+InternalDivisionX()+" , "+InternalDivisionY()+")");
        	resulte.setText(" ");}
        	if(i2.isSelected()){
        		resulte.setText("The External points are  ("+ExternalDivisionX()+" , "+ExternalDivisionY()+")");
        		result.setText(" ");
        	}
        	if(i1.isSelected()==true&&i2.isSelected()==true){
        		result.setText("The Internal points are  ("+InternalDivisionX()+" , "+InternalDivisionY()+")");	
        	
        		
        		resulte.setText("The External points are  ("+ExternalDivisionX()+" , "+ExternalDivisionY()+")");	
        	}
        	if(i1.isSelected()==false&&i2.isSelected()==false){
        		result.setText("Kindly select points you want to find");
        	}
        }}
    }    
    
	
	public float InternalDivisionX() {
		
		x1 = Integer.parseInt(t1.getText());
		x2 = Integer.parseInt(t2.getText());
		x3 = Integer.parseInt(t3.getText());
		x4 = Integer.parseInt(t4.getText());
		m = Integer.parseInt(t5.getText());
		n = Integer.parseInt(t6.getText());
		float resx = m*x3;
		float resy = n*x1;
		float sum = m+n;
		float tot = resx+resy;
		float res = tot/sum;
				
		return res;
		
	}
	
	public float InternalDivisionY() {
		

		x2 = Integer.parseInt(t2.getText());
		
		x4 = Integer.parseInt(t4.getText());
		m = Integer.parseInt(t5.getText());
		n = Integer.parseInt(t6.getText());
		float resx = m*x2;
		float resy = n*x4;
		float sum = m+n;
		float tot = resx+resy;
		float res = tot/sum;
				
		return res;
		
	}
public float ExternalDivisionX() {
		
		x1 = Integer.parseInt(t1.getText());
		x2 = Integer.parseInt(t2.getText());
		x3 = Integer.parseInt(t3.getText());
		x4 = Integer.parseInt(t4.getText());
		m = Integer.parseInt(t5.getText());
		n = Integer.parseInt(t6.getText());
		float resx = m*x3;
		float resy = n*x1;
		float sum = m-n;
		float tot = resx-resy;
		float res = tot/sum;
				
		return res;
		
	}
	
	public float ExternalDivisionY() {
		

		x2 = Integer.parseInt(t2.getText());
		
		x4 = Integer.parseInt(t4.getText());
		m = Integer.parseInt(t5.getText());
		n = Integer.parseInt(t6.getText());
		float resx = m*x2;
		float resy = n*x4;
		float sum = m-n;
		float tot = resx-resy;
		float res = tot/sum;
				
		return res;
		
	}
	
}
