package com.company;

/**
 * Created by IntelliJ IDEA.
 * InterfaceLaba.FigureFactory
 *
 * @Autor: vovamv
 * @DateTime: 10/21/20|7:31 пп
 * @Version FigureFactory: 1.0
 */

public class FigureFactory {
    public static Square createSquare(double side) {
        return new Square(side);
    }
}
