package Practica;

public class Text extends Figura{
    private String text;

    public String getText() {
        return text;
    }

    @Override
    void llegir() {
        super.llegir();

        System.out.print("Introdueix un text --> ");
        text = sc.next();
    }
}
