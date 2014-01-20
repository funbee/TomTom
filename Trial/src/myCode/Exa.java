package myCode;
/**
* This Program accepts an integer number from the keyboard and displays an operation chosen by the operator.
* The program first asks how many numbers the user wishes to enter, and then prompts the user to enter that amount and it then reads her/him the input. 
* @ Olufunmbi A Akande(Ref; 12815447) 
* @ 08/11/2013
*/


import java.util.Arrays;
import java.util.Scanner;

public class Exa
{
   public static void main(String [] args)
   {
       Scanner in = new Scanner(System.in);
       System.out.println("How many numbers do you wish to enter?: ");
       int totalNumbersEntered = in.nextInt();
       int myArray[] = new int [totalNumbersEntered];
       
       System.out.println("Please enter " +""+myArray.length+" "+"numbers");
       for(int i=0; i<myArray.length;i++)
       {       
           myArray[i] = in.nextInt();
       }

       //solution1(myArray);
       //solution2_1(myArray);
       //solution2_2(myArray);
       //solution3_1(myArray);
      // solution3_2(myArray);
       solution4(myArray);
}

/**
    * Prints the sum of an array of integers
    * @param dataSet the array of integers
    */
public static int solution1(int[] dataSet) {
   int total = 0;
   for (int element: dataSet) 
   {
       total = total + element;
   }
   System.out.println("The total of all the numbers is: " + total);
   return total;
}


/**
    * Prints the largest number in an array of integers
    * @param dataSet the array of integer
    * @return the largest of the numbers
    */
public static int solution2_1(int[] dataSet) {
   int largest = dataSet[0];
   for (int i = 1; i < dataSet.length; i++) 
   {
       if (dataSet[i] > largest) 
       {
           largest = dataSet[i];
       }
   }
   System.out.println("The largest number is: " + largest);
   return largest;
}



/**
* Prints the smallest number in an array of integers
* @param dataSet the array of integers
* @return the smallest of the numbers
*/
public static int solution2_2(int[] dataSet) {
   int smallest = dataSet[0];
   for (int i = dataSet.length - 1; i >= 0; i--) 
   {
       if (dataSet[i] < smallest) 
       {
           smallest = dataSet[i];
       }
   }
   System.out.println("The smallest number is: " + smallest);
   return smallest;
}




/**
* Finds the indices of the smallest number in an array of integers
* @param dataSet the array of integers
*/
public static void solution3_1(int[] dataSet) {
   int smallest = 1000000;
   for (int i = dataSet.length - 1; i >= 0; i--)
   {
       if (dataSet[i] < smallest) 
       {
           smallest = dataSet[i];
       }
   }

   

   for (int i = dataSet.length - 1; i >= 0; i--) 
   {
       if (dataSet[i] == smallest) 
       {
           System.out.println(" The index of the smallest number is:" + i);
       }
   }

}

/**
* Finds the indices of the largest number in n array of integers
* @param dataSet the array of integers
*/
public static void solution3_2(int[] dataSet) {
   int largest = 0;
   for (int i = 1; i < dataSet.length - 1; i++) 
   {
       if (dataSet[i] > largest) 
       {
           largest = dataSet[i];
       }
   }
   

   for (int i = 0; i < dataSet.length - 1; i++)
   {

       if (dataSet[i] == largest)
       {
           System.out.println("The index of the largest number is:" + i);
       }

   }
}


/**
 * Counts the number of distinct values in an array of integers
 * @param dataSet the array of integers
 */   
public static void solution4(int[] dataSet) {
   int uniqueValues = 0;
   int distinctNumber = 0;
   
   for (int i = 0; i < dataSet.length - 1; i++) {
       for (uniqueValues = i + 1; uniqueValues < dataSet.length; uniqueValues++)
       {
           if (dataSet[i] > dataSet[uniqueValues]) 
           { //swapping dataSet[i] and dataSet[UniqueValues]
               distinctNumber = dataSet[i];
               dataSet[i] = dataSet[uniqueValues];
               dataSet[uniqueValues] = distinctNumber;

           }
       }
   }
   
  int numberOfUniqueNumbers = 1;
  int tempValue = dataSet[0];
   
  for(int k = 0; k< dataSet.length; k++)
       if(tempValue < dataSet[k])
       {
          numberOfUniqueNumbers++;
          tempValue = dataSet[k];           
       }
       System.out.println("The number of distinct numbers are: " + numberOfUniqueNumbers);
   
   
        

   
}

}
