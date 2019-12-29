import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.*;

//implements ActionListener
class Coporation extends JFrame implements ActionListener{
	JTextField text1;
	JTextField text2;

	JLabel label3;

	public static void main(String args[]){
		Coporation frame = new Coporation("売上高営業利益率");
		frame.setVisible(true);
	}

	Coporation(String title){
		setTitle(title);
		setBounds(100, 100, 300, 250);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    JPanel p = new JPanel();
	    JButton btn1 = new JButton("計算");
	    btn1.addActionListener(this);
	    JLabel label1 = new JLabel("営業利益");
	    JLabel label2 = new JLabel("売上高");
	    label3 = new JLabel("");
	    JLabel label4 = new JLabel("利益率");
	    text1 = new JTextField(18);
	    text2 = new JTextField(18);

	    p.add(label1);
	    p.add(text1);
	    p.add(label2);
	    p.add(text2);
	    p.add(label4);
	    p.add(label3);
	    p.add(btn1);

	    Container contentPane = getContentPane();
	    contentPane.add(p, BorderLayout.CENTER);
	    contentPane.add(btn1, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		double num1=Double.valueOf(text1.getText());
		double num2=Double.valueOf(text2.getText());

		label3.setText(String.valueOf(num1 / num2));
	}

}
