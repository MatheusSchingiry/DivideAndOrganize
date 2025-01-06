import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number;

        System.out.println("*************************************");
        System.out.println("*        Divide and Ordenade        *");
        System.out.println("*************************************\n");
        System.out.print("Write your number: ");
        number = scanner.nextLine();
        divide(number);
    }
    public static void divide(String value){
        int temp;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < value.length(); i++){
            char j = value.charAt(i);
            temp = j - '0';
            list.add(temp);
        }
        toArray(list);
    }

    public static void toArray(ArrayList<Integer> list){
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++){
            arr[i] = list.get(i);
        }
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] number){
        int temp;

        //primeiro for seleciona um numero
        for (int i = 0; i < number.length; i++){

            //segundo for olha oresto d cadeia de numeros
            for(int j = i+1; j < number.length; j++){

                //realiza a comparação e caso necessario altera a posição
                if(number[i] > number[j]){
                    temp = number[i];;
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        template(number);
    }

    public static void template(int[] number){
        System.out.println("\nOrdenade List: ");
        for(int i = 0; i < number.length; i++){
            System.out.print(number[i] + ", ");
        }
    }
}