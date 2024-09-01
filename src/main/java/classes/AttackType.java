package classes;

import java.util.Scanner;

public enum AttackType {
    PUNCH(4),
    KICK(10),
    SHINY_ARROW(15),
    FIREBALL(25),
    KNIFE_ATTACK(20),
    SWORD_ATTACK(35),
    REMOVE_SHIELD(10),
    TROWH_STONE(5);

    private final int attackPower;

    AttackType(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public static AttackType setAttackType() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um tipo de ataque:");
        
        for (int i = 0; i < AttackType.values().length; i++) {
            System.out.println((i + 1) + " - " + AttackType.values()[i]);
        }
        
        int choice = sc.nextInt();

        if (choice >= 1 && choice < AttackType.values().length) {
            return AttackType.values()[choice - 1];
        } else {
            System.out.println("Ataque inválido. Tente novamente.");
            return setAttackType();
        }

    }
}