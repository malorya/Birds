package com.company;


import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Flock
{
    private ArrayList<Bird> f;
    public Flock()
    {
        System.out.println("Введите 1 для нового попугая, 2 для нового пингвина, 3 для нового воробья и 0 для выхода");
        f = new ArrayList<Bird>();
        Scanner in = new Scanner(System.in);
        int choose;
        do
        {
            choose = in.nextInt();
            switch(choose)
            {
                case 0: break;
                case 1:
                    f.add(new Parrot());
                    break;
                case 2:
                    f.add(new Penguin());
                    break;
                case 3:
                    f.add(new Sparrow());
                    break;
                default:
                    System.out.println("Неправильный ввод");
                    break;
            }
        }
        while (choose != 0);
    }
    public void draw(Graphics g)
    {
        for (Bird bird : f)
        {
            bird.draw(g);
        }
    }
}
