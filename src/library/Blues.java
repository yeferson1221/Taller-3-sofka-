package library;

import java.util.Scanner;

public class Blues extends Library{

    private String genre;

    //constructor por defecto
    public Blues(){
        super();
        this.genre = "Blues";
    }

    @Override
    public String toString(){
        return "Titulo: " + title + "\n" + "Duracion: " + length + "\n" + "Descripcion: " + description + "\n" + "Portada: " + coverPage + "\n" + "Genero: " + genre + "\n";
    }
}
