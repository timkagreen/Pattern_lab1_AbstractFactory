import java.util.ArrayList;

public interface AbstractArmyFactory{
    Commander getCommander();
    Mage getMage();
    Warrior getWarrior();
    Archer getArcher();
    ArrayList createArmy(int mage, int warrior, int archer);
}
