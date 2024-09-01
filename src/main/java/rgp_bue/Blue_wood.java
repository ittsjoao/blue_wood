package rgp_bue;

import classes.Arena;
import classes.AttackType;
import classes.Dwarfs;
import classes.Humans;

/**
 * @author joao3
 */
public class Blue_wood {

    public static void main(String[] args) {
        Dwarfs jogador1 = new Dwarfs("Joao");
        Humans jogador2 = new Humans("Ana"); 
        // jogador2.showAttribute();
        jogador1.attack(jogador2, AttackType.PUNCH);
        // jogador2.showAttribute();
        Arena arena = new Arena();
        // arena.lutadores.add(jogador2); 
        // arena.lutadores.add(jogador1);
        arena.iniciarCombate();

    }
}
