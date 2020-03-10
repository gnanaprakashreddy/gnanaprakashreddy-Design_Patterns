package com.epam.abstractFactory;

public class Buffalo implements Animals{
	private String name;
	public Buffalo(){
		this.name = "Buffalo";
		foodIs();
		produceSound();
		rests();
	}
	
	@Override
	public void foodIs() {
		// TODO Auto-generated method stub
		System.out.println("Buffalo food is grass....");
	}
	@Override
	public void produceSound() {
		// TODO Auto-generated method stub
		System.out.println("Buffalo makes sound as ambaaa...... ");
	}
	@Override
	public void rests() {
		// TODO Auto-generated method stub
		System.out.println("Buffalo sleeps for less than 6hrs....");
	}
}
