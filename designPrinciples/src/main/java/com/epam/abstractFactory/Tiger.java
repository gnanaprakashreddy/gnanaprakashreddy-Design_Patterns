package com.epam.abstractFactory;

public class Tiger implements Animals{
	private String name;
	public Tiger(){
		this.name="Tiger King of Jungle";
		foodIs();
		produceSound();
		rests();
	}
	@Override
	public void foodIs() {
		System.out.println("Tiger is a Carnivor Animal");
	}
	
	@Override
	public void produceSound() {
		// TODO Auto-generated method stub
		System.out.println("Tiger sound is roaring");
	}
	
	@Override
	public void rests() {
		// TODO Auto-generated method stub
		System.out.println("Tiger rests for 16hrs");
	}
	
}
