package library;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * [Detalle el objetivo de la clase.
 *
 * incorpore indicaciones de uso de la clase para facilitar su compresión.
 * ej.:
 *
 *   EstaClase Main = new EstaClase(arg, arg1, ..., argN);
 *   clase.setUnaPropiedad(valor);
 *   ValorDeRespuesta valor = clase.execute();
 * ]
 *
 * @version [Ingrese el número de versión con el siguiente formato: VS.CM.cm AAAA-mm-dd
 *           "VS" indica la versión actual del sistema,
 *           "CM" indica un refactoring de la clase,
 *           "cm" indica un cambio menor en alguna sección de la misma
 *
 *           ej: 4.02.003 2011-08-01, La clase corresponde a la versión 4 del sistema,
 *               la misma a sufrido 2 refactorings durante la versión
 *               se realizaron 3 cambios menores luego del segundo refactoring
 *               el último cambio fue realizado el 1 de agosto de 2011]
 *
 * @author [Yeferson Valencia, alejandro.yand@gmail.com
 *           ej: Fulano DeTal – fulano.detal@swissmedical.com.ar]
 *
 * @since [1,0,0]
 *
 */
public class Song extends LisSong {
    private String name;
    private String singer;
    private String songDuration;
    private String date;
    private  int age;
    private String coverPage;
    private String description;
    private String genre;

    //constructor
    public Song(){
        name = "";
        singer ="";
        songDuration="";
        date = date;

        int age = 0;
        coverPage = "";
        description = "";
        genre = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(String songDuration) {
        this.songDuration = songDuration;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCoverPage() {
        return coverPage;
    }

    public void setCoverPage(String coverPage) {
        this.coverPage = coverPage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
