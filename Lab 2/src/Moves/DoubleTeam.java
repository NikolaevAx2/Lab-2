package Moves;
import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL,0 ,0);
    }
    @Override
    protected java.lang.String describe(){
        return "повышает своё уклонение на одну ступень.";
    }
    @Override
    protected void applySelfEffects(Pokemon att){
        Effect DoubleTeam = new Effect().stat(Stat.ACCURACY, +1);
        att.setCondition(DoubleTeam);
    }
}
