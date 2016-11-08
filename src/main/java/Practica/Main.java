package Practica;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 * Created by jmunarb on 06/10/16.
 */
public class Main {
    static String resposta = "";
    static Scanner sc = new Scanner(System.in);
    static Figura figura;
    static List<Figura> hist = new ArrayList<Figura>();
    static ApplicationContext injector = new ClassPathXmlApplicationContext(
            "Config-spring.xml");

    public static void main(String[] args) {
        /**Obrim menu**/
            menu();
    }

    public static void menu(){

        System.out.println("Quina figura vols dibuixar? (escull una lletra)\n" +
                "A. Text\n" +
                "B. Punt\n" +
                "C. Línia\n" +
                "D. Cercle\n" +
                "E. Quadrat\n" +
                "F. Rectangle\n" +
                "G. Polígon\n" +
                "H. Dibuixar l’històric de figures.\n" +
                "I. Sortir\n" +
                "\n" +
                "Resposta:");

        resposta = sc.nextLine();

        /**Diferents respostes**/
        if(resposta.equals("A")) {

            figura = (Text) injector.getBean("text");
            figura.llegir();
            hist.add(figura);
            cridarFinestra();


        } else if(resposta.equals("B")){

            figura = (Punt) injector.getBean("punt");
            figura.llegir();
            hist.add(figura);
            cridarFinestra();

        } else if(resposta.equals("C")){

            figura = (Linia) injector.getBean("linia");
            figura.llegir();
            hist.add(figura);
            cridarFinestra();

        } else if(resposta.equals("D")) {

            figura = (Cercle) injector.getBean("cercle");
            figura.llegir();
            hist.add(figura);
            cridarFinestra();

        } else if(resposta.equals("E")){

            figura = (Cuadrat) injector.getBean("cuadrat");
            figura.llegir();
            hist.add(figura);
            cridarFinestra();

        } else if(resposta.equals("F")){

            figura = (Rectangle) injector.getBean("rectangle");
            figura.llegir();
            hist.add(figura);
            cridarFinestra();

        } else if(resposta.equals("G")){

            figura = (Poligon) injector.getBean("poligon");
            figura.llegir();
            hist.add(figura);
            cridarFinestra();

        }else if(resposta.equals("H")){

            cridarFinestra();

        }else if(resposta.equals("I")){

            return;
        }

        menu();

    }

    public static void  cridarFinestra(){
        /**Cridam la finestra**/
        EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {
                    Finestra frame = new Finestra();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

    }

}
