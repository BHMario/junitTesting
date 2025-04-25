package ejemplo;

import org.junit.jupiter.api.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class Pedir_datosTest {

    @Test
    public void testNuevoNombre() {
        String simulatedInput = "Lucía\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        String nombre = Pedir_datos.nuevoNombre(true);
        assertEquals("Lucía", nombre);

        System.setIn(originalIn);
    }

    @Test
    public void testNuevaCantidadValida() {
        String simulatedInput = "123,45\n".replace(",", ".");
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        float cantidad = Pedir_datos.nuevaCantidad();
        assertEquals(123.45f, cantidad, 0.001);

        System.setIn(originalIn);
    }

    @Test
    public void testNumSwitch() {
        String simulatedInput = "2\n";
        InputStream originalIn = System.in;
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        int opcion = Pedir_datos.numSwitch();
        assertEquals(2, opcion);

        System.setIn(originalIn);
    }
}