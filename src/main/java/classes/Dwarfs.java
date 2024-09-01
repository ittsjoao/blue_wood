package classes;

public class Dwarfs extends Races {

    public Dwarfs(String name) {
        super(name, 1800, 10, 20, 50, 1);
    }

    @Override
    public void attack(Races enimies, AttackType attack) {
        switch (attack) {
            case AttackType.PUNCH:
                enimies.reciveDamage(AttackType.PUNCH.getAttackPower());
                break;
            case AttackType.KICK:
                enimies.reciveDamage(AttackType.KICK.getAttackPower());
                break;
            case AttackType.SWORD_ATTACK:
                enimies.reciveDamage(AttackType.SWORD_ATTACK.getAttackPower());
                break;
            case AttackType.TROWH_STONE:
                enimies.reciveDamage(AttackType.TROWH_STONE.getAttackPower());
            default:
                System.out.println("Ataque não reconhecido.");
                break;
        }
    }

    @Override
    public void reciveDamage(int damage) {
        int newHealth = getLife() - damage;
        this.setLife(newHealth);
    }


}