package lt.simonasjankauskas.app;

import java.util.Scanner;


public class Masyvai {
    public static <SelectionSort> void main (String[] args) {

        // 1 dalis
        // ... for ciklas
        System.out.println("... for ciklas");
        int[] firstArray = {1, 2, 3};
        for(int i = 0; i < firstArray.length; i++) {
            System.out.println(firstArray[i]);
        }
        // ... while ciklas
        System.out.println("... while ciklas");
        int j = 0;
        while(j < firstArray.length){
            System.out.println(firstArray[j]);
            j++;
        }
        // ... do while ciklas
        System.out.println("... do while ciklas");
        int k = 0;
        do{
            System.out.println(firstArray[k]);
            k++;
        }while(k < firstArray.length);
        // 2, 3, 4 ir 5 dalys viename
        int lenght, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Įveskite masyvo ilgį:");
        lenght = input.nextInt();
        int items[] = new int[lenght];
        System.out.println("Įveskite masyvo elementus:");
        for (int i = 0; i < lenght; i++) {
            items[i] = input.nextInt();
            sum = sum + items[i];
        }
        System.out.println("Masyvo elementų suma yra:" + sum);
        int average = sum / items.length;
        System.out.println("Masyvo elementų vidurkis yra:" + average);
    }
}
