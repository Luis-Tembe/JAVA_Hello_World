import java.util.Random;

public class Task5 {
    public static void main(String[] args)  {
        int collectionOfNum = 10, i = 1, number,min = 101,max= 0;
        System.out.println("This program generates "+ collectionOfNum+ " random numbers  from 1 to 100");
        System.out.println("And find the largest and smallest of them");

        Random r=new Random();
        System.out.print("Generated: ");

        while (i<= collectionOfNum){
            number=Math.round((r.nextInt(100)+1));
            System.out.print(number + ", ");

            if (number<min) min=number;


            if (number>max) max=number;

            i++;


        }
        System.out.println(" ");
        System.out.println("The largest number in the collection is: "+ max);
        System.out.println("The smallest number in the collection is: "+ min);

    }
}
