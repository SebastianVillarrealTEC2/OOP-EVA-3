/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_4_try_catch;

/**
 *
 * @author invitado
 */
public class EVA3_4_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x= 10, y=0, resu=0;
        String cade=null;
        
        try{
            resu= x/y;
            System.out.println("Terminamos progrma");
            System.out.println(cade.length());
            System.out.println("Terminas la operacion con la cadena");
        } /*catch(Exception e){ //ESTA CAPTURA TODO
            e.printStackTrace();
        }*/
        
        catch(ArithmeticException e){
           e.printStackTrace();
        } catch(NullPointerExceptioin e){
            e.printStackTrace();
        }
         
        
        System.out.println("FIN PROGM");
    
}
