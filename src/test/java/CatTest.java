import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;
    Cat cat = new Cat(feline);

    @Test
    public void catTest() {
        String sound = "Мяу";
        Assert.assertEquals(sound, cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(feline);
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(food, cat.getFood());
    }
}
