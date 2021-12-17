package Moves;
import ru.ifmo.se.pokemon.*;

public class Recover extends SpecialMove {
    public Recover(){
        super(Type.NORMAL,0,0);
    }
    @Override
    protected String describe() {
        return  "восстанавливает половину своих максимальных ОЗ";
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int)Math.round(att.getStat(Stat.HP)*(-0.5)));
    }
}
