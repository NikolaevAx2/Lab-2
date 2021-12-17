package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Nincada extends Pokemon {
    public Nincada (String name,int level ){
        super(name,level);
        setType(Type.BUG, Type.GROUND);
        setStats(31,45,90,30,30,40);
        setMove(new AerialAce(),new Facade(),new Absorb());
    }
}
