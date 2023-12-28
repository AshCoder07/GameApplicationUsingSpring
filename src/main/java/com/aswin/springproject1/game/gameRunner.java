package com.aswin.springproject1.game;

public class gameRunner {
//	private marioGame game;
	private gamingConsole game;
	public gameRunner(gamingConsole game) {
		this.game=game;
	}
	public void run() {
		System.out.println("Running game:"+game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
