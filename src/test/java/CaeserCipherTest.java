import org.junit.*;
import static org.junit.Assert.*;

public class CaeserCipherTest {

    @Test
    public void newCaesarCipher_instantiateCorrectly() {
        CaeserCipher testCaesarCipher = new CaeserCipher("a", 2);
        assertEquals(true, testCaesarCipher instanceof CaeserCipher);
    }
}