package geometri;

/**
 * A class that represents a Square and have the ability to draw it on a JApplet or a JFrame.
 * @author Albin Bååw
 * @author Kristoffer Ek
 */

import java.awt.Color;
import java.awt.Graphics;
public class Rectangle extends AbstractForm {
	/**
	 * Constructor method for a new Rectangle object.
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @param width the width
	 * @param height the height
	 * @param c the color
	 * @throws IllegalPositionException if x or y is negative
	 */
	public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException{
		super(x,y,width,height,c);
	}
	
	/**
	 * Constructor method for a new Rectangle object, with the coordinates from another GeometricalForm.
	 * @param f
	 * @param width
	 * @param height
	 * @param c
	 */
	public Rectangle(GeometricalForm f, int width, int height, Color c){
		super(f,width,height,c);
	}

	/**{@inheritDoc}*/
	@Override
	public void fill(Graphics g) {
	}

	/**{@inheritDoc}*/
	@Override
	public int getArea() {
		return 0;
	}

	/**{@inheritDoc}*/
	@Override
	public int getPerimeter() {
		return 0;
	}
}
