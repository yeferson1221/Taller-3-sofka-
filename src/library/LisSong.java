package library;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author  Jose Daniel Maza - josedmaza21@gmail.com
 * @version 1.1.0
 * @since   2022-01-09
 * Clase que representa un bilioteca de musica
 */
public  class Library implements FilterMelodi{
    /**
     * @author  Yeferson Valencia - alejandro.yandd@gmail.com
     *se cambian las modificadores de acceso de privados a protegidos
     */

    
    /**
     * Constructor por defecto de la clase Library
     */
    public Library() {
        this.title = "";
        this.ID = 0;
        this.date = new Date();
        this.length = 0;
        this.genre = "";
        this.coverPage = "";
        this.description = "";
        this.age="";
    }

    /**
     * Metodo constructor con parametros de la clase Library
     * @param title
     * @param ID
     * @param agno
     * @param mes
     * @param dia
     * @param length
     * @param genre
     * @param coverPage
     * @param description
     */



    ArrayList<Song> lisSong = new ArrayList();
    Scanner in = new Scanner(System.in);




    public void addSoung() {
        System.out.println("ingresar nombre de la cancion");
        String title=in.nextLine();
        System.out.println("ingresar nombre de la artista");
        String coverPage=in.nextLine();
        System.out.println("ingresar de año");
        int age=in.nextInt();
        Song song = new Song();
        song.setTitle(title);
        song.coverPage(coverPage);
        song.age(age);
        lisSong.add(song);
    }



    public void getToList(){
        Soung higher = new Soung();
        for (int i = 0; i < lisSong.size(); i++) {
            for (int j = i+1; j < lisSong.size(); j++) {
                if (lisSong.get(i).getAge() > lisSong.get(j).getAge()) {
                    higher = lisSong.get(i);
                    lisSong.set(i, lisSong.get(j));
                    lisSong.set(j, higher);
                }
            }

        }

        for (Soung num: lisSong) {
            System.out.println(num.getName() + " " + num.getAge());
        }
    }

    public void getSoung() {

        for (int i = 0; i < lisSong.size(); i++) {
            System.out.println("[Numero: ]"+(+i+1));
            System.out.println("[NOMBRE: ]"+lisSong.get(i).getName());
            System.out.println("[artista: ]"+lisSong.get(i).getGenero());
            System.out.println("[año: ]"+lisSong.get(i).getAge());
        }

    }
    public void clearListSoung(){
        lisSong.clear();
    }

    /**
     * @author  Yeferson Valencia - alejandro.yandd@gmail.com
     * se eliminan los getter y setter
     */


    /**
     * [filtra canciones por año.
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
     * @author [Yeferson Valencia ,alejandro.yandd@gmail.com
     *
     */
    @Override
    public void filterAge() {

    }

    /**
     * [filtra canciones por genero.
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
     * @author [Yeferson Valencia ,alejandro.yandd@gmail.com
     *
     */
    @Override
    public void filterGender() {

    }

    /**
     * [filtra canciones por duracion de la canción.
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
     * @author [Yeferson Valencia ,alejandro.yandd@gmail.com
     *
     */
    @Override
    public void orderDuration() {

    }

    /**
     * [filtra canciones por fecha.
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
     * @author [Yeferson Valencia ,alejandro.yandd@gmail.com
     *
     */
    @Override
    public void orderDate() {

    }

    /**
     * [guardar el listado de todas las canciónes.
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
     * @author [Yeferson Valencia ,alejandro.yandd@gmail.com
     *
     */
    public void lisMelody(){

    }

    /**
     * [listado canciónes favoritas.
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
     * @author [Yeferson Valencia ,alejandro.yandd@gmail.com
     *
     */
    public void LisMelodyFavorite(){

    }
}
