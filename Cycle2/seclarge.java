import java.util.*;
class Seclarge {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		System.out.print("How many elements");
		int n = sc.nextInt();
		int sl=0;
		int i;
		System.out.println("Enter the elements : ");
		int[] a = new int[50];
		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int large = a[0];
		for(i=1;i<n;i++)
		{
			if(a[i]>large)
   			{
   			    sl=large;
	   			large = a[i];
			}
		}
		System.out.println(sl);
    }
}
