package com.company;

import javax.swing.*;

public class Boss extends GameEntity {
    Weapon knife = new Weapon();

    public String printInfo(){
       return knife.getName() + " Super strike " + super.getSuperStrike() + " Health "
                + super.getHealth() + "  Strike " + super.getStrike();
    }
}



