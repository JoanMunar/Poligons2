package Practica;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by jmunarb on 11/10/16.
 */
public class atColor {
    Color color;
    public atColor(){

        Scanner sc = new Scanner(System.in);

        System.out.println("De quin color ha de ser?\n" +
                "A. Cian\n" +
                "B. Negre\n" +
                "C. Vermell\n" +
                "D. Blau\n" +
                "E. Groc\n" +
                "F. Taronja\n" +
                "G. Magenta\n" +
                "H. Verd");

       color = getColor(sc.nextLine());


    }

    public static Color getColor(String nomColor){

        if(nomColor.equals("A")){

            return Color.cyan;

        } else if( nomColor.equals("B")){

            return Color.black;

        }else if( nomColor.equals("C")){

            return Color.red;

        }else if( nomColor.equals("D")){

            return Color.blue;

        }else if( nomColor.equals("E")){

            return Color.yellow;

        }else if( nomColor.equals("F")){

            return Color.orange;

        }else if( nomColor.equals("G")){

            return Color.magenta;

        }else if( nomColor.equals("H")){

            return Color.green;

        } else {

            return Color.black;

        }

    }
}
