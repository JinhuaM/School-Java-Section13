import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class MyFlowLayout extends JFrame {
	MyFlowLayout(String title)
	{super(title);}
	public static void main(String[] args){
		MyFlowLayout frm=new MyFlowLayout("��ʽ���ֹ�����FlowLayout");
		FlowLayout flow=new FlowLayout(FlowLayout.CENTER);
		JButton b1=new JButton("��һ����ť");
		JButton b2=new JButton("�ڶ�����ť");
		JButton b3=new JButton("��������ť");
		frm.setLayout(flow);
		frm.setSize(200,150);
		frm.add(b1);
		frm.add(b2);
		frm.add(b3);
		frm.getContentPane().setBackground(Color.PINK);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
}
