
public class Balloon {
	private String color, material;
	private double volume;
	private boolean cord;
	private int altitude;
	
	public Balloon() {
		color = "red";
		volume = 5.0;
		material = "latex";
		cord = true;
		altitude = 0;
	}
	public Balloon(String Color, double Volume, String Material, boolean Cord, int Altitude) {
		color = Color;
		volume = Volume;
		material = Material;
		cord = Cord;
		altitude = Altitude;
	}
	
	public String getColor() {
		return color;
	}
	public String getMaterial() {
		return material;
	}
	public double getVolume() {
		return volume;
	}
	public boolean hasCord() {
		return cord;
	}
	public int getAltitude() {
		return altitude;
	}
	
	public void myColor(String Color) {
		color = Color;
	}
	public void myMaterial(String Material) {
		material = Material;
	}
	public void myVolume(double Volume) {
		volume = Volume;
	}
	public void myCord(boolean Cord) {
		cord = Cord;
	}
	public void myAltitude(int Altitude) {
		altitude = Altitude;
	}
	
	public void ascend(int Altitude) {
		altitude = altitude + Altitude;
	}
	public void descend(int Altitude) {
		altitude = altitude - Altitude;
	}
}
