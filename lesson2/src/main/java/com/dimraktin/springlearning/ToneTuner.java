package com.dimraktin.springlearning;

public class ToneTuner implements Tuner {
	
	private int value;

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}


	@Override
	public void prepare() {
		System.out.println("Tone " + getValue());		
	}
	
}
