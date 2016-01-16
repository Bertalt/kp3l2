
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class SetXTest {

    private byte expacted;
    private byte value;

    @Parameterized.Parameters
    public static Collection<Byte[]> getParameters(){
        return Arrays.asList( new Byte[][]{
                {-1,-1},        //expected, value
                {-1, 23},            //expected, value
                {15, 15},
                {-1,(byte)254}
        });
    }

    public SetXTest(byte expacted, byte value){
        this.expacted = expacted;
        this.value=value;
    }



    @Test
    public void testSetX() {

        Calculator calculator = new Calculator();

        assertEquals(expacted,calculator.setX(value));


    }


}