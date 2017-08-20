package proxyanddecorator.players.classes;

import java.util.List;

import proxyanddecorator.players.intf.PlayerInterface;

public class FootballPlayer implements PlayerInterface {
	private List<String> mySkillList;

	public FootballPlayer() {
		System.out.println("cdddd");
	}

	public FootballPlayer(List<String> skillList) {
		mySkillList = skillList;
	}

	public void writeoutProperties() {
		System.out.print("Football player");
		for (String skill : mySkillList) {
			System.out.print(" " + skill + " ");
		}
	}
}
