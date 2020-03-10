package com.epam.builderPattern;

public class Building {
	private Boolean wall;
	private Boolean window;
	private Boolean door;
	private Boolean totalWindows;
	private Boolean chimmney;
	private Boolean garrage;
	private Boolean swimmingPool;
	
	public Building(Boolean wall, Boolean window, Boolean door){
		this.wall = wall;
		this.window  = window;
		this.door = door;
	}
	
	public Building(Boolean wall, Boolean window, Boolean door,
			Boolean chimmney, Boolean garrage, Boolean swimmingPool){
		this.wall = wall;
		this.window  = window;
		this.door = door;
		this.chimmney=chimmney;
		this.garrage = garrage;
		this.swimmingPool = swimmingPool;
	}
	
	public void detailsOfBuilding() {
		String message ="";
		if(wall)
		{
			message += "Building has wall \n";
		}
		if(door)
		{
			message+= "Building has dooes\n";
		}
		if(window)
		{
			message += "Building has window \n";
		}
		if(chimmney)
		{
			message += "Building has chimmney \n";
		}
		if(garrage)
		{
			message += "Building has garrage \n";
		}
		if(swimmingPool)
		{
			message+= "Building has swimming Pool ";
		}
		System.out.println(message);
	}

	public Boolean getWalls() {
		return wall;
	}

	public void setWalls(Boolean wall) {
		this.wall = wall;
	}

	public Boolean getWindows() {
		return window;
	}

	public void setWindows(Boolean window) {
		this.window = window;
	}

	public Boolean getDoors() {
		return door;
	}

	public void setDoors(Boolean door) {
		this.door = door;
	}

	public Boolean getWindowsCount() {
		return totalWindows;
	}

	public void setWindowsCount(Boolean totalWindows) {
		this.totalWindows = totalWindows;
	}

	public Boolean getChimney() {
		return chimmney;
	}

	public void setChimney(Boolean chimmney) {
		this.chimmney = chimmney;
	}

	public Boolean getGarage() {
		return garrage;
	}

	public void setGarage(Boolean garrage) {
		this.garrage = garrage;
	}

	public Boolean getSwimmingPool() {
		return swimmingPool;
	}

	public void setSwimmingPool(Boolean swimmingPool) {
		this.swimmingPool = swimmingPool;
	}
	
	
}
