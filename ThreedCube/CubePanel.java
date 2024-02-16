package ThreedCube;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics2D;


public class CubePanel extends JPanel
{
	
	private SpinningCube cube;
	
	public CubePanel() {
		cube = new SpinningCube();
		animate();
	}
	
	private void animate() {
	    // Create a thread object
	    Thread thread = new Thread(() -> {
	        while (true) {
	            cube.update();
	            repaint();
	            try {
	                Thread.sleep(10);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    });
		
	 // Start the thread
	    thread.start();
		
	}
	
	
	@Override
	protected void paintComponent(Graphics g) 
	{
	    super.paintComponent(g);
	    
	   int width = getWidth();
	   int height = getHeight();
	   int halfWidth = width/2;
	   int halfHeight = height/2;
	   
	   Graphics2D g2d = (Graphics2D)g;
	   g2d.fillRect(0,0,halfWidth, halfHeight);
	   
	   
	   
	// Set background color to black
	    g2d.setColor(Color.black);
	    g2d.fillRect(0, 0, width, height);
	   cube.render(g2d, halfWidth, halfHeight);
	   
	}


}
