import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class CatTest {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);


    @Test
    public void catTest() {
        cat.getSound();
        String sound = "Мяу";
        Assert.assertEquals(sound, cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(food, cat.getFood());
    }
}
