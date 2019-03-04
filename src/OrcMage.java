public class OrcMage implements Mage{
    @Override
    public void printSkill() {
        System.out.println("Skill:  orcMageSkill");
    }

    @Override
    public void printDamage() {
        System.out.println("Damage:    10");
    }

    @Override
    public void printAttackRange() {
        System.out.println("Range:   180");
    }
}
