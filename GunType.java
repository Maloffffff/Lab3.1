package lab_3;

enum GunType{
    SWORD("меч", 15, 2, AttackType.RANGED_CLOSE),
    STICKER("ножик", 10, 1, AttackType.CLOSE),
    MINIGUN("миниган", 30, 10, AttackType.LONG_FIREARM),
    DESERTEAGLE("дигл", 25, 7, AttackType.MIDDLE_FIREARM);

    private int range;
    private int damage;
    private String name;
    private AttackType attackType;

    GunType(String name,int damage, int range, AttackType attackType) {
        this.name = name;
        this.damage = damage;
        this.range = range;
        this.attackType = attackType;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }


}
