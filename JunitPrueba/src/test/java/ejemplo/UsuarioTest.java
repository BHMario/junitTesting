package ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testConstructorYGetters() {
        Usuario user = new Usuario("Ana");
        assertEquals("Ana", user.getNombreUsuario());
        assertEquals(0f, user.getSaldo());
        assertEquals(0f, user.getGasto());
        assertEquals(0f, user.getIngresos());
    }

    @Test
    public void testSetters() {
        Usuario user = new Usuario("Carlos");
        user.setSaldo(100f);
        user.setGasto(20f);
        user.setIngresos(80f);

        assertEquals(100f, user.getSaldo());
        assertEquals(20f, user.getGasto());
        assertEquals(80f, user.getIngresos());
    }

    @Test
    public void testSetNombreUsuario() {
        Usuario user = new Usuario("Pedro");
        user.setNombreUsuario("Pablo");
        assertEquals("Pablo", user.getNombreUsuario());
    }
}