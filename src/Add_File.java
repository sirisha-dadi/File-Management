import java.io.File;
import java.io.IOException;

public class Add_File {
	
	public static void addFile(String fileName)
	{
		User_Interface.file=new File(fileName);
		//User_Interface.files.add(file);
		User_Interface.path=User_Interface.file.getAbsolutePath();
		
		try {
			if(User_Interface.file.createNewFile())
			{
				User_Interface.files.add(User_Interface.file);
				System.out.println("Created successfully");
			}
			else
			{
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("Problem encounterd please try again with correct details");
			e.printStackTrace();
		}
	}
  
}
