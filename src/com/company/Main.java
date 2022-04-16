package com.company;

public class Main {

    public static void main(String[] args) {

        Medic medic = new Medic();
        medic.applySuperAbility();

        Magic magic = new Magic();
        magic.applySuperAbility();

        Warrior warrior = new Warrior();
        warrior.applySuperAbility();

        HavingSuperAbility havingSuperAbility[] = {medic, magic, warrior};
        for (int i = 0; i < havingSuperAbility.length; i++) {
            System.out.println(havingSuperAbility[i]);

        }
    }
}
