public class WizzardOfEmeraldCityCommander implements Commander {

    private static WizzardOfEmeraldCityCommander instance;

    private WizzardOfEmeraldCityCommander(){}
    public static WizzardOfEmeraldCityCommander getInstance() {
        if (instance == null) {
            instance = new WizzardOfEmeraldCityCommander();
        }
        return instance;
    }

    @Override
    public void printName() {
        System.out.println("Wizzard Of Emerald City");
    }
}
