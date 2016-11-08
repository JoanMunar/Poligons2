package Practica;

import java.util.Scanner;

public class Figura implements Cloneable {

    protected Scanner sc = new Scanner(System.in);
    private int posX;
    private int posY;
    private atColor c;

    public int getPosX() {

        return posX;
    }

    public int getPosY() {
        
        return posY;
    }

    public atColor getC() {

        return c;
    }

    void llegir() {
        c = new atColor();

        sc.useDelimiter(System.getProperty("line.separator"));

        System.out.print("PosX --> ");
        posX = sc.nextInt();
        System.out.print("PosY --> ");
        posY = sc.nextInt();

    }

}
