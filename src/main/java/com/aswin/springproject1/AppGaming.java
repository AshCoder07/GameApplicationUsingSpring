package com.aswin.springproject1;

import com.aswin.springproject1.game.gameRunner;
import com.aswin.springproject1.game.marioGame;
import com.aswin.springproject1.game.pacmanGame;
import com.aswin.springproject1.game.supercontraGame;

public class AppGaming {

	public static void main(String[] args) {
		
//		var game=new marioGame();
//		var game=new supercontraGame();
		var game=new pacmanGame();
		var gameRunner=new gameRunner(game);
		gameRunner.run();
	}
}
