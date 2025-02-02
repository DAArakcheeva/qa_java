import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionTest {

    @Test
    public void testGetKittens()throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline,"Самец");
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testGetFood() throws Exception{
        Feline feline = new Feline();
        Lion lion = new Lion(feline,"Самец");
        List<String> actual = lion.getFood();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void checkLionException() {
        Feline feline = new Feline();
        Exception exception = assertThrows(Exception.class,
                () -> new Lion(feline, "")
        );

        String expectedMessage = "Используйте допустимые значения пола животного - самей или самка";
        String actualMessage = exception.getMessage();

        // Дополнительно проверяем сообщение об ошибке
        assertEquals(expectedMessage, actualMessage);
    }

}
