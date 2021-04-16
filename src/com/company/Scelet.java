package com.company;

public class Scelet extends Boss{
    private int arrows;

    @Override
    public String printInfo() {
        return super.printInfo() + " arrows " + arrows;
    }
}
