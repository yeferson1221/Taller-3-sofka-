package library;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * [Detalle el objetivo de la clase.
 *
 * incorpore indicaciones de uso de la clase para facilitar su compresión.
 * ej.:
 *
 *   EstaClase clase = new EstaClase(arg, arg1, ..., argN);
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
 * @author [Ingrese nombre, apellido y correo electrónico del autor.
 *           ej: Fulano DeTal – fulano.detal@swissmedical.com.ar]
 *
 * @since [Ingrese desde que versión del sistema está presente la clase]
 *
 */
public abstract class LisSong implements FilterMelodi {

    ArrayList<Song> lisSong = new ArrayList();
    Scanner sc = new Scanner(System.in);





/**
 * [Detalle el objetivo del método.
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
 * @author [Ingrese nombre, apellido y correo electrónico del autor.
 *            ej: Fulano DeTal – fulano.detal@swissmedical.com.ar]
 *
 * @since [Ingrese desde que versión del sistema está presente el método]
 *
 */
    public void addSong() {
        Song song = new Song();

        System.out.println("Ingresar nombre de la cancion");
        song.setName(sc.nextLine());

        System.out.println("Ingresar nombre del artista");
        song.setSinger(sc.nextLine());

        System.out.println("Ingresar duracion de la cancion");
        song.setSongDuration(sc.nextLine());

        System.out.println("Ingresar año de la cancion");
        song.setAge(sc.nextInt());

        System.out.println("Ingresar portada de la cancion");
        song.setCoverPage(sc.nextLine());

        System.out.println("Ingresar descripcion de la cancion");
        song.setDescription(sc.nextLine());

        lisSong.add(song);
    }

    /**
     * [metodo getTolist nos permite filtrar las caiones por año esta
     * es un arrayList que se esta comparando con esta misma pero en  difetente indice.
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
            System.out.println(num.getName() + " " + num.getAge());
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
    public void getSong() {

        for (int i = 0; i < lisSong.size(); i++) {
            System.out.println("Numero: "+ (+i+1));
            System.out.println("Titulo: "+ lisSong.get(i).getName());
            System.out.println("Artista: "+ lisSong.get(i).getSinger());
            System.out.println("Año: "+ lisSong.get(i).getAge());
            System.out.println("Duracion: "+ lisSong.get(i).getSongDuration() + " minutos");
            System.out.println("Portada: "+ lisSong.get(i).getCoverPage() + ".jpg");
            System.out.println("Descripcion: "+ lisSong.get(i).getDescription() + "\n");
        }
    }
    @Override
    public void clearListSong(){
        lisSong.clear();
    }

}