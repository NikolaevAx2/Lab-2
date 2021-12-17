package Moves;
import ru.ifmo.se.pokemon.*;

public class Absorb extends SpecialMove {

    public Absorb() {
        super(Type.GRASS ,20 ,100);
    }

    @Override
    protected java.lang.String describe(){
        return "восстанавливает ОЗ в размере половины нанесённых повреждений";
    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP,(int)Math.round((-0.5)*damage));
    }
}
