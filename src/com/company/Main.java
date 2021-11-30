package com.company;

public class Main {

    public static void main(String[] args) {
        Medic islam = new Medic();
        Magic koldun = new Magic();
        Warrior barbarian = new Warrior();
        Hero[] heroes = { islam ,koldun , barbarian};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility( " Ability");

        }

    }
}

