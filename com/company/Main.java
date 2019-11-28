package com.company;

import java.util.Scanner;

public class Main {
    public static int x = 0, y =0;

    public static void main(String[] args) {
	    /*Bird bird1 = new Bird();
	    Bird bird2 = new Bird("Валерий");
	    bird1.printName();
	    //bird2.printName();*/
        /*Parrot parrot1 = new Parrot();
	    Parrot parrot2 = new Parrot("Валентин");
	    parrot1.printName();
        parrot2.printName();
        //bird1.fly();
        parrot1.fly();
        Penguin peng1 = new Penguin();
        Penguin peng2 = new Penguin("Клементий");
        peng1.printName();
        peng2.printName();
        peng1.fly();
        parrot1.tweet();
        peng1.tweet();
        Sparrow spar1 = new Sparrow();
        Sparrow spar2 = new Sparrow("Алёша");
        spar1.printName();
        spar2.printName();
        spar1.fly();
        spar2.tweet();*/
        System.out.println("Введите координаты начала ветки для попугаев");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        Flock f = new Flock();
        Bird bird1 = new Parrot();
        bird1.time();
        //Передаём стаю и точку начала ветки в окно
        Window k = new Window(f,x,y);
    }

}
