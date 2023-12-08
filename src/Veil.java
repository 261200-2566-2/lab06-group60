public class Veil implements Accessories {
    protected int level;
    protected int hp;
    protected int mana;
    protected double speed;
    protected double damage;
    protected double defense;

    public Veil(){
        this.level = 10;
        this.hp = 50;
        this.mana = 20;
        this.speed = 0;
        this.damage = 0;
        this.defense = 50;
    }

    @Override
    public void addEffect(Men men) {
        men.updateFromVeil(this);
    }
    @Override
    public void addEffect(Women women) {
        women.updateFromVeil(this);
    }

}