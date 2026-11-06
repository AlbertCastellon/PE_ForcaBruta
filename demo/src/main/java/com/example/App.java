package com.example;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;


public class App {
    public static void main(String[] args) {

        String ruta = "C:\\Users\\litus\\programacion\\GS\\DAM2\\PSP\\PE_ForcaBruta\\demo\\src\\main\\java\\com\\example\\CAIXA_FORTA.pdf";
        String password = "0042";

        try (PDDocument document = Loader.loadPDF(new File(ruta), password)) {

            System.out.println("PDF obert correctament!");
            System.out.println("Nombre de pàgines: " + document.getNumberOfPages());

        } catch (IOException e) {

            System.out.println("No s'ha pogut obrir el PDF.");
            System.out.println("Motiu: " + e.getMessage());

        } 
    }
}
