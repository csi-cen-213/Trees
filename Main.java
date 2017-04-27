import java.util.Scanner;
import java.io.Reader;
import java.io.FileReader;

public class Main{
  public static void main(String [ ] args) {
    String filename = "data.txt";
    BSTree tree = new BSTree(5);

    
    
    
    try
    {
      Scanner scanner = new Scanner(new FileReader(filename));

      while (scanner.hasNext())
      {
        //System.out.println(scanner.nextInt());
      }
      scanner.close();
    }
    catch (Exception e)
    {
      System.err.format("Exception occurred trying to read '%s'.", filename);
      e.printStackTrace();
    }
  }
  
  
}