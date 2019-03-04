import java.util.ArrayList;

public class WizzardOfEmeraldCityArmy implements AbstractArmyFactory {
    @Override
    public Commander getCommander() {
        return WizzardOfEmeraldCityCommander.getInstance();
    }

    @Override
    public Mage getMage() {
        return null;
    }

    @Override
    public Warrior getWarrior() {
        return new WizzardOfEmeraldCityWarrior();
    }

    @Override
    public Archer getArcher() {
        return null;
    }

    @Override
    public ArrayList createArmy(int mage, int warrior, int archer) {
        ArrayList army = new ArrayList();

        army.add(getCommander());

        if (warrior > 21)
            army.clear();
        else {
            for (int i = 0; i < warrior; i++) {
                army.add(getWarrior());
            }
        }

        return army;
    }
}
