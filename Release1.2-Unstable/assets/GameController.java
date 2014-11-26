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
		BaseChar temp = new BaseChar();
		System.out.println("Character generation! Your party will consist of 5 characters.");
		for (int i = 1; i < 6; i++){
			System.out.println("Classes:\n==================================");
			System.out.println("\n1 / Warrior:");
			temp.warriorTemplate("TEMP");
			temp.displayStats();
			System.out.println("\n2 / Mage: ");
			temp.mageTemplate("TEMP");
			temp.displayStats();
			System.out.println("\n3 / Archer: ");
			temp.archerTemplate("TEMP");
			temp.displayStats();
			System.out.println("\n4 / Dwarf: ");
			temp.dwarfTemplate("TEMP");
			temp.displayStats();
			System.out.println("\nChoose your class! See above for choices.");
			String usrInput = stdInput.nextLine().toUpperCase() + "@@@@@@@@@@@@@@@@@@@@"; //20 Character buffer to prevent out of bounds
			if (usrInput.substring(0 , 7).equals("WARRIOR") || usrInput.charAt(0) == '1'){

			} else if (userInput.substring(0 , 4).equals("MAGE") || userInput.charAt(0) == '2'){

			} else if (userInput.substring(0 , 6).equals("ARCHER") || userInput.charAt(0) == '3'){

			} else if (userInput.substring(0 , 5).equals("DWARF") || userInput.charAt(0) == '4'){

			} else {
				i--;
			}
		}
	}
}
