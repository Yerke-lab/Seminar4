public abstract class Warrior {
    private String name;
    private int healthPoint;
    private Weaponable weapon;
    private Protectionable protection;

    public Warrior(String name, int healthPoint, Weaponable weapon, Protectionable protection) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.protection = protection;
    }

    public String getName() {
        return name;
    }
    public int getHealthPoint() {
        return healthPoint;
    }
    public Weaponable getWeapon() {
        return weapon;
    }
    public Protectionable getProtection() {
        return protection;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return "Warrior [name = " + name + ", healthPoint = " + healthPoint + ", weapon = " + weapon + ", protection = " + protection +"]";
    }
}
