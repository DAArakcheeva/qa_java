import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {

    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void testGetSound(){
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected, actual);
    }
}
