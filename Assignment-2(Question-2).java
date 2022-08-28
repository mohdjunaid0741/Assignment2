public class HCF {

	 public static void main (String[]args)
	  {
	    int num1 = 60, num2 = 36, hcf=1;

	    for (int i = 1; i <= num1 || i <= num2; i++)
	      {
	     if (num1 % i == 0 && num2 % i == 0)
	        hcf = i;
	      }

	    System.out.println("The HCF of num1 and num2 is: "+ hcf);
	  }

}