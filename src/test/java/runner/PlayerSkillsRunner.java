package runner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import proxyanddecorator.player.decorator.classes.JuniorDecorator;
import proxyanddecorator.player.decorator.classes.RichDecorator;
import proxyanddecorator.players.classes.BasketballPlayer;
import proxyanddecorator.players.classes.FootballPlayer;
import proxyanddecorator.players.intf.PlayerInterface;
import proxyanddecorator.skillsfromfile.classes.ProxySkill;
import proxyanddecorator.skillsfromfile.intf.SkillInterface;
import utils.ReadFromConsole;
import utils.WriteToFile;

public class PlayerSkillsRunner {

	public static void main(String[] args) {
    	System.out.println("What Player would You like to choose?\n ");
    	System.out.println("1: Junior BasketballPlayer ");
    	System.out.println("2: Junior Rich FootballPlayer ");
    	System.out.println("3: BasketballPlayer ");
    	System.out.println("4: Rich BasketballPlayer ");
    	
    	int userChoise=ReadFromConsole.reading();
        
        
    	System.out.println("Your choise:" + userChoise);
    	
    	
		
		
		
	
    	
    	SkillInterface pSkill = new ProxySkill("Skills.txt");
    	PlayerInterface jFPlayer = new JuniorDecorator(new BasketballPlayer());
    	PlayerInterface jBPlayer = new JuniorDecorator(new RichDecorator(new FootballPlayer(pSkill.getSkill())));
    	PlayerInterface BBPlayer = new BasketballPlayer();
    	PlayerInterface rBPlayer = new RichDecorator(new BasketballPlayer());
        // System.out.println(pSkill.getSkill());

        // List<String> allSkillsFromTxt;
        // allSkillsFromTxt = pSkill.getSkill();
        // for (String skill : allSkillsFromTxt) {
        // System.out.println(skill);
        // }
    	switch (userChoise){
    	case 1:
    		jFPlayer.writeoutProperties();
			WriteToFile.writing();  
			jFPlayer.writeoutProperties();
    	break; 	
    	case 2:
    		jBPlayer.writeoutProperties();
    		WriteToFile.writing();
    		jBPlayer.writeoutProperties();
        	break; 	
    	case 3:
    		BBPlayer.writeoutProperties();
    		WriteToFile.writing();
    		BBPlayer.writeoutProperties();
        	break; 	
    	case 4:
    		rBPlayer.writeoutProperties();
    		WriteToFile.writing(); 
    		rBPlayer.writeoutProperties();
        	break; 	
    	}
    	
    	
	
     
       // jFPlayer.writeoutProperties();
    }

}
// 1., PlayerHistory.txt játékos history
// 2., a végeredményt beleírja egy fájlba