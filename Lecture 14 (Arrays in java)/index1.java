/**
 *   Calculate the sum of all elements in the given array
 *      int arr [] = {4,3,7,5};   //19
 */



public class index1 
{
    public static void main(String[] args) 
    {
        int sum = 0;
        int arr [] = {4,3,7,5};

        for(int i=0; i<arr.length; i++)
        {
            sum = sum+arr[i];
            
        }
        System.out.println(sum);
    }
}
