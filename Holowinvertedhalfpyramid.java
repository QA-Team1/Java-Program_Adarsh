
public class Holowinvertedhalfpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		 int k=6;
		   for(i=1;i<=k;i++)
			   {
			   if(i==1)
				   for (j=1;j<=k;j++)
					   System.out.print("*");
			   else
				   for(j=1;j<=7-i;j++)
					   if(j==1 || j==7-i)
						   System.out.print("*");
					   else
						   System.out.print(" ");
				   System.out.println();
			   }
		   
		  
	}
	}
	