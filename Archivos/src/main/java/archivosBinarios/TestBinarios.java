package archivosBinarios;

import java.io.*;

public class TestBinarios {
    //Metodo para escribir en un archivo binario
    private void escribirBinario(){

        try {
            FileOutputStream archivo = new FileOutputStream("personas.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);

            escritura.writeObject(new Persona (40, "Victor Raul"));
            System.out.print("Objeto Añadido con EXITO!!!!!!!!");
            escritura.close();
        } catch (IOException exception) {
            exception.printStackTrace(System.out);
        }
    }

    //Creamos el metodo para Leer en metodo binario
    private void LeerBinario() throws ClassNotFoundException{
        Persona persona;
        try {
            FileInputStream archivo = new FileInputStream("personas.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
            while (true) {
                persona = (Persona) lectura.readObject();
                persona.mostrarDatos();
                //System.out.print("Leer binario con EXITO!!!!!!!!");
            }
        } catch (EOFException exception){
            return;
            //System.out.print("Leer binario con EXITO!!!!!!!!");

        } catch (IOException error) {
            error.printStackTrace(System.out);
        }
    }

    private void añadirBinario(){
        try {
            FileOutputStream archivo = new FileOutputStream("personas.bin", true);
            AñadirContenido escritura = new AñadirContenido(archivo);

            escritura.writeObject(new Persona (40, "Victor Raul ---"));
            escritura.writeObject(new Persona (41, "Mario Jose Raul ---"));
            escritura.writeObject(new Persona (42, "Raul Ronaldo ----"));
            System.out.print("Objeto Añadido con EXITO!!!!!!!!");
            escritura.close();

        } catch (IOException exception) {
            exception.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException{
        TestBinarios test = new TestBinarios();
        test.escribirBinario();
        test.añadirBinario();
        test.LeerBinario();

    }

}
