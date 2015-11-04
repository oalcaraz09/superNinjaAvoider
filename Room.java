/**
 * 
 */
package edu.cpp.cs.cs141.superNinjaAvoider;

/**
 * @author blou
 *
 */
public class Room {

	private BriefCase secretFiles;
	private boolean hasFiles = false;
	private boolean showBriefCase = false;
	private boolean door = true;
	private int back;
	
	public Room() {
		
	}
	
	public void placeFiles() {
		
	}
	
	public boolean hasFiles() {
		return hasFiles;
	}
	
	public void showFiles() {
		showBriefCase = !showBriefCase;
	}
	
	public boolean wall() {
		return !door;
	}
	
	public void setBack(int back) {
		this.back = back;
	}
	

	
}
