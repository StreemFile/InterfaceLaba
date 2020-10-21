package com.company;

/**
 * Created by IntelliJ IDEA.
 * InterfaceLaba.ISquareService
 *
 * @Autor: vovamv
 * @DateTime: 10/21/20|8:44 пп
 * @Version ISquareService: 1.0
 */

public interface ISquareService {
    double getDiagonal();

    double getRadiusOfCircumscribedCircle();

    double getRadiusOfInscribedCircle();

    void drawSquare() throws InterruptedException;

    void getSquareInfo();
}
