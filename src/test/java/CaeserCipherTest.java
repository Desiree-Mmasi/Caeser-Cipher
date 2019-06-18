import org.junit.*;
import static org.junit.Assert.*;

public class CaeserCipherTest {

    @Test
    public void newCaesarCipher_instantiateCorrectly() {
        CaeserCipher testCaesarCipher = new CaeserCipher("a", 2);
        assertEquals(true, testCaesarCipher instanceof CaeserCipher);
    }

    @Test
    public void newCaesarCipher_readsAString_a() {
        CaeserCipher testCaesarCipher = new CaeserCipher("a", 2);
        assertEquals("a", testCaesarCipher.getStatement());
    }

    @Test
    public void newCaesarCipher_readKey_2() {
        CaeserCipher testCaesarCipher = new CaeserCipher("a", 2);
        assertEquals(2, testCaesarCipher.getKey());
    }

    @Test
    public void newCaesarCipher_replaceLetter_b() {
        CaeserCipher testCaesarCipher = new CaeserCipher("a", 2);
        assertEquals("b", testCaesarCipher.isEncrypted());

    }
}