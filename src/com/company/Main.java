package com.company;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ISquare mySquare = FigureFactory.createSquare(4);
        mySquare.getSquareInfo();
        mySquare.drawSquare();
        System.out.println(mySquare.toJSON());
        System.out.println(mySquare.toXML());
    }
}



