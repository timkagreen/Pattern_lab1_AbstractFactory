import java.util.ArrayList;

public class ElfArmy implements AbstractArmyFactory {

    @Override
    public Commander getCommander() {
        return ElfCommander.getInstance();
    }

    @Override
    public Mage getMage() {
        return new ElfMage();
    }

    @Override
    public Warrior getWarrior() {
        return new ElfWarrior();
    }

    @Override
    public Archer getArcher() {
        return new ElfArcher();
    }

    @Override
    public ArrayList createArmy(int mage, int warrior, int archer) {
        ArrayList army = new ArrayList();
        army.add(getCommander());


        if (mage > 5)
            army.clear();
        else {
            for (int i = 0; i < mage; i++) {
                army.add(getMage());
            }
        }

        if (warrior > 3)
            army.clear();
        else {
            for (int i = 0; i < warrior; i++) {
                army.add(getWarrior());
            }
        }

        if (archer > 4)
            army.clear();
        else {
            for (int i = 0; i < archer; i++) {
                army.add(getArcher());
            }
        }


        return army;
    }
}
