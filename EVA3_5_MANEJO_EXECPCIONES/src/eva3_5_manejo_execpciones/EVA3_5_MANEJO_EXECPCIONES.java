/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_5_manejo_execpciones;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_5_MANEJO_EXECPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //el usuario debe teclear los valores de x y Y, imprimir resultado
        
        Scanner teclado = new Scanner(System.in);

        int x, y, resu;

        System.out.println("Inserta el valor de x");
        x = teclado.nextInt();

        System.out.println("Inserta el valor de y");
        y = teclado.nextInt();

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        
        
        //solucion si se lo pedimos al usuario
        if (y != 0) {
            resu = x / y;
            System.out.println("Divison= " + resu);
        } else {
            System.out.println("No se permite dividir entre cero");
        }
       
    }
        
        
        
        
    }
    

