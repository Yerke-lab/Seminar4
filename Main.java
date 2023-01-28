public class Main {
    public static void main(String[] args) {
        Team<Swordman> team1 = new Team<>();
        team1.addWarriorToTeam(new Swordman("Vasya", 250, new Sword(25), new Guard(20)))
                .addWarriorToTeam(new Swordman("John", 200, new Sword(50), new Guard(35)));

        for (Swordman swordman : team1) {
            System.out.println(swordman);
        }

        Team <Archer> team2 = new Team<>();
        team2.addWarriorToTeam(new Archer("Kolya", 150, new Bow(100, 50), new Guard(0)))
                .addWarriorToTeam(new Archer("Paul", 200, new Bow(75, 70), new Guard(25)));

        for (Archer person : team2) {
            System.out.println(person);
        }

        System.out.println(team1.maxTeamRange());
        System.out.println(team2.maxTeamRange());
    }
}