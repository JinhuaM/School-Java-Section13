import java.awt.Color;
import javax.swing.*;
public class Window extends JFrame{
	public static void main(String[] args){
		JFrame frm=new JFrame();
		frm.setSize(200,130);
		frm.setTitle("�ҵĴ���");
		frm.setLocation(200,200);
		JButton b=new JButton("ȷ��");
		b.setBounds(30,30,90,30);
	    frm.setLayout(null);
		frm.add(b);
		frm.getContentPane().setBackground(Color.PINK);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
		
	}
}
