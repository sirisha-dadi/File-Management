import java.io.File;

public class Delete_File {
	public static void deleteFile(String fileName)
	{
		File file=new File(fileName);
		if(file.delete())
		{
			System.out.println("Deleted Successfully");
		}
		else
		{
			System.out.println("Delete Unsuccessfull/ Path or filename may be wrong");
		}
	}

}
