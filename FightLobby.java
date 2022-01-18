package lab_3;

import java.util.Objects;

public class FightLobby {
    private Shorty attacker;
    private Shorty opponent;

    public FightLobby(Shorty attacker, Shorty opponent) {
        this.attacker = attacker;
        this.opponent = opponent;
    }

    public void start() {
        while (this.opponent.getHealthPoints() > 0 & this.attacker.getHealthPoints() > 0) {
            this.attacker.attack(opponent);
            if (this.opponent.getHealthPoints() > 0) {
                this.opponent.attack(attacker);
                if (this.attacker.getHealthPoints() <= 0) {
                    System.out.println(opponent.getFirstName() + " считает, что " + attacker.getFirstName() + " сам виноват:");
                    System.out.println("---'Я всего лишь оказался тут раньше него....'");
                    break;
                }
            }
            else if (this.opponent.getHealthPoints()<=0){
                    System.out.println("Мне " + this.opponent.getFirstName()+ " никогда не нравился!");
                    break;
            }
        }
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FightLobby that = (FightLobby) o;
        return attacker.equals(that.attacker) && opponent.equals(that.opponent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attacker, opponent);
    }
}
