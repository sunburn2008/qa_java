import com.example.Lion;
import org.junit.Test;

public class LionExceptionTest {


    @Test(expected = Exception.class)
    public void lionExceptionTest() throws Exception {
        Lion lion = new Lion("Самей", null);
    }
}
