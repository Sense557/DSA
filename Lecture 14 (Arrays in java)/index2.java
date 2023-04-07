/**
 *  Calculate the maximum value out of all elements in the array
 *      - int arr [] = {4,3,7,5};   //7
 */



public class index2 
{
    

    public static void main(String[] args) 
    {
        int arr [] = {4,3,7,5};   //7

        int ans = 0;

        for(int i =0; i<arr.length; i++)
        {
            if(arr[i] > ans)
            {
                ans = arr[i];
                // System.out.println(arr[i]);
            }
            
        }
        System.out.println(ans);
    }
}
