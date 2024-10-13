package archivosTexto;

import java.io.*;

public class archivosTexto {

    File archivo;

    private void crearArchivoDeTexto() {
        archivo = new File("archivo.txt");
        try {
            if (archivo.createNewFile()) {
                System.out.print("El archivo fue creado con exito");
            } else {
                System.out.print("El archivo ya existe - ocurrio un error");
            }
        } catch (IOException exception) {
            exception.printStackTrace(System.out);
        }
    }

    private void eliminarArchivoDeTexto() {
            if (archivo.delete()) {
                System.out.print("El archivo fue eliminado con exito");
            } else {
                System.out.print("El archivo ya existe - ocurrio un error");
            }
    }

    private void escribiralArchivoDeTexto(){
        try {
            FileWriter escritura = new FileWriter(archivo,false);
            escritura.write("Saludos a VRNP");
            escritura.close();
            System.out.print("Texto añadido con exito!!!!!!!!");

        } catch (IOException exception) {
            exception.printStackTrace(System.out);
        }
    }

    private void leerArchivoDeTexto(){
        String contenido;
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(lector);
            contenido = lectura.readLine();
            while (contenido != null){
                System.out.print(contenido);
                contenido = lectura.readLine();
            }


        } catch (IOException exception) {
            exception.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) {
        archivosTexto ArchivoTexto = new archivosTexto();
        ArchivoTexto.crearArchivoDeTexto();
        ArchivoTexto.escribiralArchivoDeTexto();
        ArchivoTexto.leerArchivoDeTexto();
    }
}