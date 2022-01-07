package com.dimraktin.springlearning;

public class Player {
	private Music music;

	public Player(Music music) {
		this.music = music;
	}

	public void play() {
		music.play();
	}
}
