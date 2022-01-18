package lab_3;

public class Shorty extends LivingCreature {
    private GunType gun;
    private boolean haveGun = false;
    private AttackType attackType;



    public Shorty(String firstName,int attackAmount){
        this.setMaxHealthPoints(100);
        this.setHealthPoints(100);
        this.setFirstName(firstName);
        this.setAttackAmount(attackAmount);
        this.attackType = AttackType.CLOSE;
    }


    public void takeGun(GunType gun){
        this.gun = gun;
        this.haveGun = true;
        this.setAttackAmount(gun.getDamage());
    }

    public void attack(Shorty opponent){
        if ((opponent.getHealthPoints()-this.getAttackAmount()) > 0) {
            System.out.println(this.getFirstName() + " атакует с помощью " + gun.getName() + "а !");
            opponent.loseHealth(this.getAttackAmount());
            if (opponent.getHealthPoints() <= 0){
                opponent.death();
            }
        }
        else{opponent.death();}

    }

    public void death(){
        System.out.println(this.getFirstName() + " погиб от руки соотечественника.. и не может продолжить путешествие... ");
    }

}
