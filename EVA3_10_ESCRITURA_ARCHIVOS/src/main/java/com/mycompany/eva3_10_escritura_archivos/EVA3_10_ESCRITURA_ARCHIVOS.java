/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_10_escritura_archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import static java.lang.System.out;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Villarreal Calderon Sebastian
 */
public class EVA3_10_ESCRITURA_ARCHIVOS {

    public static void main(String[] args) throws IOException {
        String ruta ="D:\\archivos\\";
        try {
            writeUsingFiles(ruta," MENSAJE DE PRUEBA USANDO FILES");
            writeUsingBufferedReader(ruta, "MENSAJE DE TEXTO USANDO BUFFERED");
            writeUsingFileWriter(ruta, "mENSAJE DE TEXTO USANDO FileWriter");
        }catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public static void writeUsingFiles(String ruta, String texto) throws IOException{
     System.out.println("ESCRITURA DEL ARCHVIOS USADNO FILES");
       Path path = Paths.get(ruta + "archivoFiles.txt");
     Files.write(path, texto.getBytes());
        }
    
    public static void writeUsingBufferedReader(String ruta, String texto) throws IOException{
        System.out.println("ESCRITURA DEL ARCHIVO USANDO BUFFER");
        
        File source = new File (ruta+"archivoBuffered.txt");
        FileOutputStream fos= new FileOutputStream(source);
        OutputStreamWriter osw= new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write(texto);
        bw.newLine();
        bw.write(texto);
        bw.close();
        
    }
    
   public static void writeUsingFileWriter(String ruta, String texto) throws IOException{
       System.out.println("ESCRITURA USANDO FileWriter");
       File source = new File(ruta + "archivoFileWriter.txt");
       FileWriter fileWriter =new FileWriter(source);
       fileWriter.write(texto);
       fileWriter.close();
       
       
   }
}
