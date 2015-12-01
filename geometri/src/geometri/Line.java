package geometri;

import java.awt.*;

/**
 * A class that represents a Line and have the ability to draw it on a JApplet or a JFrame.
 * @author Albin Bååw
 * @author Kristoffer Ek
 *
 */
public class Line extends AbstractForm{
	
	/**
	 * A Contructor that creates a line.
	 * @param x1 The start x-coordinate.
	 * @param y1 The start y-coordinate.
	 * @param x2 The stop x-coordinate.
	 * @param y2 The stop y-coordinate.
	 * @param c the color of the line.
	 * @throws IllegalPositionException if any of the coordinates are negative.
	 */
	public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException{
		super(x1,y1,x2-x1,y2-y1,c);
	}
	/**
	 * A Constructor that creates a line based on other GeometricalForms coordinates.
	 * @param f1 the first GeometricalForm.
	 * @param f2 the second GeometricalForm.
	 * @param c the color of the line.
	 */
	public Line(GeometricalForm f1, GeometricalForm f2, Color c){
		super(f1,f2.getX()-f1.getX(),f2.getY()-f1.getY(),c);
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
