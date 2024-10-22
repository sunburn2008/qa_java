import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, feline.getKittens());
    }

    @Test
    public void getKittensFelineTest() {
        Feline feline = new Feline();
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, feline.getKittens(expectedResult));
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        Assert.assertEquals(expectedResult, feline.getFamily());
    }
}
