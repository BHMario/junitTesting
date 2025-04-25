package ejemplo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class MainTest {

    @Test
    public void testMainMethodRuns() {
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}