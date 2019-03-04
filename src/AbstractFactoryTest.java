import java.util.ArrayList;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractArmyFactory elfFactory = new ElfArmy();
        AbstractArmyFactory orcFactory = new OrcArmy();
        AbstractArmyFactory wizardOfEmeraldCityFactory = new WizzardOfEmeraldCityArmy();

        //army max count(mage, warrior, archer)
        //elf's: 4, 2, 3
        //orc's: 1, 5, 2
        //tree's: -, 20, -

        ArrayList elfArmy = elfFactory.createArmy(4, 2, 3);
        ArrayList orcArmy = orcFactory.createArmy(1, 5, 2);
        ArrayList wizzardOfEmeraldCityArmy = wizardOfEmeraldCityFactory.createArmy(0, 12, 0);




        System.out.println(elfArmy);
        System.out.println(orcArmy);
        System.out.println(wizzardOfEmeraldCityArmy);


    }
}


