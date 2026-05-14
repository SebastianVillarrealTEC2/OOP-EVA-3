/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_11_archivos_objetos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Villarreal Calderon Sebastian
 */
public class EVA3_11_ARCHIVOS_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            String ruta ="D:\\archivos\\archivoObjetos.dat";
            writeObject(ruta);
            readObject(ruta);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }
    public static void writeObject(String ruta) throws FileNotFoundException, IOException{
        System.out.println("ESCRITURA DE OBJETOS USANDO OBJECTOUTPUTSTREAM");
         File source = new File (ruta);
        FileOutputStream fos = new FileOutputStream(ruta);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Persona("Juan", "Perez", 50));
        oos.writeObject(new Persona("Pedro", "Paramo", 45));
        oos.writeObject(new Persona("Ana", "Gomez", 20));
        
        oos.close();
        System.out.println("Guardado");
    }
    
    public static void readObject(String ruta) throws FileNotFoundException, IOException, ClassNotFoundException{
        System.out.println("ESCRITURA DE OBJETOS USANDO ObjectInputStream");
        File source = new File (ruta);
        FileInputStream fis = new FileInputStream(source);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            while(true){
                Persona perso = (Persona) ois.readObject();
                System.out.println("Nombre: " + perso.getNombre());
                System.out.println("Apellidos: " + perso.getApellidos());
                System.out.println("Edad: " + perso.getEdad());
                //para controlar la lectura, se debe capturar la expcecion 
        }
        } catch (EOFException e) {
        System.out.println("Fin archivo");
    }
        ois.close();
}
    }

class Persona implements Serializable{
        private String nombre;
        private String apellidos;
        private int edad;
        
        public Persona() {
            this.nombre = "";
            this.apellidos = "";
            this.edad = 0;
        }

        public Persona(String nombre, String apellidos, int edad) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
        
        
    }

