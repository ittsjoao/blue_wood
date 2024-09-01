package classes;

public class Humans extends Races {

    public Humans(String name) {
        super(name, 1500, 8, 0, 70, 1); // Chama o construtor padrão de Races
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
