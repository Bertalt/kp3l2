import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;


@RunWith(value = Parameterized.class)
public class CalculationTest {

    private double value;
    private double expacted;


    @Parameterized.Parameters
    public static Collection<Double[]> getParameters() {
        return Arrays.asList(new Double[][]{
                {1d, 0d},
                {0d, 1d},
                {1d, 2d},
                {-2d, 3d},
                { 1342.58d, 10d},
                {-164596.21, 15d},
                {2.127721034E7d, 20d}




        });
    }
        public CalculationTest(double expacted, double value){
            this.expacted = expacted;
            this.value=value;
        }


    @Test
    public void testCalculation(){

        Calculator calculator = new Calculator();
        calculator.setX( Byte.valueOf(Long.toString(Math.round(value))));
        assertEquals(expacted, new Double(
                BigDecimal
                        .valueOf(calculator.calculate())
                                    .setScale(2, RoundingMode.DOWN)
                                    .toString()));
    }

}
