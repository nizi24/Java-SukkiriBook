package zissen;
import java.io.*;
import java.net.*;

public class Web {
  public static void main(String[] args) {
    try {
      URL url = new URL("http://dokojava.jp");
      InputStream is = url.openStream();
      try (InputStreamReader isr = new InputStreamReader(is);) {
        int i = isr.read();
        while (i != -1) {
          System.out.print((char) i);
          i = isr.read();
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    } catch (MalformedURLException e) {
      System.out.println(e.getMessage());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}