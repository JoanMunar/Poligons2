package Practica;

public class Cuadrat extends Figura{
    private int costat;
    private boolean relleno;

    public int getCostat() {
        return costat;
    }

    public boolean isRelleno() {
        return relleno;
    }

    @Override
    void llegir() {
        super.llegir();

        System.out.print("Costat --> ");
        costat = sc.nextInt();
        System.out.println("Relleno? S/n");
        relleno = sc.next().equals("S");

    }
}
