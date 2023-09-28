import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

public class Main implements PrimeSieve{

    public static Main main = new Main();

    public static void main(String[] args) {

        main.printPrimes(100);

        List<String> primeSums = findPrimSumm(100);

        for(String result : primeSums){
            System.out.println(result);
        }

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
