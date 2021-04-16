package com.company;

public class Main {

    public static void main(String[] args) {
		Boss putin = new Boss();
		putin.setHealth(45);
		putin.setStrike(80);
		putin.setSuperStrike(400);
		putin.knife.setName("LongKnife");
		putin.knife.setType("knife");
		System.out.println(putin.knife.getName() + " Super strike " + putin.getSuperStrike() + " Health "
		+ putin.getHealth() + "  Strike " + putin.getStrike());
		System.out.println(putin.printInfo());

		Scelet scelet = new Scelet();
		scelet.setHealth(45);
		scelet.setStrike(80);
		scelet.setSuperStrike(400);
		scelet.knife.setName("luk");
		scelet.knife.setType("luk");

		Scelet scelet2 = new Scelet();
		scelet2.setHealth(90);
		scelet2.setStrike(86);
		scelet2.setSuperStrike(100);
		scelet2.knife.setName("luk");
		scelet2.knife.setType("luk");

		System.out.println(scelet.printInfo());
		System.out.println(scelet2.printInfo());
		System.out.println(putin.printInfo());
    }
}
