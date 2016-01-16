import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by bertalt on 16.01.16.
 */
@RunWith(value = Parameterized.class)
public class FactorialTest {

    private long value;
    private long expacted;

    @Parameterized.Parameters
    public static Collection<Long[]> getParameters(){
        return Arrays.asList( new Long[][]{
                {1L,0L},        //expected, value
                {1L, 1L},            //expected, value
                {2L, 2L},
                {6L,3L},
                {24L,4L},
                {120L,5L},
                {720L,6L},
                {5040L,7L},
                {40320L,8L},
                {362880L,9L},
                {3628800L, 10L},
                {2432902008176640000L, 20L},
                {-1L, -1L},
                {-1L, 25634L},
                {-1L, 21L}

        });
    }
    public FactorialTest(long expacted, long value){
        this.expacted = expacted;
        this.value=value;
    }

    @Test
    public void testFactrials()  {

        SimpleFactorial simpleFactorial  = new SimpleFactorial();
        assertEquals(expacted, simpleFactorial.getFactorial((int)value));
        System.out.println(value+"! = "+ simpleFactorial.getFactorial((int)value));
    }

}
