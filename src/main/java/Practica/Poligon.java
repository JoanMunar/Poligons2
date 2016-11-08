package Practica;

public class Poligon extends Figura{
    private int num_costats;
    private int[] coordX;
    private int[] coordY;
    private boolean relleno;

    public int[] getCoordX() {
        return coordX;
    }

    public int[] getCoordY() {
        return coordY;
    }

    public int getNum_costats() {
        return num_costats;
    }

    public boolean isRelleno() {
        return relleno;
    }

    @Override
    void llegir() {
        super.llegir();

        System.out.print("Numero de costats --> ");
        num_costats = sc.nextInt();

        coordX = new int[num_costats];
        coordY = new int[num_costats];


        for (int i = 0; i < coordX.length; i++) {

            System.out.println("Coordenades de X -->");

            coordX[i] = sc.nextInt();

            System.out.println("Coordenades de Y -->");

            coordY[i] = sc.nextInt();

        }

        System.out.println("Relleno? S/n");
        relleno = sc.next().equals("S");

    }
}
