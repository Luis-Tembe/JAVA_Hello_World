import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.concurrent.ForkJoinPool;

public class Task4 {
    public static void main(String[] args) throws IOException {
        int number,evenSum=0,i;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Enter a number: ");
        number= Integer.parseInt(br.readLine());

        for (i=1;i<=number;i++){

            if (i%2==0){
                evenSum=evenSum+i;
            }
        }
        System.out.println("\n The sum of Even Numbers up to " +number+ " = "+evenSum);

    }
}
