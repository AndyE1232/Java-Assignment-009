import java.math.BigInteger;
public class Big {

public static BigInteger factorial(int n) {

    BigInteger fact = BigInteger.valueOf(1);
    for (int i = 0; i <= n; i++) {
        if (i == 0){
            System.out.println("0 1");
        } else {
            fact = fact.multiply(BigInteger.valueOf(i));
            System.out.println(i + " " + fact);
        }
    }
    return fact;

}


    public static void main(String[] args) {

    factorial(30);

    }
}