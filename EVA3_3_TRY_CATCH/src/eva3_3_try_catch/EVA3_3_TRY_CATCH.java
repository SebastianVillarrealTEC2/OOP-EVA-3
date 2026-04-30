/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_try_catch;

/**
 *
 * @author sebastian villarreal calderon
 */
public class EVA3_3_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=100, y=0, resu=0;
        try {//es el codigo que se INTENTA ejecutar, pero se puede generar una excepcion 
        resu= x/y;//este cpdigo genera la excepcion
            System.out.println("esto nunca se ejecuta");
            //mas instrucciones pero no se ejecutan si hay una excepcion
            
        } catch(ArithmeticException e/*=mierror*/){
            //QUE HECEMOS CON LA EXCEPCION
            
            //NADA IMPIDE QUE VUELVA A GENERAR UNA EXCEPCION AQUI
            
            //e.printStackTrace();  IMPRIME EL ERROR
            System.out.println("ERROR:DIVISON ENTRE CERO");
        }
        System.out.println("resu"+resu);
    }
    
}
