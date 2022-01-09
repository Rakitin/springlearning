package com.dimraktin.springlearning;

public class BassTuner implements Tuner {

	private double value;

	public void setValue(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	@Override
	public void prepare() {
		System.out.println("Bass " + getValue());		
	}
	
}
