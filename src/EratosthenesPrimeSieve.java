import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve{

    public static EratosthenesPrimeSieve main = new EratosthenesPrimeSieve();

    public static void main(String[] args) {

        main.printPrimes(100);



    }
    @Override
    public boolean isPrime(int p) {

        if (p <= 1) {
            return false;
        }
        if (p <= 3) {
            return true;
        }
        if (p % 2 == 0 || p % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= p; i += 6) {
            if (p % i == 0 || p % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    @Override
    public void printPrimes(int upperbound) {
        for(int i = 2;i <= upperbound ;i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
        System.out.println();git
    }
}
