/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_9_lectura_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author Villarreal Calderon Sebastina
 */
public class EVA3_9_LECTURA_ARCHIVOS {

    public static void main(String[] args) {
        String ruta ="D:\\archivos\\prueba.txt";
        try {
            readUsingFiles(ruta);
            readUsingScanner(ruta);
            readUsingBufferedReader(ruta);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    /*   FILES LEE TODO EL ARCHIVO Y LO ENVIA COMO UN STRING */
    public static void readUsingFiles(String ruta) throws IOException{
        System.out.println("LECTURA DEL ARCHVIOS USADNO FILES");
        Path path = Paths.get(ruta);
        String cade = Files.readString(path);
        System.out.println(cade);
    }
    /*  LEE EL ARCHIVO POR LINEA */
    public static void readUsingScanner(String ruta) throws FileNotFoundException{
            System.out.println("lECTURA CON SCANNER");
            File source = new File(ruta);
            Scanner scanner = new Scanner(source);
            String cade;
            int cont =1;
            while(scanner.hasNextLine()){ // si no hya una nextline se llego al fin del archivo 
            cade = cont + "-" + scanner.nextLine();
            cont++;
                System.out.println(cade);
            }
            scanner.close();
}
    
    public static void readUsingBufferedReader(String ruta) throws FileNotFoundException, IOException{
        System.out.println("LECTURA USANDO BUFERRED READER");
        File source = new File(ruta);
        FileInputStream fis = new FileInputStream(source);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String cade;
        while((cade=br.readLine())!=null){
            System.out.println(cade);
    }
        br.close();
    }
}



