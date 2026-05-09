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
        
    Scanner teclado = new Scanner(System.in);
        int x, y, resu = 0; 

        System.out.println("Inserta el valor de x");
        x = teclado.nextInt();
        
        System.out.println("Inserta el valor de y");
        y = teclado.nextInt();

        try {
            resu = x / y;
            System.out.println("X = " + x);
            System.out.println("Y = " + y);
            System.out.println("Resultado = " + resu);
        } catch (ArithmeticException e) {
            System.out.println("El valor de la Y no puede ser 0.");
        }
    

}
    }

