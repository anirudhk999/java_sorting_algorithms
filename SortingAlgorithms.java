package SortingAlgorithms;
import java.util.*;

class SortingAlgorithms
{

    public static void bubbleSort(int[] arr, boolean reverse)
    {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = 0; j < n - 1; j++){
                if(!reverse)
                {
                    if(arr[j] < arr[j + 1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                else
                {
                    if(arr[j] > arr[j + 1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void selectionSort(int[] arr, boolean reverse)
    {

    }

    public static void insertionSort(int[] arr, boolean reverse)
    {

    }

    public static void mergeSort(int[] arr, boolean reverse)
    {

    }

    public static void quickSort(int[] arr, boolean reverse)
    {

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER NUMBERS TO SORT");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] arr = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++)
        {
            arr[i] = Integer.parseInt(numbers[i]);
        }

        System.out.println("CHOOSE THE SORTING ALGO");
        System.out.println("1)BUBBLE SORT");
        System.out.println("2)SELECTION SORT");
        System.out.println("3)INSERTION SORT");
        System.out.println("4)MERGE SORT");
        System.out.println("5)QUICK SORT");
        int choice = scanner.nextInt();
        System.out.println("SORT IN ASCENDING ORDER?(TRUE/FALSE):");
        boolean reverse = scanner.nextBoolean();

        long startTime = System.nanoTime();
        switch(choice) 
        {
            case 1:
                bubbleSort(arr, reverse);
                break;
            
            case 2:
                selectionSort(arr, reverse);
                break;

            case 3:
                insertionSort(arr, reverse);
                break;

            case 4:
                mergeSort(arr, reverse);
                break;

            case 5:
                quickSort(arr, reverse);
                break;

            default:
                System.out.println("INVALID CHOICE");
                return;
            
        }

        long endTime = System.nanoTime();
        long Duration = (endTime - startTime) / 1000000;
        System.out.print("SORTED ARRAY");
        System.out.println(Arrays.toString(arr));
        System.out.print("DURATION : ");
        System.out.println(Duration);

        scanner.close();
    }

    
}