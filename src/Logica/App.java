/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Edwin Lopez
 */
public class App {
    
    public static boolean isAppRunning() {
        File tempFile = new File("app.temp");
        return tempFile.exists();
    }

    public static void createTempFile() {
        try {
            File tempFile = new File("app.temp");
            tempFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void deleteTempFile(){
        File tempFile = new File("app.temp");
        tempFile.delete();
    }
}
