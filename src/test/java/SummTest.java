import org.testng.Assert;
import org.testng.annotations.Test;

public class SummTest {
    private Summ object_sum = new Summ();

    @Test
    public void TestSum() throws Exception {
        Assert.assertEquals(5, object_sum.sum(2, 3));
    }
}
