import com.example.Lion;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionTest {

    @Test
    public void testGetKittens()throws Exception {
        Lion lion = new Lion("Самец");
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testGetFood() throws Exception{
        Lion lion = new Lion("Самец");
        List<String> actual = lion.getFood();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void checkLionException() {
        Exception exception = assertThrows(Exception.class,
                () -> new Lion("")
        );

        String expectedMessage = "Используйте допустимые значения пола животного - самей или самка";
        String actualMessage = exception.getMessage();

        // Дополнительно проверяем сообщение об ошибке
        assertEquals(expectedMessage, actualMessage);
    }

}
