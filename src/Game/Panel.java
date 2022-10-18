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
		
		Color lightBoard = new Color(191, 200, 173);
		Color darkBoard = new Color(144, 180, 148);
		
		boolean light = true;
		for (int x = 0, y = 0; y < 8; x++) { // Making board
			if (x == 9) {
				x = 0;
				y++;
			} 
			
			if (light == true) {
				g2.setColor(lightBoard);
				g2.fill(new Rectangle2D.Double(x*100, y*100,
						   preferredSize/8, preferredSize/8));
			} 
			else {
				g2.setColor(darkBoard);
				g2.fill(new Rectangle2D.Double(x*100, y*100,
						preferredSize/8, height/8));
			}
			light = !light;
		}
	}
}
