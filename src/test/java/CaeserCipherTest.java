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
    @Test
    public void newCaesarCipher_replaceLetterByUsingKey_c(){
        CaeserCipher testCaesarCipher = new CaeserCipher("a",2);
        assertEquals("c",testCaesarCipher.isActuallyEncrypted("a",2));
    }

    @Test
    public void newCaesarCipher_replaceMultipleLettersByUsingKey_cde(){
        CaeserCipher testCaesarCipher = new CaeserCipher("abc",2);
        assertEquals("cde",testCaesarCipher.isActuallyEncrypted("abc",2));
    }

    @Test
    public void newCaesarCipher_decryptAStringUsingAKey_abc(){
        CaeserCipher testCaesarCipher = new CaeserCipher("cde",2);
        assertEquals("abc",testCaesarCipher.toDecrypt("cde",2));
    }
}