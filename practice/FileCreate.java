package package1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;



 
public class FileCreate
{
    public static void main(String[] args) throws IOException
  {
        createFileUsingFileClass();
        createFileUsingFileOutputStreamClass();
        createFileIn_NIO();
    }
 
    private static void createFileUsingFileClass() throws IOException
    {
          File file = new File("E:\\Simpli\\projects\\file1\\a.txt");
  
          //Create the file
          if (file.createNewFile()){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
           
          //Write Content
          FileWriter writer = new FileWriter(file);
          writer.write("Test data");
          writer.close();
    }
 
    private static void createFileUsingFileOutputStreamClass() throws IOException
    {
        String data = "write data.....";
        FileOutputStream out = new FileOutputStream("E:\\Simpli\\projects\\file1\\b.txt");
        out.write(data.getBytes());
        out.close();
    }
 
    private static void createFileIn_NIO()  throws IOException
    {
        String data = "write data.....";
        Files.write(Paths.get("E:\\Simpli\\projects\\file1\\b.txt"), data.getBytes());
        List<String> lines = Arrays.asList("hello", "welcome");
       Files.write(Paths.get("E:\\Simpli\\projects\\file1\\c.txt"),
                    lines,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
    



    // variable declaration
    int ch;

    // check if File exists or not
    FileReader fr=null;{
    try
    {
        fr = new FileReader("E:\\Simpli\\projects\\file1\\c.txt");
    }
    catch (FileNotFoundException fe)
    {
        System.out.println("File not found");
    }

    // read from FileReader till the end of file
    try {
		while ((ch=fr.read())!=-1)
		    System.out.print((char)ch);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}

    // close the file
    try {
		fr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}
}
}
}