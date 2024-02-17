**3D Rotating Cube**

This repository contains a simple Java application that demonstrates the rendering of a 3D rotating cube using the Java SWIG library for graphics.

![Screenshot of the 3D Rotating Cube](Screenshot%202024-02-17%20124703.png)

### Usage

To use this application, follow these steps:

1. Clone or download the repository to your local machine.
2. Ensure you have Java and the Java SWIG library installed.
3. Compile the Java source files.
4. Run the application.

### Example

```java
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("3D Rotating Cube");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        CubePanel cubePanel = new CubePanel();
        frame.add(cubePanel);
        frame.setVisible(true);
    }
}
