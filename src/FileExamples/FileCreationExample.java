package FileExamples;
import java.io.File;
import java.io.IOException;
public class FileCreationExample {
 public static void main ( String [] args ) {
     String absolutePath = "C:\\Users\\sinha";
     String relativePath = "";
     File file = new File (absolutePath);
         try {
             if ( file.createNewFile () ) {
                 System.out.println (" File created : " + file.getName () ) ;
                 }
             else {
                 System.out.println (" File already exists .") ;}
         }
         catch ( IOException e ) {
             System.out.println ("An error occurred .") ;
             e.printStackTrace () ;
              }
     System.out.println(file.getAbsolutePath());
      }
 }


