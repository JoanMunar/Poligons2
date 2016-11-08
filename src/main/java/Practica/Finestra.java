package Practica;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Finestra extends JFrame {
    private JPanel contentPane;

    public Finestra() {

        /**Crear finestra**/
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setBounds(0,0,800,600);
    }

    public void paint (Graphics g){
        super.paint(g);
        /**Historial**/
        if(Main.resposta.equals("H")) {
            for(int i = 0; i < Main.hist.size(); i++) {
                Main.figura = Main.hist.get(i);
                ferFigura(g);
            }

        } else {

            ferFigura(g);
        }

    }

    void ferFigura(Graphics g) {

        /**Obtenir color**/
        g.setColor(Main.figura.getC().color);

            /**Text**/
        if(Main.figura instanceof Text) {
            Text t = (Text) Main.figura;

            g.drawString(t.getText() ,t.getPosX(), t.getPosY());

            /**Linia**/
        } else if(Main.figura instanceof  Linia){

            Linia l = (Linia) Main.figura;

            g.drawLine(l.getPosX(), l.getPosY(), l.getPosX_final(), l.getPosY_final());

            /**Cuadrat**/
        } else if(Main.figura instanceof Cuadrat){

            Cuadrat c = (Cuadrat) Main.figura;

            if(c.isRelleno()){

                g.fillRect(c.getPosX(), c.getPosY(), c.getCostat(), c.getCostat());

            }else{

                g.drawRect(c.getPosX(),c.getPosY(),c.getCostat(),c.getCostat());

            }
            /**Punt**/
        } else if(Main.figura instanceof Punt){

            Punt p = (Punt) Main.figura;

            g.drawString(p.getPunt(),p.getPosX(),p.getPosY());


            /**Cercle**/
        } else if(Main.figura instanceof Cercle){

            Cercle c = (Cercle) Main.figura;

            if(c.isRelleno()){

                g.fillArc(c.getPosX(), c.getPosY(), c.getDiametre(), c.getDiametre(), c.getArc_inicial(), c.getArc_final());

            }else {

                g.drawArc(c.getPosX(), c.getPosY(), c.getDiametre(), c.getDiametre(), c.getArc_inicial(), c.getArc_final());
            }

            /**Rectangle**/
        } else if (Main.figura instanceof Rectangle){

            Rectangle r = (Rectangle) Main.figura;

            if(r.isRelleno()){

                g.fillRect(r.getPosX(), r.getPosY(), r.getBase(), r.getAltura());

            }else{

                g.drawRect(r.getPosX(), r.getPosY(), r.getBase(), r.getAltura());

            }

            /**Poligon**/

        }else if(Main.figura instanceof Poligon){

            Poligon p = (Poligon) Main.figura;

            if(p.isRelleno()){

                g.fillPolygon(p.getCoordX(),p.getCoordY(),p.getNum_costats());

            }else{

                g.drawPolygon(p.getCoordX(),p.getCoordY(),p.getNum_costats());

            }

        }
    }
}
