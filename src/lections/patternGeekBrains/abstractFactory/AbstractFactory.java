package lections.patternGeekBrains.abstractFactory;

public abstract class AbstractFactory {
    public abstract Mage createMage();
    public abstract Archer createArcher();
    public abstract Warrior createWarrior();
}

class ElfFactory extends AbstractFactory {

    @Override
    public Mage createMage() {
        return new ElfMage();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}


