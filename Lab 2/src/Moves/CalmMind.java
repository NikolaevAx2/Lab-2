package Moves;
import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove{
    public CalmMind (){
    super(Type.PSYCHIC,0,0);
    }
    @Override
    protected String describe() {
        return  "повышает свою Спец. Атаку и Спец. Защиту на одну ступень каждую";
    }
    @Override
    protected void applySelfEffects(Pokemon att) {
        att.setMod(Stat.SPECIAL_ATTACK, 1);
        att.setMod(Stat.SPECIAL_DEFENSE, 1);
    }
}
