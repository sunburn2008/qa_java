import com.example.Feline;
import org.junit.Test;

public class EatMeatExceptionTest {
    Feline feline = new Feline();

    @Test(expected = Exception.class)
    public void eatMeatExceptionTest() throws Exception {
        feline.getFood("Динозавр");
    }
}