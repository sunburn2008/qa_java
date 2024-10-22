import com.example.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import java.util.List;

@RunWith(Parameterized.class)
public class EatMeatParamsTest {

    List<String> expectedFood;
    String animalKind;

    @Spy
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

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void eatMaetTest() throws Exception {
        Mockito.when(animal.getFood(animalKind)).thenReturn(expectedFood);
        Assert.assertEquals(expectedFood, animal.getFood(animalKind));

    }
}
