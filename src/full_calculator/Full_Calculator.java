package full_calculator;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class Full_Calculator implements ActionListener {
	TextField txtres=new TextField(20); 
	Button btnclear=new Button("CLEAR ALL");
	Button btnzero=new Button("0");
	Button btnone=new Button("1");
	Button btntwo=new Button("2");
	Button btnthree=new Button("3");
	Button btnfour=new Button("4");
	Button btnfive=new Button("5");
	Button btnsix=new Button("6");
	Button btnseven=new Button("7");
	Button btneight=new Button("8");
	Button btnnine=new Button("9");
	Button btnadd=new Button("+");
	Button btnsub=new Button("-");
	Button btnmul=new Button("*");
	Button btndiv=new Button("/");
	Button btnequal=new Button("=");
	
	public void evaluate(String data) throws ScriptException{
		ScriptEngineManager mgr=new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		int res=(int)engine.eval(data);
		txtres.setText(String.valueOf(res));
	}
	public void actionPerformed(ActionEvent e)
	{
		String availtext=txtres.getText();
		if(e.getSource() == btnzero)
		{
			txtres.setText(availtext+"0");
		}
		else if(e.getSource() == btnone)
		{
			txtres.setText(availtext+"1");
		}
		else if(e.getSource() == btntwo)
		{
			txtres.setText(availtext+"2");
		}
		else if(e.getSource() == btnthree)
		{
			txtres.setText(availtext+"3");
		}
		else if(e.getSource() == btnfour)
		{
			txtres.setText(availtext+"4");
		}
		else if(e.getSource() == btnfive)
		{
			txtres.setText(availtext+"5");
		}
		else if(e.getSource() == btnsix)
		{
			txtres.setText(availtext+"6");
		}
		else if(e.getSource() == btnseven)
		{
			txtres.setText(availtext+"7");
		}
		else if(e.getSource() == btneight)
		{
			txtres.setText(availtext+"8");
		}
		else if(e.getSource() == btnnine)
		{
			txtres.setText(availtext+"9");
		}
		else if(e.getSource() == btnadd)
		{
			txtres.setText(availtext+"+");
		}
		else if(e.getSource() == btnsub)
		{
			txtres.setText(availtext+"-");
		}
		else if(e.getSource() == btnmul)
		{
			txtres.setText(availtext+"*");
		}
		else if(e.getSource() == btndiv)
		{
			txtres.setText(availtext+"/");
		}
		else if(e.getSource() == btnequal)
		{
			String data = txtres.getText();
		    try {
				evaluate(data);
			} catch (ScriptException e1) {
				
				e1.printStackTrace();
			}
		}
		else if(e.getSource()== btnclear)
		{
			txtres.setText(" ");
		}
		
	}
	
	public Full_Calculator()
	{
		JFrame window=new JFrame("Calculator");
		window.setSize(500,500);
		window.setVisible(true);
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.setResizable(false);
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		p1.setSize(new Dimension(30,100));
	
		GridLayout grid1=new GridLayout(1,1);
		GridLayout grid2=new GridLayout(1,1);
		GridLayout grid3=new GridLayout(3,4);
		GridLayout grid4=new GridLayout(1,3);
		p1.add(txtres);
		p2.add(btnclear);
		p3.add(btnseven);
		p3.add(btneight);
		p3.add(btnnine);
		p3.add(btndiv);
		p3.add(btnfour);
		p3.add(btnfive);
		p3.add(btnsix);
		p3.add(btnmul);
		p3.add(btnone);
		p3.add(btntwo);
		p3.add(btnthree);
		p3.add(btnsub);
		p4.add(btnzero);
		p4.add(btnequal);
		p4.add(btnadd);
		p1.setLayout(grid1);
		p2.setLayout(grid2);
		p3.setLayout(grid3);
		p4.setLayout(grid4);
		
		window.add(p1,BorderLayout.NORTH);
		window.add(p2,BorderLayout.EAST);
		window.add(p3,BorderLayout.CENTER);
		window.add(p4,BorderLayout.SOUTH);
		
		btnzero.addActionListener((ActionListener) this);
		btnone.addActionListener((ActionListener)this);
		btntwo.addActionListener((ActionListener) this);
		btnthree.addActionListener((ActionListener) this);
		btnfour.addActionListener((ActionListener) this);
		btnfive.addActionListener((ActionListener) this);
		btnsix.addActionListener((ActionListener) this);
		btnseven.addActionListener((ActionListener) this);
		btneight.addActionListener((ActionListener) this);
		btnnine.addActionListener((ActionListener) this);
		btnadd.addActionListener((ActionListener) this);
		btnsub.addActionListener((ActionListener) this);
		btnmul.addActionListener((ActionListener) this);
		btndiv.addActionListener((ActionListener) this);
		btnequal.addActionListener((ActionListener) this);
		btnclear.addActionListener((ActionListener) this);
		
	}
	public static void main(String args[])
	{
		Full_Calculator ob=new Full_Calculator();
			
	}
}
