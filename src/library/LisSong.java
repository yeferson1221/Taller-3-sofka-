package library;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * [Esta es la clase abstracta que contiene los metodos logicos para lograr el listado por año
 * fecha,duracion,listar canciones favoritas o elegidas por el uduario, tambien contiene los metodos
 * tradios de la interface FilterMelodi y los metodos para agregar canciones e imprimirlas
 *
 * @version [I
 *           ej: 1.04.05 2022-02-12,
 *
 * @author [Yeferson Valencia, alejandro.yandd@gmail.com]
 */
public abstract class LisSong implements FilterMelodi {

    ArrayList<Song> lisSong = new ArrayList();
    Scanner sc = new Scanner(System.in);





/**
 * [ingresa los datos tales como nombre, cantante,tiempo de duracion,
 * año, fecha, caratula y texto de las canciones por consola
 *
 *...;
 *   clase.unaLogicaDeNegocioDeterminada(valor1, valor2);
 *   ValorDeRespuesta valor = clase.execute();
 * ]
 * @throws Exception
 *
 * @author [Yeferson Valencia, alejandro.yandd@gmail.com
 *            ej: Fulano DeTal – fulano.detal@swissmedical.com.ar]
 */
    public void addSong() {
        Song song = new Song();

        System.out.println("Ingresar nombre de la cancion");
        song.setName(sc.nextLine());

        System.out.println("Ingresar nombre del artista");
        song.setSinger(sc.nextLine());

        System.out.println("Ingresar duracion de la cancion");
        song.setSongDuration(sc.nextLine());

        System.out.println("Ingresar fecha de la cancion");
        song.setDate(sc.nextLine());


        System.out.println("Ingresar año de la cancion");
        song.setAge(sc.nextInt());

        System.out.println("Ingresar portada de la cancion");
        song.setCoverPage(sc.nextLine());

        System.out.println("Ingresar descripcion de la cancion");
        song.setDescription(sc.nextLine());

        lisSong.add(song);
    }

    /**
     * [metodo getTolist nos permite filtrar las canciones por año donde se ubican de mayor a menor esta
     * es un arrayList que se esta comparando con esta misma pero en  difetente indice
     * para poder cambir de posicion hasta ordenar todo el listado
     * incorpore indicaciones de uso del mismo para facilitar su compresión.

     *   clase.unaLogicaDeNegocioDeterminada(valor1, valor2);
     *   ValorDeRespuesta valor = clase.execute();
     * ]
     *
     * @param lisSong
     * @param hegher
     * @author [Yeferson Valencia, alejandro.yandd@gmail.com
     *
     * @since [1.0.0]
     *
     */
    @Override
    public void getToList(){
        Song higher = new Song();
        for (int i = 0; i < lisSong.size(); i++) {
            for (int j = i+1; j < lisSong.size(); j++) {
                if (lisSong.get(i).getAge() > lisSong.get(j).getAge()) {
                    higher = lisSong.get(i);
                    lisSong.set(i, lisSong.get(j));
                    lisSong.set(j, higher);
                }
            }

        }

        for (Song num: lisSong) {
            System.out.println(":::::::::::::::::::::::::::::::::");
            System.out.println("Cancion: "+num.getName() + " El año" + num.getAge());
        }
    }

    /**
     * [metodo getSong nos permite imprimir el listado de canciones agregadas del usuario
     *
     * incorpore indicaciones de uso del mismo para facilitar su compresión.
     * ej.:
     *
     *   ...;
     *   clase.unaLogicaDeNegocioDeterminada(valor1, valor2);
     *   ValorDeRespuesta valor = clase.execute();
     * ]
     *
     * @param arg
     * @param arg2
     * @return
     * @throws Exception
     *
     * @author [Yeferson Valencia, apellido y correo electrónico del autor.
     *
     * @since [1.0.0]
     *
     */
    @Override
    public void getSong() {

        for (int i = 0; i < lisSong.size(); i++) {
            System.out.println("Numero: "+ (+i+1));
            System.out.println("Titulo: "+ lisSong.get(i).getName());
            System.out.println("Artista: "+ lisSong.get(i).getSinger());
            System.out.println("Fecha: "+ lisSong.get(i).getDate());
            System.out.println("Año: "+ lisSong.get(i).getAge());
            System.out.println("Duracion: "+ lisSong.get(i).getSongDuration() + " minutos");
            System.out.println("Portada: "+ lisSong.get(i).getCoverPage() + ".jpg");
            System.out.println("Descripcion: "+ lisSong.get(i).getDescription() + "\n");
        }
    }

    /**
     * [Permite crear el listado de canciones que el usuario quiera agregar

     *   clase.unaLogicaDeNegocioDeterminada(valor1, valor2);
     *   ValorDeRespuesta valor = clase.execute();
     * ]
     *
     * @param lisSong
     * @param hegher
     * @author [Yeferson Valencia, apellido y correo electrónico del autor.
     *
     * @since [1.0.0]
     *
     */
    public void getSongFavorite(){
        int numberSong;
        for(int i = 0; i < lisSong.size(); i++){
            System.out.println("ingresar numero de cancion: ");
            numberSong = sc.nextInt()-1;
            System.out.println("Numero: "+ (numberSong));
            System.out.println("Titulo: "+ lisSong.get(numberSong).getName());
            System.out.println("Artista: "+ lisSong.get(numberSong).getSinger());
            System.out.println("Fecha: "+ lisSong.get(numberSong).getDate());
            System.out.println("Año: "+ lisSong.get(numberSong).getAge());
            System.out.println("Duracion: "+ lisSong.get(numberSong).getSongDuration() + " minutos");
            System.out.println("Portada: "+ lisSong.get(numberSong).getCoverPage() + ".jpg");
            System.out.println("Descripcion: "+ lisSong.get(numberSong).getDescription() + "\n");
        }
    }

    /**
     * [Permite eliminar el listado de canciones agregadas

     *   clase.unaLogicaDeNegocioDeterminada(valor1, valor2);
     *   ValorDeRespuesta valor = clase.execute();
     * ]
     *
     * @param lisSong
     * @param hegher
     * @author [Yeferson Valencia, apellido y correo electrónico del autor.
     *
     * @since [1.0.0]
     *
     */
    @Override
    public void clearListSong(){
        lisSong.clear();
    }



    public void filterByDate(){
        System.out.println("Ingresar fecha de la cancion");
        String date = sc.nextLine();
        for (int i = 0; i < lisSong.size(); i++) {
            if (lisSong.get(i).getDate().equals(date)) {
                System.out.println("Numero: "+ (+i+1));
                System.out.println("Titulo: "+ lisSong.get(i).getName());
                System.out.println("Artista: "+ lisSong.get(i).getSinger());
                System.out.println("Fecha: "+ lisSong.get(i).getDate());
                System.out.println("Año: "+ lisSong.get(i).getAge());
                System.out.println("Duracion: "+ lisSong.get(i).getSongDuration() + " minutos");
                System.out.println("Portada: "+ lisSong.get(i).getCoverPage() + ".jpg");
                System.out.println("Descripcion: "+ lisSong.get(i).getDescription() + "\n");
            }
        }
    }

    public void filterByDuration(){
        System.out.println("Ingresar duracion de la cancion");
        String duration = sc.nextLine();
        for (int i = 0; i < lisSong.size(); i++) {
            if (lisSong.get(i).getSongDuration().equals(duration) ) {
                System.out.println("Numero: "+ (+i+1));
                System.out.println("Titulo: "+ lisSong.get(i).getName());
                System.out.println("Artista: "+ lisSong.get(i).getSinger());
                System.out.println("Fecha: "+ lisSong.get(i).getDate());
                System.out.println("Año: "+ lisSong.get(i).getAge());
                System.out.println("Duracion: "+ lisSong.get(i).getSongDuration() + " minutos");
                System.out.println("Portada: "+ lisSong.get(i).getCoverPage() + ".jpg");
                System.out.println("Descripcion: "+ lisSong.get(i).getDescription() + "\n");
            }
        }
    }

}