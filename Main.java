import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("SINIRI SECİN:");
         int n =scan.nextInt();
           System.out.println(2);
           for(int sayi = 3; sayi < n; sayi++){
               for(int i = 2; i < sayi; i++){
                   if(sayi%i == 0)
                       break;
                   if(i == sayi-1 && sayi%i != 0)
                       System.out.print(sayi + ",");
               }
           }

       }



   }







































