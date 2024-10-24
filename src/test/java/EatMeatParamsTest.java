import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class EatMeatParamsTest {

    List<String> expectedFood;
    String animalKind;

    Animal animal;

    public EatMeatParamsTest(String animalKind, List<String> expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters
    public static Object[][] getFoodTest() {
        return new Object[][]{
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Травоядное", List.of("Трава", "Различные растения")},
        };
    }

    @Test
    public void eatMaetTest() throws Exception {
        Animal animal = new Animal();
        List<String> actialFood = animal.getFood(animalKind);
        Assert.assertEquals(expectedFood, actialFood);
    }
}
