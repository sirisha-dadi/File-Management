import java.io.File;

public class Search_File {
	public static void searchFile(String fileName) {
		File file =new File(fileName);
		int flag=0;
		
		
		
		for(File s:User_Interface.files){
			if(s.getName().compareTo(file.getName())==0)
			{
				flag=1;
	    	    System.out.println("Found the file " +s.getName());
	    		break;
			}
			
		}
	      if(flag==0)
	      {
	    	  System.out.println("File specified not available");
	      }
	      
	      
	}
 
}
