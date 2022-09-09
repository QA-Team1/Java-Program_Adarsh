
public class Fullpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=6;
		int i,j;
for(i=1;i<=k;i++)
 {
   for(j=1;j<=k-i;j++)
   System.out.print(" ");
   for(j=1;j<=2*i-1;j=j+2)
     System.out.print("*"+" ");
   System.out.println(" ");
 }

	}

}
