package archivosTexto;

import java.io.File;
import java.io.IOException;

public class ClaseFile {
    public static void main(String[] args){
        //Clase File
        //Le pasamos la ruta absoluta
        File archivo = new File("Prueba.txt");
       try {
            if (archivo.createNewFile()){
                System.out.print("El archivo fue creado con exito");
            }
            else{
                System.out.print("El archivo ya existe - ocurrio un error");
            }
        }catch (IOException exception){
            exception.printStackTrace(System.out);
        }
        System.out.print("Ruta del archivo + nombre : " + archivo.getAbsolutePath()); 
        System.out.print("Nombre del archivo : " + archivo.getName());
        System.out.print("Existe el archivo : " + archivo.exists());
        System.out.print("Se puede escribir en el archivo? : " + archivo.canWrite());
        System.out.print("Es archivo ? : " + archivo.isFile());
        System.out.print("Es directorio ? : " + archivo.isDirectory());
        System.out.print("Su longitud es : " + archivo.length());
    }
}
