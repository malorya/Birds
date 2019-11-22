package com.company;

import java.awt.*;

public class Penguin extends Bird
{
    public static int KOL = 0;
    private int x, y, size;
    public static int MinX = 1000, MinY = 1000, MaxX = -1000, MaxY = -1000;
    private Color color;
    public Penguin()
    {
        KOL++;
        int x = (int) (Math.random()*700) - 350;
        int y = (int) (Math.random()*700) - 350;
        MinX = Math.min(MinX, x);
        MinY = Math.min(MinY, y);
        MaxX = Math.max(MaxX, x);
        MaxY = Math.max(MaxY, y);
        this.setCoords(x, y, Color.red, 20);
        name = "Пингвин";
        printName();
    }
    public Penguin (String name)
    {
        KOL++;
        this.name = name;
        printName();
    }
    @Override
    public void printName() {
        System.out.println("Я пингвин - " + name);
    }
    @Override
    public void fly()
    {
        System.out.println("Я не умею летать!");
    }
    public void tweet()
    {
        System.out.println("Чирикаю по-пингвински!");
    }
    @Override
    public void setCoords(int x, int y, Color color, int size)
    {
        this.x = x;
        this.y = y;
        this.color = color;
        this.size = size;
    }
    @Override
    public void draw(Graphics g)
    {
        g.setColor(color);
        g.fillOval(x, y, size, size);
        g.setColor(Color.green);
        g.fillOval(x+8, y+8, 5, 5);
    }

}
