package geometri;

import java.awt.*;

/**
 * A class that represents a Circle and have the ability to draw it on a JApplet or a JFrame.
 * @author Albin Bååw
 * @author Kristoffer Ek
 *
 */
public class Circle extends Oval{

	/**
	 * A Constructor function, creating a brand new circle.
	 * @param x The x coordinate
	 * @param y The y Coordinate.
	 * @param diameter The Diameter of the circle.
	 * @param c The Color of the circle.
	 * @throws IllegalPositionException if the x- or the y-coordinate is negative.
	 */
	public Circle(int x, int y, int diameter, Color c) throws IllegalPositionException{
		super(x,y,diameter,diameter,c);
	}
	/**
	 * A Constructor function, creating a new circle with the coordinates of another geometricalform.
	 * @param f A GeometricalForm
	 * @param diameter The Diameter of the circle.
	 * @param c The color of the circle.
	 */
	public Circle(GeometricalForm f, int diameter, Color c){
		super(f,diameter,diameter,c);
	}
	
	/**{@inheritDoc}*/
	@Override
	public int getPerimeter() {
		return 0;
	}
	
	
}
