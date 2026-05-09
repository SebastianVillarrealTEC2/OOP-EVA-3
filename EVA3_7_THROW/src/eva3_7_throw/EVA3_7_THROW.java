/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_7_throw;

/**
 *
 * @author Sebastina Villarreal Calderon
 */
public class EVA3_7_THROW {

    public static void main(String[] args) {
       try {
            // El error viene de pasar mal los datos aquí es donde debe corregirse
            System.out.println("Resultado = " + division(10, 0));
        } catch (Exception ex) {
            // que hacemos para corregir el error
            ex.printStackTrace();
        }
    }

    // Throws es principalmente para excepciones de tipo checked
    public static int division(int x, int y) throws Exception {
        int resu = 0;

        if (y == 0) { 
            // EL ERROR NO SE CORRIGE AQUÍ, SINO EN LA LLAMADA A DIVISION
            // Throw nos permite lanzar una excepción de cualquier clase
            throw new Exception("El divisor no puede ser cero");
        }

        resu = x / y;
        return resu;
    }
    
}
