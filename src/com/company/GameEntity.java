package com.company;

public class GameEntity {
    private int health;
    private int strike;
    private int superStrike;

    public int getHealth() {
        return health;
    }

    public GameEntity setHealth(int health) {
        this.health = health;
        return this;
    }

    public int getStrike() {
        return strike;
    }

    public GameEntity setStrike(int strike) {
        this.strike = strike;
        return this;
    }

    public int getSuperStrike() {
        return superStrike;
    }

    public GameEntity setSuperStrike(int superStrike) {
        this.superStrike = superStrike;
        return this;
    }
}
