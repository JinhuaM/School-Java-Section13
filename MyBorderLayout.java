import java.awt.*;
import javax.swing.*;

public class MyBorderLayout extends JFrame{
	static JTabbedPane jtab=new JTabbedPane(JTabbedPane.TOP);
	public MyBorderLayout(){
	String title,t;
	JButton[] but=new JButton[3];
	for(int i=0;i<3;i++){
		t="���ڵ�"+(i+1)+"ҳ��";
		but[i]=new JButton(t);
		title="��"+(i+1)+"ҳ";
		jtab.add(title,but[i]);
	}
}

public static void main(String[] args){
	MyBorderLayout frm=new MyBorderLayout();
	frm.setTitle("�м�������ѡ�");
	frm.setSize(300,300);
	BorderLayout border=new BorderLayout(5,5);
	frm.setLayout(border);
	JButton b1=new JButton("������borderLayout����");
	JButton b2=new JButton("��");
	JButton b3=new JButton("��");
	JButton b4=new JButton("��");
	frm.add(b1,BorderLayout.NORTH);
	frm.add(b2,BorderLayout.SOUTH);
	frm.add(b3,BorderLayout.WEST);
	frm.add(b4,BorderLayout.EAST);
	frm.add(jtab,BorderLayout.CENTER);

	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frm.setVisible(true);
	}
}