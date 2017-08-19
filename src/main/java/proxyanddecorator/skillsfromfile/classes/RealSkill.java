package proxyanddecorator.skillsfromfile.classes;

import java.util.List;

import proxyanddecorator.skillsfromfile.intf.SkillInterface;
import utils.ReadFromFile;

public class RealSkill implements SkillInterface {

    private String fileName;

    public RealSkill(String fileName) {
        this.fileName = fileName;
    }

    
    public List<String> getSkill() {
        return ReadFromFile.readWithBufferedReader(fileName);
        // System.out.println("Speed=25" + " " + fileName);
    }

}
