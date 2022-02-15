package library;

import java.io.*;
/**
 * [Esta clase nor permite capturar la excepción para  dirigirnos al link de Youtube
 *
 * @version [I
 *           ej: 1.00.00 2022-02-12,
 *
 * @author [Yeferson Valencia, alejandro.yandd@gmail.com]
 */
public class ShowUrl {

    /**
     * [el metodo donde creamos excepción donde se instancia clase File
     *...;
     * @throws Exception
     *
     * @author [Yeferson Valencia, alejandro.yandd@gmail.com
     *            ej: Fulano DeTal – fulano.detal@swissmedical.com.ar]
     */
    public void showUrlException() throws FileNotFoundException, IOException{
        File url= new File("https://www.youtube.com/");
        FileReader fr = new FileReader(url);
        BufferedReader bf = new BufferedReader(fr);
        String link;

        while ((link = bf.readLine()) != null){
            System.out.println(link);
        }
    }

    /**
     * [el metodo donde se ejecuta el try catch
     *...;
     * @throws Exception
     *
     * @author [Yeferson Valencia, alejandro.yandd@gmail.com
     *            ej: Fulano DeTal – fulano.detal@swissmedical.com.ar]
     */
    public  void showUrlException2() {
        try {
            showUrlException();
        } catch (FileNotFoundException ex) {
            System.out.println("no se a encontrado la rura verifique su conexion a internet");
        }catch (IOException ex1){
            System.out.println("conectado: ");
        }
    }
}
