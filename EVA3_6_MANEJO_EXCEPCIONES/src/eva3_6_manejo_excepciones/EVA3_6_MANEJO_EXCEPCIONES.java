/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_6_manejo_excepciones;

import java.util.Scanner;

/**
 *
 * @author Sebastain Villarreal Calderon
 */
public class EVA3_6_MANEJO_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner captu = new Scanner(System.in);
        int x, y, resu = 0;
        boolean bando = false;

        System.out.println("Valor de X: ");
        x = captu.nextInt();

        while (true) {
            System.out.println("Valor de Y: ");
            y = captu.nextInt();
            captu.nextLine(); 

            try {
                resu = x / y;
                bando = true;
            } catch (ArithmeticException e) {
                System.out.println("El valor de la Y no puede ser 0.");
                bando = false;
            }

            if (bando) {
                break;
            }
        }

        System.out.println(x + " / " + y + " = " + resu);
    }
    }

