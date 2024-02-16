package ThreedCube;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) 
	{
//Firstly we are importing the library which we will use import javax.swing.JFrame;
      JFrame frame = new JFrame ("Spinning Cube");
      
      //setting up the sizes for the project
      CubePanel panel = new CubePanel();
      frame.add(panel);
      
      frame.setSize(400,400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      

	}

}
