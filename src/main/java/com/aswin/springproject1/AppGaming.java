package com.aswin.springproject1;

import com.aswin.springproject1.game.gameRunner;
import com.aswin.springproject1.game.marioGame;

public class AppGaming {

	public static void main(String[] args) {
		
		var marioGame=new marioGame();
		var gameRunner=new gameRunner(marioGame);
		gameRunner.run();
	}
}
