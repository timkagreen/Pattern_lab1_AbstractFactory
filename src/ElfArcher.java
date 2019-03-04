public class ElfArcher implements Archer{
    @Override
    public void printSkill() {
        System.out.println("Skill:  elfArcherSkill");
    }

    @Override
    public void printDamage() {
        System.out.println("Damage:    15");
    }

    @Override
    public void printAttackRange() {
        System.out.println("Range:   600");
    }
}
