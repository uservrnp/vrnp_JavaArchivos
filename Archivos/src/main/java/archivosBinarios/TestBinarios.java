package archivosBinarios;

import java.io.*;

public class TestBinarios {

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

    public static void main(String[] args) {
        TestBinarios test = new TestBinarios();
        test.escribirBinario();

    }

}
