package library;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Reggaeton extends Library{

    private String genre;

    //constructor por defecto
    public Reggaeton(){
        super();
        this.genre = "";
    }




    @Override
    public String toString(){
        return "Titulo: " + title + "\n" + "Duracion: " + length + "\n" + "Descripcion: " + description + "\n" + "Portada: " + coverPage + "\n" + "Genero: " + genre + "\n";
    }
}
