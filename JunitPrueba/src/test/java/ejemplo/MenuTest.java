package ejemplo;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MenuTest {

    @Test
    public void testMostrarOpciones() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Menu.mostrarOpciones();

        String output = outContent.toString();
        assertTrue(output.contains("1.- Introduce nombre de usuario"));
        assertTrue(output.contains("2.- Introducir ingresos"));
        assertTrue(output.contains("3.- Introducir gasto"));
        assertTrue(output.contains("4.- Mostrar saldo"));
        assertTrue(output.contains("5.- Salir"));
    }
}
