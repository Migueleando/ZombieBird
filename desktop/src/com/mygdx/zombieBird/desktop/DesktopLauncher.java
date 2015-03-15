package com.mygdx.zombieBird.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.zombieBird.ZBGame;

public class DesktopLauncher {
	
	
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title= "Zombie Bird";
		config.width = 272;
		config.height = 408;
		
		new LwjglApplication(new ZBGame(), config);
	}
}
