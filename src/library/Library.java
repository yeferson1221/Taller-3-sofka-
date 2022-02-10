package library;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author  Jose Daniel Maza - josedmaza21@gmail.com
 * @version 1.0.0
 * @since   2022-01-09
 * Clase que representa un bilioteca de musica
 */
public abstract class Library {

    private String title;
    private int ID;
    private Date date;
    private int length;
    private String genre;
    private String coverPage;
    private String description;

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
    public Library(String title, int ID, int agno, int mes, int dia, int length, String genre, String coverPage, String description) {
        this.title = title;
        this.ID = ID;
        GregorianCalendar calendar = new GregorianCalendar(agno, mes - 1, dia);
        this.date = calendar.getTime();
        this.length = length;
        this.genre = genre;
        this.coverPage = coverPage;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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
}
