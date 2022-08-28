import java.util.*;
public class String {

	static void sort(String []s, int n)
	{
	    for (int i=1 ;i<n; i++)
	    {
	        String temp = s[i];
	 
	        // Insert s[j] at its correct position
	        int j = i - 1;
	        while (j >= 0 && temp.length() < s[j].length())
	        {
	            s[j+1] = s[j];
	            j--;
	        }
	        s[j+1] = temp;
	    }
	}
	 
	private int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	// Function to print the sorted array of string
	static void printArraystring(String str[], int n)
	{
	    for (int i=0; i<n; i++)
	        System.out.print(str[i]+" ");
	}
	 
	// Driver function
	public static void main(String args[])
	{
	    String [] arr = {"This", "is", "an", "easiest", "example"};
	    int n = arr.length;
	     
	    // Function to perform sorting
	    sort(arr,n);
	    // Calling the function to print result
	    printArraystring(arr, n);
	     
	}
}