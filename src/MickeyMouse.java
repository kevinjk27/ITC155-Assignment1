/*
 * Kevin Kantono
 * 04/20/2020
 * Drawing a mickey mouse
 */
import java.awt.Color;
import java.awt.Graphics;
public class MickeyMouse {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(220, 150);
		panel.setBackground(Color.YELLOW);
		Graphics g = panel.getGraphics();
		
		g.setColor(Color.BLUE);
		g.fillOval(50, 25, 40, 40);
		
		g.setColor(Color.BLUE);
		g.fillOval(130, 25, 40, 40);
		
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);
		
		g.setColor(Color.BLACK);
		g.drawLine(70, 85, 150, 85);
		
	}
}