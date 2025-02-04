import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline; // не знаю, излишне ли тут private

    @Test
    public void testGetKittens()throws Exception {
       Lion lion = new Lion(feline, "Самец");

        when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens(); // Проверяем результат вызова метода getKittens
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testGetFood() throws Exception{
        Lion lion = new Lion(feline, "Самец");

        when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));

        List<String> actual = lion.getFood(); // Проверяем результат вызова метода getFood()
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void checkLionException() {

        Exception exception = assertThrows(Exception.class,
                () -> new Lion(feline, "")
        );

        String expectedMessage = "Используйте допустимые значения пола животного - самей или самка";
        String actualMessage = exception.getMessage();

        // Дополнительно проверяем сообщение об ошибке
        assertEquals(expectedMessage, actualMessage);
    }

}
