package Practica;

public class Linia extends Figura{

    private int posX_final;
    private int posY_final;

    public int getPosX_final() {
        return posX_final;
    }

    public int getPosY_final() {
        return posY_final;
    }

    @Override
    void llegir() {
        super.llegir();

        System.out.print("Posx_final --> ");
        posX_final = sc.nextInt();
        System.out.print("Posy_final --> ");
        posY_final = sc.nextInt();
    }
}
