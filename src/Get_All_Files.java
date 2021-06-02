import java.io.File;



public class Get_All_Files {
	public static void getFiles()
	{
		System.out.println("List of all files :");
		User_Interface.path=new File("").getAbsolutePath(); // gets the path of present directory
		User_Interface.file=new File(User_Interface.path); // file object
		File contents[] = User_Interface.file.listFiles(); // array of files that already present in absolute path
		if(User_Interface.value==1) {
			User_Interface.value=0;
			for(int i=0; i<contents.length; i++) {
				
				if(contents[i].getName().charAt(0)!='.')
		         User_Interface.files.add(contents[i]);
		         
		      }
		}
		
		
		//size of arraylist
		int size=User_Interface.files.size();
		
		
		if(size>0) // if there are no elements no need to sort and print
		{
		// bubble sort
		
		for (int j = 0; j <size- 1; j++)   // bubble sort for sorting file names in Ascending order
        {
            for (int i = j + 1; i <size; i++) 
            {
                if (User_Interface.files.get(j).compareTo(User_Interface.files.get(i)) > 0)
                {
                    File temp = User_Interface.files.get(j);
                    User_Interface.files.set(j, User_Interface.files.get(i));
                    User_Interface.files.set(i,temp) ;
                }
            }
           
        }
		//printing all elements in arraylist w.r.t filename
		for(File s:User_Interface.files){
			
				System.out.println(s.getName());
			
			
		}
		}
		
		else
		{
			System.out.println("No files available");
		}
	      
	    
		
	}

}
