
import java.util.HashMap;

public class SimpleFactorial {

    private byte facet = 0;
    static final byte MAXIMUM = 20;
    static final byte MINIMUM = 0;
    private HashMap<Integer,Long> factorTable;

    public SimpleFactorial() {

        facet = MAXIMUM;

        factorTable = new HashMap<Integer, Long>();
        factorTable.put(0, 1L);
        makeFactorials();
    }

     public void makeFactorials() {

        long tmp = 1;
        for (int i =1; i<=facet; i++)
        {

            tmp*=i;
            factorTable.put(i,tmp);
        }

    }

    public long getFactorial(int x){


        if (x>=MINIMUM && x<=MAXIMUM)
            return factorTable.get(x);

        return -1;
    }

}
