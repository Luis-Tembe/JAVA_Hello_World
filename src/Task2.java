import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task2 {
    //This program calculates your Body Mass Index
    public static void main(String[] args) throws IOException{
        float height, weight, BMI;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This program calculates your BMI");
        System.out.println("Enter your height in cm: ");
        height = Float.parseFloat(br.readLine())/100;
        System.out.println("Enter your weight in kg: ");
        weight= Float.parseFloat(br.readLine());

        BMI= (float) (weight/Math.pow(height,2));
        System.out.printf("Your BIM is: " + "%2.2f, \n", BMI);

        if (BMI<16){
            System.out.println("You are Starving");
        }else if ((BMI>=16)&&(BMI < 16.99)){
            System.out.println("You are emaciated");
        }else if ((BMI>17)&& (BMI<18.49)){
            System.out.println("You are underweight");
        }else if ((BMI>=18.50)&&(BMI< 22.99)){
            System.out.println("You are in a low range of the normal");

        }else if((BMI>=23)&&(BMI<24.99)){
            System.out.println("You are in a high range of the normal");
        }else if((BMI>25)&&(BMI<27.49)){
            System.out.println("You are overweight (Pre-obese)");
        }else if((BMI>=27.50)&&(BMI<29.99)){
            System.out.println("You are overweight ");
        }else if ((BMI>=30)&&(BMI<34.9)){
            System.out.println("You have 1st degree obesity");
        }else if((BMI>=35)&&(BMI<39.99)){
            System.out.println("You have 2nd degree obesity");
        }else if(BMI>40){
            System.out.println("You have 3rd degree obesity");
        }
}}
