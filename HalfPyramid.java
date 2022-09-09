
public class HalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		 int k=6;
		 
		   for(i=1;i<=k;i++)
		   {
		     for(j=1;j<=i;j++)
		     System.out.print("*");
		     for(j=1;j<=2*i-1;j++)
		       System.out.print(" ");
		     System.out.println(" ");
		   }
		 

	}

}
