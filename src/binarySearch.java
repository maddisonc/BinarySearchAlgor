public class binarySearch
{

    public static int binarySearchMethod (int [] arr, int target)
    {
        int size = arr.length;

        int min = 0;
        int max = size;
        int mid = (min + max)/2;
        int midTemp = 0;


        for (int i = 0; i < mid; i++) {
            midTemp = (min + max) / 2;

            // if target is greater than the middle, eliminate the right
            if (target > arr[midTemp]) {
                min = midTemp;
            }

            // else if target is less than the middle, eliminate the left
            else if (target < arr[midTemp]) {
                max = midTemp;
            } else if (target == arr[midTemp]) {
                return midTemp;
            }

        } // end for loop

        if (arr.length < 4)
        {
            for (int i = 0; i < arr.length; i++)
            {
             if (arr[i] == target)
             {
                 return i;
             }
            }
        }

        /*
        if (target != arr[midTemp]) {
            return -1;
        } // end if
         */

        return -1;

    } // end binarySearchMethod

} // end binarySearch
