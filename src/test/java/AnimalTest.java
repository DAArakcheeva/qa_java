import com.example.Animal;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {

    // Тестируемый объект
   Animal animal = new Animal();

    @Test
    public void testGetFoodForHerbivore() throws Exception {
        // Проверяем поведение для травоядного животного
        List<String> foodList = animal.getFood("Травоядное");
        assertNotNull(foodList); // Убедимся, что список не null
        assertEquals(List.of("Трава", "Различные растения"), foodList); // Сравниваем ожидаемый результат
    }

    @Test
    public void testGetFoodForCarnivore() throws Exception {
        // Проверяем поведение для хищника
        List<String> foodList = animal.getFood("Хищник");
        assertNotNull(foodList); // Убедимся, что список не null
        assertEquals(List.of("Животные", "Птицы", "Рыба"), foodList); // Сравниваем ожидаемый результат
    }

    @Test
    public void testGetFoodThrowsException() {
        // Проверяем поведение при передаче неизвестного вида животного
        Exception exception = assertThrows(Exception.class, () -> animal.getFood("Неизвестный"));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage()); // Проверяем сообщение исключения
    }

    @Test
   public void testGetFamily() {
        // Проверяем метод getFamily()
        String familyDescription = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", familyDescription); // Сравниваем ожидаемый результат
    }
}
