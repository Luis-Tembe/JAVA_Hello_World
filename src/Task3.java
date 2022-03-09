import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task3 {
    public static void main(String[] args) throws IOException{
        double a,b,c, delta, x1, x2;
        char rootsNumber=0;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This program solves a Quadratic Equation");
        System.out.println("Enter the value of a: ");
        a=Double.parseDouble(br.readLine());

        if (a==0){
            System.out.println("Value can not be zero");
        }else {
            System.out.println("Enter the value of b: ");
            b=Double.parseDouble(br.readLine());
            System.out.println("Enter the value of c:");
            c=Double.parseDouble(br.readLine());

            delta=pow(b,2)-4*a*c;
            if(delta<0) rootsNumber=0;
            if(delta==0)rootsNumber=1;
            if (delta>0)rootsNumber=2;

            switch (rootsNumber){
                case 0: System.out.println("There are no real roots");
                break;

                case 1:{
                    x1=-b/(2*a);
                    System.out.printf("For a = "+"%4.2f" ,a);
                    System.out.printf("\n b = "+"%4.2f" ,b);
                    System.out.printf("\n c = "+"%4.2f" ,c);
                    System.out.println("\n the trinominal has one double root= ");
                    System.out.printf("%4.2f. \n", x1);
                }
                case 2:{
                    x1= (-b-sqrt(delta))/(2*a);
                    x2= (-b+sqrt(delta))/(2*a);
                    System.out.printf("For a= "+ "%4.2f,",a);
                    System.out.printf("For b= "+ "%4.2f,", b);
                    System.out.printf("For c= "+ "%4.2f,",c);
                    System.out.println("x1= ");
                    System.out.printf("%4.2f\n",x2);
                } break;
            }
        }

    }
}
