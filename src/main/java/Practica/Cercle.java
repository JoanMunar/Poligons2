package Practica;

public class Cercle extends Figura{
    private int diametre;
    private int arc_inicial = 0;
    private int arc_final = 360;
    private boolean relleno;

    public int getDiametre() {
        return diametre;
    }

    public int getArc_final() {
        return arc_final;
    }

    public int getArc_inicial() {
        return arc_inicial;
    }

    public boolean isRelleno() {
        return relleno;
    }

    @Override
    void llegir() {
        super.llegir();

        System.out.print("De quin tamany vols el cercle --> ");
        diametre = sc.nextInt();
        System.out.println("Relleno? S/N");
        relleno = sc.next().equals("S");
    }
}
