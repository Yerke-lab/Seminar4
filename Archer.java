public class Archer extends Warrior {

    public Archer(String name, int healthPoint, Bow bow, Guard guard) {
            super(name, healthPoint, bow, guard);
        }

        @Override
        public String toString() {
            return "Archer, " + super.toString();
        }

        public int shotRange() {
            return ((Bow) getWeapon()).getRange();
        }
}
