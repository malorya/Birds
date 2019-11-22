package com.company;

import java.awt.*;

public class Sparrow extends Bird
{
    public static int KOL = 0;
    public static int MinX = 1000, MinY = 1000, MaxX = -1000, MaxY = -1000;
    public Sparrow()
    {
        KOL++;
        int x = (int) (Math.random()*700) - 350;
        int y = (int) (Math.random()*700) - 350;
        MinX = Math.min(MinX, x);
        MinY = Math.min(MinY, y);
        MaxX = Math.max(MaxX, x);
        MaxY = Math.max(MaxY, y);
        setCoords(x, y, Color.yellow, 10);
        name = "Воробей";
        printName();
    }
    public Sparrow(String name)
    {
        KOL++;
        this.name = name;
        printName();
    }
    @Override
    public void printName() {
        System.out.println("Я воробей - " + name);
    }
    public void tweet()
    {
        System.out.println("Чирик!");
    }
}
