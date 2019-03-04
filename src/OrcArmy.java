import java.util.ArrayList;

public class OrcArmy implements AbstractArmyFactory{

    @Override
    public Commander getCommander() {
        return OrcCommander.getInstance();
    }

    @Override
    public Mage getMage() {
        return new OrcMage();
    }

    @Override
    public Warrior getWarrior() {
        return new OrcWarrior();
    }

    @Override
    public Archer getArcher() {
        return new OrcArcher();
    }

    @Override
    public ArrayList createArmy(int mage, int warrior, int archer) {
        ArrayList army = new ArrayList();

        army.add(getCommander());

        if (mage > 2)
            army.clear();
        else {
            for (int i = 0; i < mage; i++) {
                army.add(getMage());
            }
        }

        if (warrior > 6)
            army.clear();
        else {
            for (int i = 0; i < warrior; i++) {
                army.add(getWarrior());
            }
        }

        if (archer > 3)
            army.clear();
        else {
            for (int i = 0; i < archer; i++) {
                army.add(getArcher());
            }
        }

        return army;
    }
}
