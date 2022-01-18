package lab_3;

import java.util.Objects;

public abstract class LivingCreature {
    private String firstName;
    private int healthPoints;
    private int maxHealthPoints;
    private int attackAmount;

    public void restoreHealth(int amount){
        setHealthPoints(this.healthPoints + amount);
    }

    public void loseHealth(int amount){
        this.setHealthPoints(this.healthPoints - amount);
        if (this.getHealthPoints() < amount){
            System.out.println(this.getFirstName()+ " потерял " + this.getHealthPoints() + " очков HP.");
        }
        else{
        System.out.println(this.getFirstName()+ " потерял " + amount + " очков HP.");}
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
    public void setHealthPoints(int healthPoints) {
        if (healthPoints < 0) this.healthPoints = 0;
        else if(healthPoints >= maxHealthPoints) this.healthPoints = maxHealthPoints;
        else this.healthPoints = healthPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public int getAttackAmount() {
        return attackAmount;
    }

    public void setAttackAmount(int attackAmount) {
        this.attackAmount = attackAmount;
    }
    public void attack(LivingCreature livingCreature){
        livingCreature.loseHealth(this.attackAmount);
    }

    @Override
    public String toString() {
        return
                "firstName = " + firstName +
                ", healthPoints = " + healthPoints +
                ", maxHealthPoints = " + maxHealthPoints +
                ", attackAmount = " + attackAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LivingCreature that = (LivingCreature) o;
        return healthPoints == that.healthPoints && maxHealthPoints == that.maxHealthPoints && attackAmount == that.attackAmount && firstName.equals(that.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, healthPoints, maxHealthPoints, attackAmount);
    }
}
