import java.util.Arrays;
import java.util.Scanner;

public class Array {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the length of the array:");
      int n = sc.nextInt();
      int [] Array = new int[n];
      
      System.out.println("Enter the elements of the array:");
      for(int i=0; i<n; i++ ) {
        Array [i] = sc.nextInt();
      }
      
      System.out.println("Array of elements are:");
      System.out.print(Arrays.toString(Array));
      
      
      //Descending order and Third Largest Number Program //
    
  
      int temp = 0;    
      
      for (int i = 0; i < n; i++)       
         for (int j = i+1; j < n; j++)  
         {
            if(Array[i] < Array[j]) 
            {    
                temp = Array[i];    
                Array[i] = Array[j];    
                Array[j] = temp; 
            }
         }
         
               System.out.println();    
               System.out.println("Array of elements in descending order: ");    
               System.out.print(Arrays.toString(Array));   
               System.out.println();
               System.out.println("Thired Largest Element in an array is:"+Array[2]);
               
       
               
               
               //Even Count Program//
   
   int evencount =0;
   for (int i =0; i<n;i++)
   {
	   if (Array[i]%2==0)
	   {
		  evencount++;
	   }
   }
		  System.out.println("Total Even numbers in array are:"+ evencount);
      }
   }



