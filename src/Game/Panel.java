package Game;
import java.awt.*;
import javax.swing.*;

public class Panel extends JPanel{
	
	Panel() {
		this.setPreferredSize(new Dimension(1600, 900));
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		g2.drawLine(0, 0, 500, 500);
	}
	
}
