package Moves;
import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater(){
        super(Type.PSYCHIC,100,100);
    }
    boolean isSleep = false;
    @Override
    protected java.lang.String describe(){
        return "восстанавливает ОЗ в размере половины нанесённых повреждений.Работает только при использовании на спящих противниках";
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int)Math.round(damage));
        //Проверяем состояние покемона
        if (def.getCondition()== Status.SLEEP){
            isSleep=true;
        };
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        //Если покемон спит, излечиваем себе половину ОЗ (атакуем себя с -0.5)
        if (isSleep){
            att.setMod(Stat.HP,(int)Math.round((-0.5)*damage));
        }
    }
}
