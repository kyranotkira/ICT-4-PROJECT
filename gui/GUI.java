package gui;


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;


public class GUI extends Canvas implements ActionListener{
	@Override
	public void paint(Graphics g) {
		
		Toolkit t = Toolkit.getDefaultToolkit();
		Image im = t.getImage("C:\\Users\\Von\\Downloads\\keirahxd.jpg");
		g.drawImage(im, 210,90,this); 
		
	}
	static JPasswordField pass;
	static JButton button;
	static JLabel res;
	static JLabel name;
	static JLabel section;
	static JLabel age;
	static JLabel prof;
	private static void Gui (){
		GUI gui = new GUI();
		prof = new JLabel("");
		prof.setBounds(20, 370, 100, 100);
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("<html><font color='white'>Password : </font></html>"); 
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Von\\Downloads\\eysi.jpg");
		gui.setSize(350, 200);
		panel.add(prof);
		panel.add(gui);
		frame.setIconImage(icon);
		name = new JLabel("");
		section = new JLabel("");
		age = new JLabel("");
		name.setBounds(20, 320, 200, 10);
		section.setBounds(20, 350, 100, 10);
		age.setBounds(20, 380, 100, 15);
		panel.add(name);
		panel.add(section);
		panel.add(age);
		res = new JLabel();
		res.setBounds(200, 100, 150,80);
		button = new JButton("Login");
		button.setBounds(210, 230, 100, 25);
		button.setBackground(Color.gray);
		button.addActionListener(new GUI());
		pass = new JPasswordField();
		pass.setBounds(130, 200, 250, 25);
		panel.add(button);
		panel.add(res);
		panel.add(pass);
		label.setBounds(60, 200, 80, 25);
		panel.setLayout(null);
		panel.add(label);
		panel.setBackground(Color.black);
		frame.add(panel);
		frame.setTitle("Login");
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pass.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	try {
		    		if(User.login(new String(pass.getPassword()))) {
		    			res.setText("<html><font color='green'>Successful Login!</font></html>");
		    			name.setText("<html><font color='green'>Name : Valenzuela, Keirah S.</font></html>");
		    			section.setText("<html><font color='green'>Section : Flexible</font></html>");
		    			age.setText("<html><font color='green'>Age : 16</font></html>");
		    			prof.setText("<html><font color='green'>Prof : Sir Rod</font></html>");
		    		}else {
		    			res.setText("<html><font color='red'>Incorrect Password.</font></html>");
		    		}
		    		}catch(Exception ee) {
		    			ee.printStackTrace();
		    		}
		    }}
);
		
	}
	
	public static void main(String[] args) {
				Gui();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
		if(User.login(new String(pass.getPassword()))) {
			res.setText("<html><font color='green'>Successful Login!</font></html>");
			name.setText("<html><font color='green'>Name : Valenzuela, Keirah S.</font></html>");
			section.setText("<html><font color='green'>Section : Flexible</font></html>");
			age.setText("<html><font color='green'>Age : 16</font></html>");
			prof.setText("<html><font color='green'>Professor : Sir Rod</font></html>");
		}else {
			res.setText("<html><font color='red'>Incorrect Password.</font></html>");
		}
		}catch(Exception ee) {
			ee.printStackTrace();
		}
	}
}