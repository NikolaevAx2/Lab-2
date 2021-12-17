package Moves;
import ru.ifmo.se.pokemon.*;

public class AcidSpray extends SpecialMove {
    public AcidSpray(){
        super(Type.POISON,40,100);
    }
    @Override
    protected java.lang.String describe(){
        return "имеет 100% вероятность понизить Спец. Защиту цели на две ступени";
    }
    @Override
    protected void applyOppEffects(Pokemon opp){
        Effect AcidSpray = new Effect().chance(1).stat(Stat.SPECIAL_DEFENSE, -2);
        opp.setCondition(AcidSpray);
    }
}
