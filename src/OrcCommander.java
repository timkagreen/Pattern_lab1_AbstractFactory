public class OrcCommander implements Commander{

    private static OrcCommander instance;
    private OrcCommander(){}
    public static OrcCommander getInstance() {
        if (instance == null)
            instance = new OrcCommander();

        return instance;
    }

    @Override
    public void printName() {
        System.out.println("ORC VASYAN");
    }
}
