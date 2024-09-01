package interfaces;

import classes.AttackType;
import classes.Races;


public interface Lutador {
    void attack(Races enimies, AttackType attack);
    void reciveDamage(int damage);
}
