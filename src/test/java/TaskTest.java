import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TaskTest {
    @DataProvider
    public Object[][] modulData() {
        return new Object[][]{
                {5, 5},
                {3, -3},
                {7, 7},
                {1, -1}
        };
    }
    @DataProvider
    public Object[][] ExactData() {
        return new Object[][]{
                {10, 4, 6},
                {-14, -11, -3},
                {21, 6, 15},
                {30, 32, -2}
        };
    }
    @DataProvider
    public Object[][] FloorDivData() {
        return new Object[][]{
                {2, 7, 3},
                {-5, -25, 5},
                {0, 1, 100},
                {4, 100, 24}
        };
    }
    @Test(dataProvider = "modulData")
    public void TestAbs(int result, int Abs) throws Exception {
        Assert.assertEquals(result, Math.abs(Abs),"ошибка модуля");
    }
    @Test (dataProvider = "ExactData")
    public void TestAddExact(int result, int a, int b) throws Exception {
        Assert.assertEquals(result, Math.addExact(a, b),"ошибка функции addExact");
    }
    @Test (dataProvider = "FloorDivData")
    public void TestFloorDiv(int result, int a, int b) throws Exception{
        Assert.assertEquals(result, Math.floorDiv(a, b),"ошибка функции floorDiv");
    }
}
