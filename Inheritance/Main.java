package org.meicode.Inheritance;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        Bird pheonix = new Bird("Nina","Golden",2,true,2);
        System.out.println(pheonix.getName());
        pheonix.eat("Meat");

        System.out.println(pheonix.getWings());
        pheonix.fly();

        pheonix.eat("Meat");
    }
}