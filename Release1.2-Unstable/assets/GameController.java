import java.util.*;
import java.io.*;

public class GameController{

	private Scanner stdInput = new Scanner(System.in);
	private Runtime terminal = Runtime.getRuntime();

	public static void titleScreen(){
		GameController.clrConsole();
		System.out.println("                                                                              ");
		System.out.println(" @@@@@@   @@@@@@@  @@@  @@@  @@@ @@@   @@@@@@   @@@@@@@   @@@        @@@@@@   ");
		System.out.println("@@@@@@@   @@@@@@@  @@@  @@@  @@@ @@@  @@@@@@@@  @@@@@@@@  @@@       @@@@@@@@  ");
		System.out.println("!@@         @@!    @@!  @@@  @@! !@@  @@!  @@@  @@!  @@@  @@!       @@!  @@@  ");
		System.out.println("!@!         !@!    !@!  @!@  !@! @!!  !@!  @!@  !@   @!@  !@!       !@!  @!@  ");
		System.out.println("!!@@!!      @!!    @!@  !@!   !@!@!   @!@!@!@!  @!@!@!@   @!!       @!@  !@!  ");
		System.out.println(" !!@!!!     !!!    !@!  !!!    @!!!   !!!@!!!!  !!!@!!!!  !!!       !@!  !!!  ");
		System.out.println("     !:!    !!:    !!:  !!!    !!:    !!:  !!!  !!:  !!!  !!:       !!:  !!!  ");
		System.out.println("    !:!     :!:    :!:  !:!    :!:    :!:  !:!  :!:  !:!  :!:       :!:  !:!  ");
		System.out.println(":::::::      ::    ::::: ::     ::    ::   :::  ::: ::::  :: ::::   ::::::::  ");
		System.out.println("::::::       :      : :  :      :     ::   : :  :::::::   : :: ::    ::::::   ");
		System.out.println("");
		System.out.println("                       Tale of the Land of R' Meot");
		//Easter egg! R 'Meot = Rm EOT = Rm 307
		System.out.println("");
		System.out.println("OpenSource Software, Created by Ethan Cheng");
		System.out.println("Press Enter to continue...");
		try {
			System.in.read();
		} catch(Exception e){e.printStackTrace();}
	}

	public static void clrConsole(){System.out.print("\033\143");}
	public static void pauseSleep(int n){
		try{
			Thread.sleep(n);
		} catch(Exception e){}
	}

	public static BaseChar[] crtCharacter(){
		System.out.println("Character generation! Your party will consist of 5 characters.");
		for (int i = 1; i < 6; i++){
			
			System.out.println("Choose your class
		}
	}
}
