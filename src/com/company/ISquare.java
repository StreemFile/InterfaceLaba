package com.company;

/**
 * Created by IntelliJ IDEA.
 * InterfaceLaba.ISquareService
 *
 * @Autor: vovamv
 * @DateTime: 10/21/20|7:58 пп
 * @Version ISquareService: 1.0
 */

public interface ISquare extends IFigure, ISquareService, IOutputFigure {
    double getSide();

    void setSide(double side);
}
