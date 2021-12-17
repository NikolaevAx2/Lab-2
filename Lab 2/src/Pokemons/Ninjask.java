package Pokemons;

import Moves.Roost;
import ru.ifmo.se.pokemon.*;
public class Ninjask extends Nincada{
    public Ninjask (String name,int level ){
        super(name,level);
        setType(Type.BUG, Type.FLYING);
        setStats(61,90,45,50,50,160);
        addMove( new Roost());
    }
}
