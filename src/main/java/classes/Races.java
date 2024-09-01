package classes;

import interfaces.Lutador;

public abstract class Races implements Lutador{

        private String name;
        private int life;
        private int strength;
        private int magiclevel;
        private int inteligence;
        private int level;

    
        public Races(String name, int life, int strength, int magiclevel, int inteligence, int level) {
            this.name = name;
            this.life = life;
            this.strength = strength;
            this.magiclevel = magiclevel;
            this.inteligence = inteligence;
            this.level = level;
        }
        public void showAttribute() {
            System.out.println("Name: " + this.getName());
            System.out.println("Level: " + this.getLevel());
            System.out.println("Life: " + this.getLife());
            System.out.println("Force: " + this.getStrength());
            System.out.println("Inteligence: " + this.getInteligence());
            System.out.println("Magic Level: " + this.getMagiclevel());
            }

        public void show () {
            System.out.println("1");
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getLife() {
            return life;
        }
        public void setLife(int life) {
            this.life = life;
        }
        public int getStrength() {
            return strength;
        }
        public void setStrength(int strength) {
            this.strength = strength;
        }
        public int getMagiclevel() {
            return magiclevel;
        }
        public void setMagiclevel(int magiclevel) {
            this.magiclevel = magiclevel;
        }
        public int getInteligence() {
            return inteligence;
        }
        public void setInteligence(int inteligence) {
            this.inteligence = inteligence;
        }
        public int getLevel() {
            return level;
        }
        public void setLevel(int level) {
            this.level = level;
        }
    
} 