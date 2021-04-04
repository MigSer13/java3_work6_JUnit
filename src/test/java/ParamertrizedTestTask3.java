import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParamertrizedTestTask3 {
    private int[] array;
    private boolean expected;
    Task3 task3;

    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new int[]{1,2,5,8,6,7,4,5,6,9},    true},
                {new int[]{1,2,4,8,6,7,4,7,16,45},  true},
                {new int[]{8,2,5,8,6,7,25,8,91},    true},
                {new int[]{1,8,6,7,4,13,19,3},      true},
        });
    }
    public ParamertrizedTestTask3(int[] array, boolean expected) {
        this.array = array;
        this.expected = expected;
    }

    @Before
    public void before(){
        task3 = new Task3();
    }
    @Test
    public void testReturnArrayWithElementsAfterLast_4(){
        Assert.assertEquals(expected, task3.checkingArrayFor_1_and_4(array));
    }


}
