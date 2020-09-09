package lt.simonasjankauskas.app;

import java.util.Arrays;
import java.util.Scanner;


public class Masyvai {
    public static <SelectionSort> void main (String[] args) {

        // 1 dalis (CIKLUOSE NAUDOJAU i < 1, o ne firstArray.length, tam, kad išspausdintų masyvą vieną kartą.)
        // ... for ciklas
        System.out.println("... for ciklas");
        int[] firstArray = {1, 2, 3};
        for(int i = 0; i < 1; i++) {
            System.out.println(Arrays.toString(firstArray));
        }
        // ... while ciklas
        System.out.println("... while ciklas");
        int j = 0;
        while(j < 1){
            System.out.println(Arrays.toString(firstArray));
            j++;
        }
        // ... enhanced for
        System.out.println("... enhanced for");
        for(int s : firstArray) {
            System.out.println("~~>" + s);
        }
        // ... do while ciklas
        System.out.println("... do while ciklas");
        int k = 0;
        do{
            System.out.println(Arrays.toString(firstArray));
            k++;
        }while(k < 1);
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
        System.out.println("Sukurtas naujas masyvas:" + Arrays.toString(items));
        System.out.println("Masyvo elementų suma yra:" + sum);
        int average = sum / items.length;
        System.out.println("Masyvo elementų vidurkis yra:" + average);

        // 6. Bubble sort
        // ... rikiavimas (bubble sort algoritmas)
        int swaps = 0;
        int iterations = 0;
        int[] intArr6 = {5, 4, 3, 2, 1}; // rezultatas turėtų būti: 0, 1, 2, 4, 6
        System.out.println("Prieš rikiavimą: " + Arrays.toString(intArr6));
        for (int x = 0; x < intArr6.length - 1; x++) {
            for(int kidx = 0; kidx < intArr6.length - 1; kidx++){
                iterations++;
                if(intArr6[kidx] > intArr6[kidx + 1]){
                    int temporary = intArr6[kidx + 1];
                    intArr6[kidx + 1] = intArr6[kidx];
                    intArr6[kidx] = temporary;
                    swaps++;
                }
            }
        }
        System.out.println("Po rikiavimo: " + Arrays.toString(intArr6));
        System.out.println("Swaps:" + swaps);
        System.out.println("Iterations:" + iterations);



    }
}
