import java.io.IOException;
import java.util.*;
import java.io.*;

public class App {

  public static void main(String[] args) throws Exception {

    // io.readWriteEven("./lyrics.txt", "./test.txt");
    // IO io = new IO();

    KeyboardIO kio = new KeyboardIO();
    kio.readWriteText();
    kio.closeStreams();
  }

}
