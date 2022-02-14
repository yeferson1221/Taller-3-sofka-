package library;

import java.util.Scanner;
/**
 * [clase main aqui estamos inicializando el proyecto.
 * tambien se agregar  algunos for y condicionales para imprimir
 * las opciones del listado de canciones
 *
 * ]
 *
 * @version [1.02.003 2022-13
 *
 * @author [Yeferson Valencia, alejandro.yand@gmail.com
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
                                    + "3. Listar canciones por año\n"
                                    + "4. Filtrar canciones por fecha\n"
                                    + "5. Filtrar canciones por duracion\n"
                                    + "6. Agregar listado de canciondes Favoritas\n"
                                    + "7. Eliminar lista\n"
                                    + "8. Exit");
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
                            pop1.filterByDate();
                            break;

                        case 5:
                            pop1.filterByDuration();
                            break;

                        case 6:
                            pop1.getSongFavorite();
                            break;


                        case 7:
                            pop1.clearListSong();
                            break;

                        case 8:
                            System.out.println("inicio");
                            break;

                        default:
                            System.out.println("no valido");
                            break;

                    }
                    System.out.println("--------------------------------------------------------------------");
                } while (opcion != 8);

            }else if(opcion1==2) {

                byte opcion;

                do {
                    System.out.println(
                            "Menu Principal\n"
                                    + "1. Agregar cancion\n"
                                    + "2. Listar canciones de este genero\n"
                                    + "3. Listar canciones por año\n"
                                    + "4. Filtrar canciones por fecha\n"
                                    + "5. Filtrar canciones por duracion\n"
                                    + "6. Agregar listado de canciondes Favoritas\n"
                                    + "7. Eliminar lista\n"
                                    + "8. Exit");
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
                            reggaeton1.filterByDate();
                            break;

                        case 5:
                            reggaeton1.filterByDuration();
                            break;

                        case 6:
                            reggaeton1.getSongFavorite();
                            break;


                        case 7:
                            reggaeton1.clearListSong();
                            break;

                        case 8:
                            System.out.println("inicio");
                            break;

                        default:
                            System.out.println("no valido");
                            break;

                    }
                } while (opcion != 8);

            }else if(opcion1 == 3) {

                byte opcion;

                do {
                    System.out.println(
                            "Menu Principal\n"
                                    + "1. Agregar cancion\n"
                                    + "2. Listar canciones de este genero\n"
                                    + "3. Listar canciones por año\n"
                                    + "4. Filtrar canciones por fecha\n"
                                    + "5. Filtrar canciones por duracion\n"
                                    + "6. Agregar listado de canciondes Favoritas\n"
                                    + "7. Eliminar lista\n"
                                    + "8. Exit");
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
                            rock1.filterByDate();
                            break;

                        case 5:
                            rock1.filterByDuration();
                            break;

                        case 6:
                            rock1.getSongFavorite();
                            break;


                        case 7:
                            rock1.clearListSong();
                            break;

                        case 8:
                            System.out.println("inicio");
                            break;

                        default:
                            System.out.println("no valido");
                            break;

                    }

                } while (opcion != 8);

            } else if(opcion1==4) {

                byte opcion;

                do {
                    System.out.println(
                            "Menu Principal\n"
                                    + "1. Agregar cancion\n"
                                    + "2. Listar canciones de este genero\n"
                                    + "3. Listar canciones por año\n"
                                    + "4. Filtrar canciones por fecha\n"
                                    + "5. Filtrar canciones por duracion\n"
                                    + "6. Agregar listado de canciondes Favoritas\n"
                                    + "7. Eliminar lista\n"
                                    + "8. Exit");
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
                            salsa1.filterByDate();
                            break;

                        case 5:
                            salsa1.filterByDuration();
                        break;

                        case 6:
                            salsa1.getSongFavorite();
                            break;

                        case 7:
                            salsa1.clearListSong();
                            break;

                        case 8:
                            System.out.println("inicio");
                            break;

                        default:
                            System.out.println("no valido");
                            break;
                    }
                } while (opcion != 8);

            } else if(opcion1==5) {

                byte opcion;

                do {
                    System.out.println(
                            "Menu Principal\n"
                                    + "1. Agregar cancion\n"
                                    + "2. Listar canciones de este genero\n"
                                    + "3. Listar canciones por año\n"
                                    + "4. Filtrar canciones por fecha\n"
                                    + "5. Filtrar canciones por duracion\n"
                                    + "6. Agregar listado de canciondes Favoritas\n"
                                    + "7. Eliminar lista\n"
                                    + "8. Exit");
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
                            blues1.filterByDate();
                            break;

                        case 5:
                            blues1.filterByDuration();
                        break;

                        case 6:
                            blues1.getSongFavorite();
                            break;

                        case 7:
                            blues1.clearListSong();
                            break;

                        case 8:
                            System.out.println("inicio");
                            break;

                        default:
                            System.out.println("no valido");
                            break;
                    }
                } while (opcion != 8);

            } else if(opcion1==6) {
                System.out.println("");
                pop1.getSong();
                System.out.println("");
                reggaeton1.getSong();
                System.out.println("");
                rock1.getSong();
                System.out.println("");
                salsa1.getSong();
                System.out.println("");
                blues1.getSong();
            }

        } while (opcion1 != 8);
    }



}
