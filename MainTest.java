import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void equalValue() {
        // Ensures that array is still empty
        int iLength = 0;
        int testLength = Main.getLength();
        assertEquals(iLength, testLength);
    }
}