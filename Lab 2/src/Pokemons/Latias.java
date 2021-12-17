package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Latias extends Pokemon {
    public Latias (String name,int level ){
        super(name,level);
        setType(Type.DRAGON, Type.PSYCHIC);
        setStats(80,80,90,110,130,110);
        setMove(new DreamEater(),new CalmMind(),new ShadowClaw(),new Recover());
    }
}
