package chapter11;

import javafx.scene.paint.Color;

public class Planet {
	
	private String name = "Unknown";
	private Color primaryColor = Color.WHITE;
	private Integer numberOfMoons = 0;
	private boolean isRinged = false;
	
	public Planet(String name, Color primaryColor, Integer numberOfMoons, boolean isRinged) {
		super();
		this.name = name;
		this.primaryColor = primaryColor;
		this.numberOfMoons = numberOfMoons;
		this.isRinged = isRinged;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Color getPrimaryColor() {
		return primaryColor;
	}
	public void setPrimaryColor(Color primaryColor) {
		this.primaryColor = primaryColor;
	}
	public Integer getNumberOfMoons() {
		return numberOfMoons;
	}
	public void setNumberOfMoons(Integer numberOfMoons) {
		this.numberOfMoons = numberOfMoons;
	}
	public boolean isRinged() {
		return isRinged;
	}
	public void setRinged(boolean isRinged) {
		this.isRinged = isRinged;
	}
	
	public String toString(){
		return this.name;
	}
}
