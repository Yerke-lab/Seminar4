import java.util.Random;

// Создать класс щита
public class Guard extends Protection {
    
    public Guard(int attackDefense) {
            super(attackDefense);
            
        }

    @Override
    public int reflection() {
        return new Random().nextInt(0, attackDefense);
    }
    @Override
    public String toString() {
        return String.format("Guard protection = %d", attackDefense);
    }
}
