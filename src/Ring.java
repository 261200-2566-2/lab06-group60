
public class Ring implements Accessories {
    protected int level;
    protected int hp;
    protected int mana;
    protected double speed;
    protected double damage;
    protected double defense;

    public Ring(){
        this.level = 5;
        this.hp = 20;
        this.mana = 50;
        this.speed = 20;
        this.damage = 0;
        this.defense = 0;
    }

    @Override
    public void addEffect(Men men) {
        men.updateFromRing(this);
    }
    @Override
    public void addEffect(Women women) {
        women.updateFromRing(this);
    }

}

