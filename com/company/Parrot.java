package com.company;

import java.awt.*;

public class Parrot extends Bird
{

    public static int KOL = 0;
    public static int MinX = 1000, MinY = 1000, MaxX = -1000, MaxY = -1000;
    public Parrot()
    {
        KOL++;
        //int x = (int) (Math.random()*(Window.A- Window.A/8) - ((Window.A- Window.A/8)/2));
        //int y = (int) (Math.random()*(Window.B -Window.B/8) - ((Window.B- Window.B/8)/2));
        int x = Main.x + (int) (Math.random()*(Window.A/3 - 15));
        int y = Main.y - 20;
        MinX = Math.min(MinX, x);
        MinY = Math.min(MinY, y);
        MaxX = Math.max(MaxX, x);
        MaxY = Math.max(MaxY, y);
        setCoords(x, y, Color.blue, 15);
        name = "Попугай";
        printName();
    }
    public Parrot(String name)
    {
        KOL++;
        this.name = name;
        printName();
    }
    @Override
    public void printName() {
        System.out.println("Я попугай - " + name);
    }
    @Override
    public void fly()
    {
        System.out.println("Я летаю - это правда!");
    }
    public void tweet()
    {
        System.out.println("Сам чирикай!");
    }
}
