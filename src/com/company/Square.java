package com.company;

import com.google.gson.Gson;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAttribute;
import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

/**
 * Created by IntelliJ IDEA.
 * InterfaceLaba.Square
 *
 * @Autor: vovamv
 * @DateTime: 10/21/20|6:43 пп
 * @Version Square: 1.0
 */

public class Square implements ISquare{
    double side;


    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    @XmlAttribute(name = "side")
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getDiagonal() {
        return this.getSide()*Math.sqrt(2);
    }

    @Override
    public double getRadiusOfCircumscribedCircle() {
        return this.getDiagonal()/2;
    }

    @Override
    public double getRadiusOfInscribedCircle() {
        return this.getSide()/(double)2;
    }

    @Override
    public void drawSquare() throws InterruptedException {
        System.out.print(" ");
        for (int i = 0; i < this.getSide(); i++) {
            Thread.sleep(500);
            System.out.print(" — ");
        }
        System.out.println("");
        for (int j = (int) (this.getSide()-1); j >=0; j--) {
            Thread.sleep(500);
            System.out.print("ǀ");
            for (int k = 0; k < this.getSide(); k++) {
                System.out.print("   ");
            }
            System.out.println("ǀ");
        }
        System.out.print(" ");
        for (int i = 0; i < this.getSide(); i++) {
            Thread.sleep(500);
            System.out.print(" — ");
        }
        System.out.println();
    }

    @Override
    public void getSquareInfo() {
        System.out.println(this.toString() +
                "\n Периметр=" + this.getPerimeter() +
                "\n Площа=" + this.getArea() +
                "\n Діагональ=" + this.getDiagonal() +
                "\n Радіус вписаного кола=" + this.getRadiusOfInscribedCircle() +
                "\n Радіус описаного кола=" + this.getRadiusOfCircumscribedCircle()
        );
        System.out.println();
    }

    @Override
    public double getArea() {
        return Math.pow(this.getSide(),2);
    }

    @Override
    public double getPerimeter() {
        return this.getSide() * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public String toJSON() {
        Gson gson = new Gson();
        String JSON = gson.toJson(this);

        return "JSON: \n" + JSON + "\n";
    }

    @Override
    public String toXML() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        XMLEncoder xmlEncoder = new XMLEncoder(baos);
        xmlEncoder.writeObject(this);
        xmlEncoder.close();

        String xml = baos.toString();
        return "XML: \n" + xml + "\n";
    }
}
