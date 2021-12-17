package Moves;
import ru.ifmo.se.pokemon.*;

public class Roost extends SpecialMove {
    public Roost(){
        super(Type.FLYING, 0,0);
    }
    @Override
    protected java.lang.String describe(){
        return "восстанавливает половину своих максимальных ОЗ";
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int)Math.round(att.getStat(Stat.HP)*(-0.5)));
    }
}
