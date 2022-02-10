package library;

import java.util.Scanner;

public class Pop extends Library {

    private String genre;

    //constructor por defecto
    public Pop(){
        super();
        this.genre = "Pop";
    }

    @Override
    public String toString(){
        return "Titulo: " + title + "\n" + "Duracion: " + length + "\n" + "Descripcion: " + description + "\n" + "Portada: " + coverPage + "\n" + "Genero: " + genre + "\n";
    }
}
