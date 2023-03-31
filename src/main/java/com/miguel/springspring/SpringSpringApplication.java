package com.miguel.springspring;

import com.miguel.springspring.game.GameRunner;
import com.miguel.springspring.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSpringApplication.class, args);


		//create MarioGame class and remember to make a 'game' package
		MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
	}

}
