/**
 * 
 */
package edu.cpp.cs.cs141.superNinjaAvoider;

/**
 * @author blou
 *
 */
public abstract class Item extends Environment{

	private boolean itemShows = false;
	
	public Item() {
		
	}
	
	public abstract void useItem();
	
	public void itemShowing() {
		if(itemShows) {
			itemShows = false;
		} else {
			itemShows = true;
		}
	}
	
}
