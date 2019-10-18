import static org.junit.Assert.*;
import org.junit.Test;

public class SilniaTest {

    @Test
    public void testSilni5(){
        Silnia silnia = new Silnia();
        assertEquals(silnia.silnia(5), 120);
    }

    @Test
    public void testSilniujemnej(){
        Silnia silnia = new Silnia();
        assertEquals(silnia.silnia(6), 720);
    }

    @Test
    public void testSilni1(){
        Silnia silnia = new Silnia();
        assertEquals(silnia.silnia(1), 1);
    }

}
