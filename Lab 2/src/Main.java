import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {

        Battle b = new Battle();

        Latias latias = new Latias("Latias", 1);
        Tynamo tynamo = new Tynamo("Tynamo", 1);
        Eelektrik eelektrik = new Eelektrik("Eelektrik",1);
        Eelektross eelektross = new Eelektross("Eelektross",1);
        Nincada nincada = new Nincada("Nincada",1);
        Ninjask ninjask = new Ninjask("Ninjask",1);

        b.addAlly(latias);
        b.addAlly(nincada);
        b.addAlly(ninjask);
        b.addFoe(tynamo);
        b.addFoe(eelektrik);
        b.addFoe(eelektross);
        b.go();
    }
}
