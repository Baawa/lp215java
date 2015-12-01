package geometri;

import java.awt.Color;
import java.awt.Graphics;
/**
 * A Abstract class that represents a GeometricalForm 
 * and have the ability to draw it on a JApplet or a JFrame.
 * @author Albin Bååw
 * @author Kristoffer Ek
 *
 */
public abstract class AbstractForm implements GeometricalForm {
	private Color color;
	private int height;
	private int width;
	private int x;
	private int y;
	/**
	 * Constructor method for an AbstractForm.
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @param width the width
	 * @param height the height
	 * @param color the color
	 * @throws IllegalPositionException if x or y is negative.
	 */
	public AbstractForm(int x, int y, int width, int height, Color color) throws IllegalPositionException{
		if (x < 0 ||y < 0) throw new IllegalPositionException("Negative coordinates are not allowed!");
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	/**
	 * Constructor method for an AbstractForm, using the coordinates from another GeometricalForm.
	 * @param f a GeometricalForm
	 * @param width the width
	 * @param height the height
	 * @param color the color
	 */
	public AbstractForm(GeometricalForm f, int width, int height, Color color){
		this.x = f.getX();
		this.y = f.getY();
		this.width = width;
		this.height = height;
		this.color = color;
	}
	/**{@inheritDoc}*/
	public void fill(Graphics g){
		
	}
	/**{@inheritDoc}*/
    public Color getColor(){
    	return this.color;
    }
    /**{@inheritDoc}*/
    public int getArea(){
    	return 0;
    }
    /**{@inheritDoc}*/
    public int getHeight(){
    	return this.height;
    }
    /**{@inheritDoc}*/
    public int getPerimeter(){
    	return 0;
    }
    /**{@inheritDoc}*/
    public int getWidth(){
    	return this.width;
    }
    /**{@inheritDoc}*/
    public int getX(){
    	return this.x;
    }
    /**{@inheritDoc}*/
    public int getY(){
    	return this.y;
    }
    /**{@inheritDoc}*/
    public void move(int dx, int dy) throws IllegalPositionException{
    }
    /**{@inheritDoc}*/
    public void place(int x, int y) throws IllegalPositionException{
    }
    /**{@inheritDoc}*/
    @Override
    public int compareTo(GeometricalForm f){
    	return 0;
    }
    /**{@inheritDoc}*/
    @Override
    public boolean equals(Object o){
    	return false;
    }
    /**{@inheritDoc}*/
    @Override
    public int hashCode(){
    	String tmp = "";
    	tmp = "" + this.x + this.y + this.color.getRGB() + this.getClass();
    	return Integer.parseInt(tmp);
    }
}
