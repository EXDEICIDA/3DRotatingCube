package ThreedCube;
import java.awt.Color;
import java.awt.Graphics2D;

public class SpinningCube 
{
	private double angleX;
	private double angleY;
	private double angleZ;
	
	
	//Creating double array for the vertices
	private int [][] vertices = 
	{ {50,50,50},
	 {-50,50,50},
	 {-50,-50,50},
	 {50,-50,50},
	 {50,50,-50},
	 {-50,50,-50},
	 {-50,-50,-50},
	 {50,-50,-50}
					
	};
	
	private int [][] edges = 
    { {0,1},{1,2},{2,3},{3,0},
      {4,5},{5,6},{6,7},{7,4},
      {0,4},{1,5},{2,6},{3,7},
      
						
    };
	
	public void update()
	{
		angleX += 0.01;
		angleY += 0.01;
		angleZ += 0.01;
		
	}
	
	public void render (Graphics2D g2d, int halfWidth, int halfHeight) 
	{
		g2d.setColor(Color.red);
		
		//creating a for loop for each edge right here iteration
		for(int[] edge: edges )
		{
			// Accessing vertices array correctly
	        int x1 = vertices[edge[0]][0];
	        int x2 = vertices[edge[1]][0];
	        
	        int y1 = vertices[edge[0]][1];
	        int y2 = vertices[edge[1]][1];
	        
	        int z1 = vertices[edge[0]][2];
	        int z2 = vertices[edge[1]][2];
	        
	        //here are the X particles
	        double tempY1 = y1 * Math.cos(angleX) - z1 * Math.sin(angleX);
	        double tempZ1 = y1 * Math.sin(angleX) + z1 * Math.cos(angleX);
	        
	        
	        double tempY2 = y2 * Math.cos(angleX) - z2 * Math.sin(angleX);
	        double tempZ2 = y2 * Math.sin(angleX) + z2 * Math.cos(angleX);
	        
	        //here are the Y particles
	        
	        double tempX1  = x1 * Math.cos(angleY)- tempZ1 * Math.sin(angleY);
	        double tempZ1Y = x1 * Math.sin(angleY)+ tempZ1 * Math.cos(angleY);
	        
	        double tempX2  = x2 * Math.cos(angleY)- tempZ2 * Math.sin(angleY);
	        double tempZ2Y = x2 * Math.sin(angleY)+ tempZ2 * Math.cos(angleY);
	        
	        //z particles

	        double tempX1Y = tempX1 * Math.cos(angleZ) - tempY1 * Math.sin(angleZ);
	        double tempY1Z = tempX1 * Math.sin(angleZ) + tempY1 * Math.cos(angleZ);

	        double tempX2Y = tempX2 * Math.cos(angleZ) - tempY2 * Math.sin(angleZ);
	        double tempY2Z = tempX2 * Math.sin(angleZ) + tempY2 * Math.cos(angleZ);

	        
	        g2d.drawLine(halfWidth + (int) tempX1Y,halfHeight - (int) tempY1Z,halfWidth +(int) tempX2Y,halfHeight - (int)tempY2Z);
	        
	        
		}
		
		
		
	}
	
	

}
