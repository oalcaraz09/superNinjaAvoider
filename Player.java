/**
 * 
 */
package edu.cpp.cs.cs141.superNinjaAvoider;

/**
 * @author blou
 *
 */
public class Player extends Person {
	
	private int numberOfLives;
	private int ammo;
	private boolean invincible;
	
	

	public Player() {
		
	}
	
	public void usePowerUp(Item item) {
		item.useItem();
	}
	
	public void shoot() {
		
	}
	
	public void useNightVision() {
		
	}
	
	public int numberOfLives() {
		return 0;
	}
	
	public void subtractLife() {
		
	}
	
	public void died() {
		
	}

	@Override
	public void move() {
		
	}
	
	@Override
	public String toString() {
		return "P";
	}
}
