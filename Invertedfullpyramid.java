
public class Invertedfullpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=7;
		int i,j;
		for(i=k-1;i>=1;i--)
	     {
	       for(j=1;j<=k-i;j++)
	       System.out.print(" ");
	       for(j=1;j<=2*i-1;j=j+2)
	         System.out.print("*"+" ");
	       System.out.println(" ");

	}
	}
}
