package library;

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

public class Salsa extends LisSong {

    private String genre;

    //constructor por defecto
    public Salsa(){
        super();
        this.genre = "Blues";

    }

}
