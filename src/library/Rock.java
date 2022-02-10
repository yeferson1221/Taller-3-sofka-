package library;

import java.util.Scanner;

public class Rock extends Library{

    private String genre;

    //constructor por defecto
    public Rock(){
        super();
        this.genre = "Rock";
    }

    @Override
    public String toString(){
        return "Titulo: " + title + "\n" + "Duracion: " + length + "\n" + "Descripcion: " + description + "\n" + "Portada: " + coverPage + "\n" + "Genero: " + genre + "\n";
    }
}
