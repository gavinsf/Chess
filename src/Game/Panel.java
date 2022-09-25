package Game;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Panel extends JPanel{
	
	int preferredSize = 800;
	
	
	Panel() {
		this.setPreferredSize(new Dimension(preferredSize, preferredSize));
	}
	
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Dimension scaledSize = Board.panel.getSize();
		
		double height = scaledSize.getHeight();
		double width = scaledSize.getWidth();
		
		g2.scale(width/preferredSize, height/preferredSize);
		
		Color lightGreen = new Color(177, 215, 180);
		Color darkGreen = new Color(127, 183, 126);
		
		for(int x = 0, y = 0; y != 8; x++ ) {
			if (x == 8) {
				x = 0;
				y++;
			}
			else if (x % 2 == 0) {
				System.out.print(x);
				g2.setColor(lightGreen);
				g2.fill(new Rectangle2D.Double(x*100, y*100,
						   width/8, height/8));
			}
			else {
				g2.setColor(darkGreen);
				g2.fill(new Rectangle2D.Double(x*100, y*100,
						   width/8, height/8));
			}
		}
	}
}
