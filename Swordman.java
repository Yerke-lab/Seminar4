public class Swordman extends Warrior {

    public Swordman(String name, int healthPoint, Sword sword, Guard guard) {
        super(name, healthPoint, sword, guard);
    }

    @Override
    public String toString() {
        return "Swordman, " + super.toString();
    }
    public int minAttackReflection() {
        return ((Guard) getProtection()).getAttackReflection();
    }
    
}
