import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;

// TODO:
// 1- get the character count ina file and write to another file
// 2- take two files and concatanete the two files ina single output file

public class IO {

  public void readWriteEven(String fin, String fout) {
    String s;
    int i = 1;
    try {
      FileReader fr = new FileReader(fin);
      BufferedReader br = new BufferedReader(fr);
      FileOutputStream f = new FileOutputStream(fout);
      PrintStream os = new PrintStream(f);

      while ((s = br.readLine()) != null) {
        if (i % 2 == 0)
          os.println(s);
        i++;
      }
      br.close();
      fr.close();
      os.close();
      f.close();
    } catch (IOException e) {
      System.out.println("error io:" + e);
    }
  }
}
