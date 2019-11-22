package com.company;

import sun.util.calendar.BaseCalendar;
import sun.util.calendar.LocalGregorianCalendar;

import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Bird
{
    public static int KOL = 0;
    protected String name;
    private int x, y, size;
    private Color color;
    public Bird()
    {
        KOL++;
        name = "Птица";
    }
    public Bird(String name)
    {
        KOL++;
        this.name = name;
    }

    public void printName() {
        System.out.println("Я птица - " + name);
    }

    public void fly()
    {
        System.out.println("Я летаю!");
    }
    public abstract void tweet();
    public void draw(Graphics g)
    {
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }
    public void setCoords(int x, int y, Color color, int size)
    {
        this.x = x;
        this.y = y;
        this.color = color;
        this.size = size;
    }
    public void time()
    {
       int hours = Calendar.getInstance().getTime().getHours();
       if (hours >= 6 && hours < 12)
       {
           System.out.println("Сейчас " + hours + " часов. " + "Доброе утро!");
       }
       if (hours >= 12 && hours < 17)
        {
            System.out.println("Сейчас " + hours + " часов. " + "Добрый день!");
        }
        if (hours >= 17 && hours < 23)
        {
            System.out.println("Сейчас " + hours + " часов. " + "Добрый вечер!");
        }
        if (hours >= 23 && hours < 6)
        {
            System.out.println("Сейчас " + hours + " часов. " + "Уже ночь!!!");
        }
    }
}
