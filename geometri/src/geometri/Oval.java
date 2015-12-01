package geometri;

import java.awt.Graphics;
import java.awt.Color;

/**
 * A class that represents a Oval and have the ability to draw it on a JApplet or a JFrame.
 * @author Albin Bååw
 * @author Kristoffer Ek
 *
 */
public class Oval extends AbstractForm {
	/**
	 * A constructor method for Oval.
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @param width the width
	 * @param height the height
	 * @param c the color
	 * @throws IllegalPositionException if x or y is negative.
	 */
	public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException{
		super(x,y,width,height,c);
	}
	
	/**
	 * A constructor method for Oval, creating a new Oval based on another objects coordinates.
	 * @param f a GeometricalForm Object
	 * @param width the width
	 * @param height the height
	 * @param c the color
	 */
	public Oval(GeometricalForm f, int width, int height, Color c){
		super(f, width, height, c);
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
