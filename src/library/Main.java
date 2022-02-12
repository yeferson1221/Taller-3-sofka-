package library;

import java.util.Scanner;
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
public class Main {

    public static void main(String[] args){
        Pop pop1 = new Pop();
        Reggaeton reggaeton1 = new Reggaeton();
        Rock rock1 = new Rock();
        Salsa salsa1 = new Salsa();
        Blues blues1 = new Blues();
        Song song1 = new Song();

        Scanner in= new Scanner(System.in);
        int opcion1;
        do {
            System.out.println(
                    "Menu Principal\n"
                            +"1. POP\n"
                            +"2. REGUETON\n"
                            +"3. ROCK\n"
                            +"4. SALSA\n"
                            +"5. BLUES\n"
                            +"6. LISTA TODO\n"
                            +"7. SALIR\n");
            System.out.println("");
            System.out.println("Ingresar opcion: ");
            System.out.println("--------------------------------------------------------------------");
            opcion1=in.nextByte();
            if (opcion1==1) {

                byte opcion;
                do {
                    System.out.println(
                            "Menu Principal\n"
                                    + "1. Agregar cancion\n"
                                    + "2. Listar canciones de este genero\n"
                                    + "3. Listar Canciones por año\n"
                                    + "4. Eliminar lista\n"
                                    + "5. Exit");
                    System.out.println("");
                    System.out.println("Ingresar opcion: ");
                    System.out.println("--------------------------------------------------------------------");
                    opcion = in.nextByte();
                    switch (opcion) {
                        case 1:
                            pop1.addSong();
                            break;
                        case 2:
                            pop1.getSong();
                            break;

                        case 3:
                            pop1.getToList();
                            break;
                        case 4:
                            pop1.clearListSong();
                            break;

                        case 5:
                            System.out.println("inicio");
                            break;

                        default:
                            System.out.println("no valido");
                            break;

                    }
                    System.out.println("--------------------------------------------------------------------");
                } while (opcion != 5);

            }else if(opcion1==2) {

                byte opcion;

                do {
                    System.out.println(
                            "Menu Principal\n"
                                    + "1. Agregar cancion\n"
                                    + "2. Listar canciones de este genero\n"
                                    + "3. Listar Canciones por año\n"
                                    + "4. Eliminar lista\n"
                                    + "5. Exit");
                    System.out.println("");
                    System.out.println("--------------------------------------------------------------------");
                    opcion = in.nextByte();

                    switch (opcion) {
                        case 1:
                            reggaeton1.addSong();
                            break;
                        case 2:
                            reggaeton1.getSong();
                            break;

                        case 3:
                            reggaeton1.getToList();
                            break;
                        case 4:
                            reggaeton1.clearListSong();
                            break;

                        case 5:
                            System.out.println("inicio");
                            break;

                        default:
                            System.out.println("no valido");
                            break;

                    }
                } while (opcion != 5);

            }else if(opcion1==3) {

                byte opcion;

                do {
                    System.out.println(
                            "Menu Principal\n"
                                    + "1. Agregar cancion\n"
                                    + "2. Listar canciones de este genero\n"
                                    + "3. Listar Canciones por año\n"
                                    + "4. Eliminar lista\n"
                                    + "5. Exit");
                    System.out.println("");
                    System.out.println("--------------------------------------------------------------------");
                    opcion = in.nextByte();

                    switch (opcion) {
                        case 1:
                            rock1.addSong();
                            break;

                        case 2:
                            rock1.getSong();
                            break;

                        case 3:
                            rock1.getToList();
                            break;

                        case 4:
                            rock1.clearListSong();
                            break;

                        case 5:
                            System.out.println("inicio");
                            break;

                        default:
                            System.out.println("no valido");
                            break;

                    }

                } while (opcion != 5);

            } else if(opcion1==4) {

                byte opcion;

                do {
                    System.out.println(
                            "Menu Principal\n"
                                    + "1. Agregar cancion\n"
                                    + "2. Listar canciones de este genero\n"
                                    + "3. Listar Canciones por año\n"
                                    + "4. Eliminar lista\n"
                                    + "5. Exit");
                    System.out.println("");
                    System.out.println("--------------------------------------------------------------------");
                    opcion = in.nextByte();

                    switch (opcion) {
                        case 1:
                            salsa1.addSong();
                            break;

                        case 2:
                            salsa1.getSong();
                            break;

                        case 3:
                            salsa1.getToList();
                            break;

                        case 4:
                            salsa1.clearListSong();
                            break;

                        case 5:
                            System.out.println("inicio");
                            break;

                        default:
                            System.out.println("no valido");
                            break;
                    }
                } while (opcion != 5);

            } else if(opcion1==5) {

                byte opcion;

                do {
                    System.out.println(
                            "Menu Principal\n"
                                    + "1. Agregar cancion\n"
                                    + "2. Listar canciones de este genero\n"
                                    + "3. Listar Canciones por año\n"
                                    + "4. Eliminar lista\n"
                                    + "5. Exit");
                    System.out.println("");
                    System.out.println("--------------------------------------------------------------------");
                    opcion = in.nextByte();

                    switch (opcion) {
                        case 1:
                            blues1.addSong();
                            break;

                        case 2:
                            blues1.getSong();
                            break;

                        case 3:
                            blues1.getToList();
                            break;

                        case 4:
                            blues1.clearListSong();
                            break;

                        case 5:
                            System.out.println("inicio");
                            break;

                        default:
                            System.out.println("no valido");
                            break;
                    }
                } while (opcion != 5);

            } else if(opcion1==6) {
                System.out.println("");
                System.out.println("--------------------------------------------------------------------");
                pop1.getSong();
                System.out.println("");
                System.out.println("--------------------------------------------------------------------");
                reggaeton1.getSong();
                System.out.println("");
                System.out.println("--------------------------------------------------------------------");
                rock1.getSong();
                System.out.println("");
                System.out.println("--------------------------------------------------------------------");
                salsa1.getSong();
                System.out.println("");
                System.out.println("--------------------------------------------------------------------");
                blues1.getSong();
            }

        } while (opcion1 != 7);
    }



}
