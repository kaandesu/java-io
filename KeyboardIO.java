import java.io.*;

public class KeyboardIO {
  private InputStreamReader inputStreamReader;
  private BufferedReader reader;
  private OutputStreamWriter outputStreamWriter;
  private BufferedWriter writer;

  public KeyboardIO() {
    inputStreamReader = new InputStreamReader(System.in);
    reader = new BufferedReader(inputStreamReader);

    outputStreamWriter = new OutputStreamWriter(System.out);
    writer = new BufferedWriter(outputStreamWriter);
  }

  public void readWriteText() {
    try {
      writer.write("enter some text (type exit ti quit): ");
      writer.newLine();
      writer.flush();

      String inputLine;
      while (!(inputLine = reader.readLine()).equalsIgnoreCase("exit")) {
        writer.write("You entered:" + inputLine);
        writer.newLine();
        writer.flush();
      }
    } catch (IOException e) {
      System.out.println("error keyboard io:" + e);
    }
  }

  public void closeStreams() {
    try {
      reader.close();
      writer.close();
      inputStreamReader.close();
      outputStreamWriter.close();
    } catch (IOException e) {
      System.out.println("error closeing strems:" + e);
    }
  }

}
