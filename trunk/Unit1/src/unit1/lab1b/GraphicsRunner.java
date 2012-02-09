package unit1.lab1b;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("MAKE YOUR OWN SHAPE");

		setSize(WIDTH,HEIGHT);

		getContentPane().add(new ShapePanel());

		setVisible(true);
	}
    @Override
        public void update(Graphics window)
	{
          super.update(window);
          if (!((this.getWidth()%2))){
                    System.out.println("even");
          }else{
                    System.out.println("odd");
          }
          
        }

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
                
	}
}