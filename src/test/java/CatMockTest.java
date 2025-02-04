import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatMockTest {

    @Mock
    Feline feline;

    @Test
    public void testGetFood() throws Exception {
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expected);

        Cat cat = new Cat(feline);
        List<String> actual = cat.getFood();

        assertEquals(expected, actual);
    }

}
