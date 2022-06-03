package fcfmclases.practica9.labprogramacion;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
/** PRACTICA 9 "FILE WRITTER && FILE READER"
 * RUN FILE
 * @since 18/04/2022
 * @author Omar Gallegos
 * OMAR ESAU GALLEGOS MORENO 1969869
 * Semana 10
 */
public class FMetodos {
    public FMetodos(String fileN){
        this.wfiles(fileN);
        this.rfiles(fileN);
    }

    private void wfiles(String fileN){
        try{
            FileWriter fw = new FileWriter(fileN);
            //Instanciamos
            fw.write("Esto es una prueb");
            fw.write(97);
            //Escribimos
            fw.close();
            //Cerramos
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        finally{
            
        }
    }
    
    private void rfiles(String fileN){
        try{
            FileReader fr = new FileReader(fileN);
            //Intanciamos
            int valor = fr.read();
            while (valor!=-1) {
                System.out.println((char)valor);
                valor=fr.read();
            }
            fr.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        finally{
            
        }
    }
}//