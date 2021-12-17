package Moves;
import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
    public AerialAce(){
        super(Type.FLYING,60,0);
    }
    @Override
    protected String describe() {
        return  "запутывает цель большой скоростью, а затем атакует. От атаки невозможно уклониться.";
    }

    @Override
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2) {
        return true;
    }
}
