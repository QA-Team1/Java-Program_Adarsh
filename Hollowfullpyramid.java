
public class Hollowfullpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=6; 
		for(int i=1;i<=k;i++)
		{
		 for(int j=1;j<=k-i;j++)
		  System.out.print(" ");
		 
		 if(i==1 || i==k)
		 for(int j=1;j<=i*2-1;j=j+2)
		  System.out.print("*"+" ");
		else
		 for(int j=1;j<=i*2-1;j++)
		if(j==1 || j==i*2-1)
		  System.out.print("*");
		 
		 
		else
		  System.out.print(" ");
		System.out.println();
     }
	}

}



