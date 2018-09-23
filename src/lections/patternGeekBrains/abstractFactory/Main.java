package lections.patternGeekBrains.abstractFactory;

public class Main {
    public void createSquadron(AbstractFactory factory) {
        Mage mage = factory.createMage();
        Archer archer = factory.createArcher();
        Warrior warrior = factory.createWarrior();

    }
}
