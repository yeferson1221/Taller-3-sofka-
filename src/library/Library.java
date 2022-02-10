package library;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author  Jose Daniel Maza - josedmaza21@gmail.com
 * @version 1.1.0
 * @since   2022-01-09
 * Clase que representa un bilioteca de musica
 */
public abstract class Library implements FilterMelodi{
    /**
     * @author  Yeferson Valencia - alejandro.yandd@gmail.com
     *se cambian las modificadores de acceso de privados a protegidos
     */
    protected String title;
    protected int ID;
    protected Date date;
    protected int length;
    protected String genre;
    protected String coverPage;
    protected String description;
    
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
    public Library(String title, int ID, int agno, int mes, int dia, int length, String coverPage, String description) {

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
