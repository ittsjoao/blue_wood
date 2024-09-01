package classes;

public class Elves extends Races {
    
    public Elves(String name) {
        super(name, 1100, 4, 40, 90, 1);
    }
    @Override
    public void attack(Races enimies, AttackType attack) {
        switch (attack) {
            case AttackType.PUNCH:
                enimies.reciveDamage(AttackType.PUNCH.getAttackPower());
                break;
            case AttackType.FIREBALL:
                enimies.reciveDamage(AttackType.FIREBALL.getAttackPower());
                break;
            case AttackType.SHINY_ARROW:
                enimies.reciveDamage(AttackType.SHINY_ARROW.getAttackPower());
                break;
            case AttackType.KNIFE_ATTACK:
                enimies.reciveDamage(AttackType.KNIFE_ATTACK.getAttackPower());
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
