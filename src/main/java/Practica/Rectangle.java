package Practica;

public class Rectangle extends Figura{
    private int base;
    private int altura;
    private boolean relleno;

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

    public boolean isRelleno() {
        return relleno;
    }

    @Override
    void llegir() {
        super.llegir();

        System.out.print("Base --> ");
        base = sc.nextInt();
        System.out.println("Altura -->");
        altura = sc.nextInt();
        System.out.println("Relleno? S/n");
        relleno = sc.next().equals("S");

    }
}
