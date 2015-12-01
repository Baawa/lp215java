package geometri;

import java.awt.Color;

/**
 * A class that represents a Square and have the ability to draw it on a JApplet or a JFrame.
 * @author Albin Bååw
 * @author Kristoffer Ek
 *
 */
public class Square extends Rectangle {
	/**
	 * Constructor method for Square.
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @param side the length of the side
	 * @param c the color
	 * @throws IllegalPositionException if x or y is negative.
	 */
	public Square(int x, int y, int side, Color c) throws IllegalPositionException{
		super(x,y,side,side,c);
	}
	/**
	 * Constructor method for Square, uses another GeometricalForm's coordinates.
	 * @param f A GeometricalForm
	 * @param side the length of the side
	 * @param c the color
	 */
	public Square(GeometricalForm f, int side, Color c){
		super(f,side,side,c);
	}
}
