/**
 *      Search the given element x in the array. If present return index else -1
 */



public class index3 
{
    public static void main(String[] args) 
    {
        // //given array
        // int arr [] = {10,1,3,5,5};

        // //searxh for element in the array
        // int x = 4;

        // //init the ans -1 so that it means it is not in the array
        // //ans print not found
        // int ans = -1;
        
        // //run a loop till the end of the end of the row
        // for(int i = 0; i<arr.length; i++)
        // {
        //     //if element is == given value
        //     if(arr[i] == x)
        //     {
        //         //assign the element to as ans and break so that we will get first occurance
        //         ans = i;
        //         break;
        //     }     
        // }   
        
        // //else if ans matches -1
        // if(ans == -1)
        // {
        //     //print that ans is not found
        //     System.out.println("Not found");

        // }else{
            
        //     // print as desiered
        //     System.out.println("found " + x + " at index "+ ans);
        // }
        
// 🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉🏉

        // given array
        int arr [] = {3,5,10,15,20,10};

        //check the ans if not found so init with -1
        int ans = -1;

        // search for the value in the array
        int x = 10;

        //run a loop to search for the element in the array
        for(int i=0; i<arr.length; i++)
        {
            //compare, if element matches the given value
            if(arr[i] == x)
            {
                //assign ans as element
                ans = i;

                //if matches after assigning break i.e. allow first occurance only
                break;
            }
        }

        //else not matches with ans run a new condition
        if(ans == -1)
        {
            System.out.println("Not found");

        }else{

            System.out.println("Found the ans "+ x + " at the index "+ ans);
        }
        



    }
}
