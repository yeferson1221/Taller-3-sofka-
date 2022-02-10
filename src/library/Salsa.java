package library;

import java.util.Scanner;

public class Salsa extends Library {

    private String genre;

    //constructor por defecto
    public Salsa(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el titulo de la cancion: ");
        title = sc.nextLine();

        this.ID = ID;

        System.out.println("Ingrese la duracion de la cancion: ");
        length = sc.nextInt();

        System.out.println("Ingrese la descripcion de la cancion : ");
        description = sc.next();

        System.out.println("Ingrese la portada de la cancion: ");
        coverPage = sc.next();
        genre = "Salsa";

    }

    @Override
    public String toString(){
        return "Titulo: " + title + "\n" + "Duracion: " + length + "\n" + "Descripcion: " + description + "\n" + "Portada: " + coverPage + "\n" + "Genero: " + genre + "\n";
    }
}
