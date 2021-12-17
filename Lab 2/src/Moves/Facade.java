package Moves;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade (){
        super(Type.NORMAL,70,100);
    }
    @Override
    protected String describe() {
        return  "удваивает силу, если использующий обожжён, парализован или отравлен.";
    }
    @Override
    protected void applySelfEffects (Pokemon att){
        if (att.getCondition() == Status.BURN || att.getCondition() == Status.PARALYZE || att.getCondition() == Status.POISON) {
            att.setMod(Stat.ATTACK, 2);
        }
    }
}
