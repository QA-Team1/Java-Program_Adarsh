
public class WordCount {

	public static void main(String[] args) {
		
		int count,j,k, sentencel;
	    
		String name= "This is Blue car This car has many models.";
	    String[] sentence=name.split(" "); //stored in array and splitted
	    sentencel=sentence.length;
	    
	    for (int i=0;i<sentencel;i++)
	    {
	    	String Word = sentence[i];
	    	count=1;
	    	for (j=(i+1);j<(sentencel-1);j++)
	    	{
	    		if(Word.equals(sentence[j]))
	    	{
	    			count++;
	    			for (k=j;k<(sentencel-1);k++)
	    			{
	    				sentence[k]=sentence[k+1];
	    				
	    			}
	    			sentencel--;
	    			j--;
	    		
	    			
	    	}
	    	}
	    	System.out.println(Word+" : "+count);
	    	count=0;
	    	
	    }			
	    	}

	}

