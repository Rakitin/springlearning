package com.dimraktin.springlearning;

public class Player {
	private Music music;
	private Tuner tuner;

	public Player(Music music) {
		this.music = music;
	}

	public void setTuner(Tuner tuner) {
		this.tuner = tuner;
	}

	public void play() {
		System.out.println(tuner);
		if(tuner != null) {
			tuner.prepare();
		}
		music.play();
	}

}
