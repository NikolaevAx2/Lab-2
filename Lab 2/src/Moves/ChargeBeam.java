package Moves;
import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam (){
        super(Type.ELECTRIC,50,90);
    }
    @Override
    protected java.lang.String describe(){
        return "имеет 70% вероятность повысить свою Спец. Атаку на одну ступень.";
    }
    @Override
    protected void applySelfEffects(Pokemon att){
        Effect ChargeBeam = new Effect().chance(0.7).stat(Stat.SPECIAL_ATTACK, +1);
        att.setCondition(ChargeBeam);
    }
}
