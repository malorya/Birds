package com.company;

public class Main {

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
        Flock f = new Flock();
        Bird bird1 = new Parrot();
        bird1.time();
        Window k = new Window(f);
    }

}
