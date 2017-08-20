package runner;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

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
	
	final static Logger logger = Logger.getLogger(PlayerSkillsRunner.class);
	

	public static void main(String[] args) {
		
		logger.setLevel(Level.INFO);
		

		logger.info("What Player would You like to choose?\n ");
		logger.info("1: Junior BasketballPlayer ");
		logger.info("2: Junior Rich FootballPlayer ");
		logger.info("3: BasketballPlayer ");
		logger.info("4: Rich BasketballPlayer ");

		int userChoise = ReadFromConsole.reading();

		logger.info("Your choise:" + userChoise);

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
		switch (userChoise) {
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