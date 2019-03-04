public class ElfCommander implements Commander{

    private static ElfCommander instance;

    private ElfCommander(){}
    public static ElfCommander getInstance() {
        if (instance == null) {
            instance = new ElfCommander();
        }
        return instance;
    }

    @Override
    public void printName() {
        System.out.println("ELFIDRON");
    }
}
