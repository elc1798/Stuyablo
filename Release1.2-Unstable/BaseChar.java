import java.util.*;
import java.io.*;

public class BaseChar extends Mob{

/*
	public BaseChar(int h, String s, int l, int atkdmg, int dex, int spd){
		super.health = h;
		super.maxHealth = h;
		super.name = s;
		super.level = l;
		super.experience = 0;
		super.strength = atkdmg;
		super.endurance = dex;
		super.speed = speed;
	}
*/

//Data Grabbers
	public int health(){return super.health;}
	public int level(){return super.level;}
	public int experience(){return super.experience;}
	public int endurance(){return super.endurance;}
	public int speed(){return super.speed;}
	public int strength(){return super.strength;}
	public int maxHealth(){return super.maxHealth;}
	public String name(){return super.name;}
	public String type(){return super.type;}
	public int xcor(){return super.xcor;}
	public int ycor(){return super.ycor;}

//Data Setters
	public void setHealth(int n){super.health = n;}
	public void setExperience(int n){super.experience = n;}
	public void setLevel(int n){super.level = n;}
	public void setStrength(int n){super.strength = n;}
	public void setEndurance(int n){super.endurance = n;}
	public void setSpeed(int n){
		if (n > 50) {
			super.speed = 50;
		}
		else {
			super.speed = n;
		}
	}
	public void setMaxHealth(int n){super.maxHealth = n;}
	public void setName(String s){super.name = s;}
	public void setType(String s){super.type = s;}
	public void setXCOR(int n){super.xcor = n;}
	public void setYCOR(int n){super.ycor = n;}

//BaseChar types:
/*
	Warrior - Object (High Attack Damage, High Endurance, Low Speed)
	Mage - Object (High speed, High Attack Damage, Low Endurance)
	Archer - Object (High Speed, Very high attack damage, low health, low endurance)
	Dwarf - Object (High Health, Very High Endurance, Very Low Speed, Slightly Low Attack Damage)
*/
	public void warriorTemplate(String s){
		super.health = 100;
		super.maxHealth = 100;
		super.name = s;
		super.level = 1;
		super.experience = 0;
		super.strength = 8;
		super.endurance = 5;
		super.speed = 2;
		super.type = "WARRIOR";
		super.xcor = 18;
		super.ycor = 7;
	}

	public void mageTemplate(String s){
		super.health = 100;
		super.maxHealth = 100;
		super.name = s;
		super.level = 1;
		super.experience = 0;
		super.strength = 8;
		super.endurance = 1;
		super.speed =  4;
		super.type = "MAGE";
		super.xcor = 18;
		super.ycor = 7;
	}

	public void archerTemplate(String s){
		super.health = 65;
		super.maxHealth = 65;
		super.name = s;
		super.level = 1;
		super.experience = 0;
		super.strength = 13;
		super.endurance = 0;
		super.speed = 5;
		super.type = "ARCHER";
		super.xcor = 18;
		super.ycor = 7;
	}

	public void dwarfTemplate(String s){
		super.health = 120;
		super.maxHealth = 120;
		super.name = s;
		super.level = 1;
		super.experience = 0;
		super.strength = 7;
		super.endurance = 9;
		super.speed = 1;
		super.type = "DWARF";
		super.xcor = 18;
		super.ycor = 7;
	}

	public void displayStats(){
		System.out.println("Class:         " + super.type);
		System.out.println("Health:        " + super.health);
		System.out.println("Strength:      " + super.strength);
		System.out.println("Endurance:     " + super.endurance);
		System.out.println("Speed:         " + super.speed);
		System.out.println("=====================================");
	}
}
