import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParamertrizedTestTask2 {
    private int[] array;
    private int[] expectedArray;
    Task2 task2;

    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[]{1,2,5,8,6,7,4,5,6,9},    new int[]{5,6,9}},
                {new int[]{1,2,4,8,6,7,4,7,16,45},  new int[]{7,16,45}},
                {new int[]{8,2,5,8,6,7,25,8,91},    new int[]{25,8,91}},
                {new int[]{1,8,6,7,4,13,19,3},      new int[]{13,19,3}},
        });
    }
    public ParamertrizedTestTask2(int[] array, int[] expectedArray) {
        this.array = array;
        this.expectedArray = expectedArray;
    }

    @Before
    public void before(){
        task2 = new Task2();
    }
    @Test
    public void testReturnArrayWithElementsAfterLast_4(){
        Assert.assertArrayEquals(expectedArray, task2.returnArrayWithElementsAfterLast_4(array));
    }
    @Test(expected = RuntimeException.class)
    public void testReturnArrayWithElementsAfterLast_4_expectedRuntimeException(){
        Assert.assertArrayEquals(expectedArray, task2.returnArrayWithElementsAfterLast_4(array));
    }

}
