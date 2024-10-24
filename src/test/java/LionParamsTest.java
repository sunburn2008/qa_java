import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

@RunWith(Parameterized.class)

public class LionParamsTest {
    @Mock
    Feline feline;
    String sex;
    boolean hasMane;

    public LionParamsTest(String sex, boolean hasMane) throws Exception {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] lionSexParamsTest() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void lionSexTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(hasMane, lion.doesHaveMane());
    }

    @Test
    public void getKittensTest() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion(sex, feline);
        lion.getKittens();
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(sex, feline);
        lion.getFood();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedResult, lion.getFood());
    }
}
