package geometri;

import java.awt.Color;
import java.awt.Graphics;

/**
 * A class that represents a Point and have the ability to draw it on a JApplet or a JFrame.
 * @author Albin Bååw
 * @author Kristoffer Ek
 *
 */
public class Point extends AbstractForm {
	/**
	 * Constructor method for a new point.
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @param c the color
	 * @throws IllegalPositionException if x or y is negative
	 */
	public Point(int x, int y, Color c) throws IllegalPositionException{
		super(x,y,1,1,c);
	}
	/**
	 * Constructor method for a new point with coordinates from another GeometricalForm
	 * @param f the GeometricalForm
	 * @param c the color
	 */
	public Point(GeometricalForm f, Color c){
		super(f,1,1,c);
	}
	
	/**{@inheritDoc}*/
	@Override
	public void fill(Graphics g) {
		// TODO Auto-generated method stub
		super.fill(g);
	}
	
	/**{@inheritDoc}*/
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**{@inheritDoc}*/
	@Override
	public int getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
}
