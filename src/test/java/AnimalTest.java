import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {
    Animal animal;

    @Test
    public void animalTest() {
        animal = new Animal();
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals(expectedResult, animal.getFamily());
    }
}
