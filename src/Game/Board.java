package Game;
import java.awt.*;
import javax.swing.JFrame;

public class Board extends JFrame{
	
	public static void main(String[] args) {
		new Board();
	}
	
	
	static Panel panel;
	
	Board(){
		panel = new Panel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.add(panel);
		this.pack();
		
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
	
	
	
}


