package Moves;
import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
    public ThunderWave(){
        super(Type.ELECTRIC,0,100);
    }
    @Override
    protected java.lang.String describe(){
        return "парализует цель";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect paralyze = new Effect().chance(1).condition(Status.PARALYZE);
        p.addEffect(paralyze);
    }
}
