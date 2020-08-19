package zissen;

import java.io.*;

public class FileProcessor {
  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("text.txt", true);
    fw.write("!アイウエオ");
    fw.flush();
    fw.close();
  }
}