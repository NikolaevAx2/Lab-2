package Moves;
import ru.ifmo.se.pokemon.*;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw (){
        super(Type.GHOST,70,100);
    }
    @Override
    protected String describe() {
        return "имеет повышенный шанс критического удара.";
    }
    @Override
    protected void applySelfEffects(Pokemon att){
        att.setMod(Stat.SPEED,1);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int)Math.round(damage));
    }
}
