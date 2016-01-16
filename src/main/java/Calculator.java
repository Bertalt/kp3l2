import java.util.Scanner;

public class Calculator {

    private byte x = -1;
    private double result = 0;
    private SimpleFactorial factorial;
    private final String errorMassage = "Error: Incorrect value of X  ";
    public Calculator(){

        factorial = new SimpleFactorial();
    }

    public byte getX() {
        return x;
    }


    public byte setX(byte x){


        if (x<SimpleFactorial.MINIMUM || x>SimpleFactorial.MAXIMUM)
        {
            System.out.println(errorMassage);
            return -1;
        }
        return this.x = x;

    }

    public boolean init(String x){

        byte tmp = 0;

        try {
            tmp = Byte.valueOf(x);
        }catch (NumberFormatException ex)
        {
            System.out.println(errorMassage + "[ \""+x+"\" ]");
            return false;
        }

        setX(tmp);
        return true;
    }

    public void inputX() {
        Scanner sc = new Scanner(System.in);
        boolean isValueCorrect = false;
        do{
            System.out.print("Enter x in a range ["+SimpleFactorial.MINIMUM +" and "
                                                    +SimpleFactorial.MAXIMUM+ "]: ");
            if (sc.hasNext())
                isValueCorrect = init(sc.nextLine());

        }while (!isValueCorrect);

    }
    public double calculate(){

        if (x == -1)
            return x;
        for(int i =0; i<=x; i++){

            result+= (Math.pow(-1,i)*(Math.pow(x,i)/factorial.getFactorial(i)));
            System.out.println((i)+": "+result);
        }
       return result;
    }



    public static void main (String[] args){

        Calculator calculator = new Calculator();
        calculator.inputX();
        System.out.println("e^"+calculator.getX()+" = "+calculator.calculate());

    }


}
