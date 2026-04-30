/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_1_excepciones_unchecked;

/**
 *
 * @author Sebastian Villarreal Calderon
 */
public class EVA3_1_EXCEPCIONES_UNCHECKED {

    public static void main(String[] args) {
        //CHECKED--- LOS VEREMONS EN MANEJO DE ARCHIVOS
        //UNCHEKED-- ERRROES LOGICOS, PREVENIBLES CON BUENAS PRACTICTICAS
        //ARITMETIC-- DISION ENTRE CERO
        
        /*
        int x=100, y=0, resu;
        resu= x / y;
        System.out.println("Resu x/y"+ resu);
        */
        
        // si se produce uyna excepcion no nos deja avanzar desde ahi
        
        //ARRAY INDEXOUTOFBOUNDSEXCEPTION
        int[] arreglo = new int[5];
         System.out.println(arreglo[6]);
         
         
    }
}
