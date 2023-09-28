import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve{

    public static EratosthenesPrimeSieve main = new EratosthenesPrimeSieve();

    public static void main(String[] args) {

        main.printPrimes(100);

        List<String> primeSums = findPrimSumm(100);

        for(String result : primeSums){
            System.out.println(result);
        }

    }
    @Override
    public boolean isPrime(int p) {


    }

    @Override
    public void printPrimes(int upperbound) {

        for(int i = 2;i <= upperbound ;i++){
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    public static List<String> findPrimSumm(int upperbound){
        List<String> result = new ArrayList<>();

        for(int n = 4; n <= upperbound; n += 2){
            for(int r = 2; r <= n / 2; r++){
                int y = n-r;
                if(main.isPrime(r) && main.isPrime(y)){
                    result.add(n + " Summe: " + n + " = " + r + " + " + y);
                    break;
                }
            }
        }
        return result;
    }
}
