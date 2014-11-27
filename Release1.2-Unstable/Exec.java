import java.util.*;
import java.io.*;

public class Exec{

	public static void newGame(){
		
		Scanner sc = new Scanner(System.in);
		GameController.clrConsole();
		System.out.println("Welcome " + Harry.name + ".");
		System.out.println("You wake up in a dungeon. You look around and are confused. How do I get out?");
		Labyrinth game = new Labyrinth(Harry);
		game.setStage(1);
		while (game.getStage() < 200 && Harry.health() > 0) {
			game.move();
		}
                if (Harry.health() <= 0){
			GameController.clrConsole();
			System.out.println("Sorry this is a roguelike! You can't respawn! If you want, load up from your save file if you made one.");
			System.exit(0);
		}
                else if(game.getStage() >= 200){
                        System.out.println("You walk out the portal created by Zim 'Ann Skior's body...");
                        GameController.pauseSleep(2000);
                        System.out.println("You take a deep breath...");
                        GameController.pauseSleep(2000);
                        System.out.print("...");
                        GameController.pauseSleep(2000);
                        System.out.println("... No...");
                        GameController.pauseSleep(2100);
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Thanks for playing Stuyablo!");
                        System.out.println("Credits:");
                        System.out.println("Everything: Ethan Cheng");
                        System.out.println("Game exitting...");
                        System.exit(0);
                }

	}

	public static void loadGame(){
		GameController.clrConsole();
		try{
			FileInputStream saveFile = new FileInputStream("stuyablosave.txt");
			ObjectInputStream save = new ObjectInputStream(saveFile);
			BaseChar load = new BaseChar();
			Labyrinth gameRes = new Labyrinth(load);
			//RESTORE THE DATA!
			load.setName((String) save.readObject());
			load.setLevel((Integer) save.readObject());
			load.setExperience((Integer) save.readObject());
			load.setMaxHealth((Integer) save.readObject());
			load.setHealth((Integer) save.readObject());
			load.setStrength((Integer) save.readObject());
			load.setSpeed((Integer) save.readObject());
			load.setEndurance((Integer) save.readObject());
			gameRes.setStage((Integer) save.readObject());
			load.setType((String) save.readObject());
			gameRes.currRm.room = (String[]) save.readObject();
			load.setXCOR((Integer) save.readObject());
			load.setYCOR((Integer) save.readObject());
			save.close();
			while (gameRes.getStage() < 200 && load.health() > 0) {
                        	gameRes.move();
                	}
			if (load.health() <= 0){
				GameController.clrConsole();
				newGame();
			}
			else if(gameRes.getStage() >= 200){
				System.out.println("You walk out the portal created by Zim 'Ann Skior's body...");
				GameController.pauseSleep(2000);
				System.out.println("You take a deep breath...");
				GameController.pauseSleep(2000);
				System.out.print("...");
				GameController.pauseSleep(2000);
				System.out.println("... No...");
				GameController.pauseSleep(2100);
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Thanks for playing Stuyablo!");
				System.out.println("Credits:");
				System.out.println("Everything: Ethan Cheng");
				System.out.println("Game exitting...");
				System.exit(0);
			}
		} catch(Exception e) {e.printStackTrace();}
	}

	public static void main(String[] args){
		GameController.titleScreen();
		File f = new File("stuyablosave.txt");
		if (f.exists()){
			boolean checkResp = false;
			Scanner check = new Scanner(System.in);
			while (!checkResp){
				System.out.println("You seem to have a save file. Load the save? (Y/N)");
				String resp = check.next();
				if (resp.toUpperCase().equals("Y") || resp.toUpperCase().equals("YES")){
					System.out.println("Save file detected. Loading save...");
					checkResp = true;
					try{
	                                        Thread.sleep(1000);
        	                        } catch(Exception e) {}
                	                System.out.print("\033\143");
					loadGame();
				}
				else if (resp.toUpperCase().equals("N") || resp.toUpperCase().equals("NO")){
					System.out.println("Starting new game...");
					checkResp = true;
					newGame();
				}
				else{
					System.out.println("Invalid response. Valid responses: Y , Yes , N , No");
				}
			}
		}
		else {
			newGame();
		}
	}
}
