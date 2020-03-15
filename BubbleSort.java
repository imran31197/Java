public class BubbleSort
{
    int[] bubblesort(int arr[],int n) //BubbleSort is the class, and bubblesort() is the method in the class
    {
        int i;
        for(i=0;i<n;i++)
        {
            int j;
            for(j=0;j<n-1-i;j++) // Heaviest element (largest) has already bubbled to the end of the array. So no need to run the loop till the end off the array.
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    void printer(int arr[],int n)
    {
        int i;
        for (i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        BubbleSort b = new BubbleSort();
        int arr[]={9,8,7,6,5,4,3,2,1};
        int n=arr.length;
        int sorted_array[] = b.bubblesort(arr, n); // Main array itself is sorted but I have assigned a new array for holding the sorted array as well.
        b.printer(sorted_array,n); // I could have written b.printer(arr,n) as well and it would give me the correct result.
    }
}
