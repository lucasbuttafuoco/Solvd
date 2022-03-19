import java.util.Scanner;

public class Sort {
    static void bubbleSort(int arr[], int n)
    {                                       
        if (n == 1)                     //passes are done
        {
            return;
        }

        for (int i=0; i<n-1; i++)       //iteration through unsorted elements
        {
            if (arr[i] > arr[i+1])      //check if the elements are in order
            {                           //if not, swap them
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
            
        bubbleSort(arr, n-1);           //one pass done, proceed to the next
    }

    void display(int arr[])                 //display the array
    {  
        for (int i=0; i<arr.length; ++i) 
        {
            System.out.print(arr[i]+" ");
        } 
    } 
     
    public static void main(String[] args)
    {
        Sort ob = new Sort();
        System.out.println("Enter the length of the array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the numbers");
        for (int i = 0; i<n; i++){
            arr[i] = scanner.nextInt();
        } 
        bubbleSort(arr, arr.length);
        ob.display(arr);
    }
}
