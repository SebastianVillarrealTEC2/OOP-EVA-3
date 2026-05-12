/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_custom_exception;

import java.util.logging.Logger;

/**
 *
 * @author Sebastian Villarreal Calderon
 */
public class EVA3_8_CUSTOM_EXCEPTION {

    public static void main(String[] args) {
        try {
            // throw new MiExcepcion("Excepcion personalizada");
            throw new MicheckedException("Excepcion personalizada!!!");
        } catch (MicheckedException ex){
           Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}

class MiExcepcion extends RuntimeException{
    public MiExcepcion(String message) {
        super(message);
    }
}

class MicheckedException extends Exception{
    public MicheckedException(String message) {
        super(message);
    }
}
