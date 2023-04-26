import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FUtil {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("no has introducido parametros");
            System.out.println("prueba escribiendo Jtype<palabra>");
        }else{
            String direccion = args[0];
            try(FileReader fuente = new FileReader(direccion);
                OutputStreamWriter consola = new OutputStreamWriter(System.out)){
                int aux=0;
                while(aux !=-1){
                    if(aux!=-1){
                        aux = fuente.read();
                        consola.write((char) aux );
                    }
                }
            } catch(FileNotFoundException fn){
                System.out.println("Error "+ fn);
            } catch(IOException e){
                System.out.println("Error "+e);
            }
        }
    }


}
