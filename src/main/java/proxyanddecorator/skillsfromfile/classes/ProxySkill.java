package proxyanddecorator.skillsfromfile.classes;

import java.util.List;

import proxyanddecorator.skillsfromfile.intf.SkillInterface;

public class ProxySkill implements SkillInterface {

    private RealSkill realImage;
    private String fileName;

    public ProxySkill(String fileName) {
        this.fileName = fileName;
    }

    
    public List<String> getSkill() {
        if (realImage == null) {
            realImage = new RealSkill(fileName);
        }
        return realImage.getSkill();
    }
}
