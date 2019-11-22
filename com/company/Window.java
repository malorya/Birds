package com.company;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame
{
    private Flock f;
    public Window(Flock f)
    {
        setSize(800, 800);
        setVisible(true);
        setTitle("Птицы");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.f = f;
    }
    @Override
    public void paint(Graphics g)
    {
        int x = getWidth()/2;
        int y = getHeight()/2;
        g.translate(x, y);
        g.drawLine(-x,0, x,0);
        g.drawLine(0, -y,0, y);
        f.draw(g);
        //Рисуем прямоугольник для попугаев
        if (Parrot.KOL > 0)
        {
            g.setColor(Color.blue);
            g.drawRect(Parrot.MinX, Parrot.MinY, Parrot.MaxX - Parrot.MinX + 15, Parrot.MaxY - Parrot.MinY + 15);
        }
        //Рисуем прямоугольник для пингвинов
        if (Penguin.KOL > 0)
        {
            g.setColor(Color.red);
            g.drawRect(Penguin.MinX, Penguin.MinY,Penguin.MaxX - Penguin.MinX + 20, Penguin.MaxY - Penguin.MinY + 20);
        }
        //Рисуем прямоугольник для воробьёв
        if (Sparrow.KOL > 0)
        {
            g.setColor(Color.yellow);
            g.drawRect(Sparrow.MinX, Sparrow.MinY, Sparrow.MaxX - Sparrow.MinX + 10, Sparrow.MaxY - Sparrow.MinY + 10);
        }
    }
}
