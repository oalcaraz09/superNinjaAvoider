/**
 * 
 */
package edu.cpp.cs.cs141.superNinjaAvoider;

import java.util.Random;
/**
 * @author blou
 *
 */
public class Building extends Environment {

	private Darkness dark = new Darkness();
	private Environment[][] building;
	private final int DIMENSION = 9;
	private Player player = new Player();
	private Ninja ninja;
	private Room rooms;
	private ExtraBullet bulletPower = new ExtraBullet();
	private Radar radar = new Radar();
	private Invincibility invincible = new Invincibility();
	private Random rand;
	
	public Building() {
		building = new Environment[DIMENSION][DIMENSION];
		fillIn(building);
		placePlayer();
		placeItems();
	}
	
	
	
	public void placeItems() {
		int num;
		rand = new Random();
		//num = rand.nextInt(DIMENSION);
		building[0][0] = bulletPower;
		building[1][0] = radar;
		building[3][3] = invincible;
	}
	
	public void placePlayer() {
		building[8][0] = player;
	}
	
	public void placeNinjas(Ninja enemy) {
		
	}
	
	private void fillIn(Environment[][] array) {
		for(int i = 0; i < array.length; ++i) {
			for(int k = 0; k < array[0].length; ++k) {
				array[k][i] = dark;
			}
		}
	}
	
	public void printBuilding() {
		for(Environment[] row: building ) {
			for(Environment object: row) {
				System.out.print("[" + object + "]");
			}
			System.out.println();
		}
	}
	
}
