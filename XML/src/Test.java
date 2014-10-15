import javax.swing.JButton;
import javax.swing.JFrame;


public class Test extends JFrame {
	
	public Test(){
		setSize(500, 700);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setResizable(false);
    	
    	int x = 0;
    	int y = 0;
    	
    	
    	
    	JButton butt = new JButton("LOL");
    	butt.setBounds(0, 0, x, y);
    	add(butt);
    	
    	setVisible(true);
    	repaint();		
	}
	
	public static void main(String[] args){
		Reader r = new Reader();
		int i = r.readInt("heigh");
		System.out.println(i);
	}
}
