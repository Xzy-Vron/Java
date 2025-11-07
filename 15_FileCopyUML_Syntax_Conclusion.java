
import java.io.*;
/*
 Problem 15: Read from one file and write line by line to another file.
 Also include UML, syntax and conclusion as comments.
 UML (simple):
 Class FileCopy
 - source:String
 - dest:String
 + main(args):void

 Concept syntax used: FileReader, BufferedReader, FileWriter, BufferedWriter, try-with-resources, IOException handling

 Conclusion:
 This program demonstrates file I/O in Java using buffered streams, reading and writing line by line,
 and handling exceptions. It is important to close streams or use try-with-resources to avoid resource leaks.
*/
public class FileCopyUML_Syntax_Conclusion {
    public static void main(String[] args) {
        String src = "input.txt"; // ensure this file exists in working directory
        String dst = "output.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(src));
             BufferedWriter bw = new BufferedWriter(new FileWriter(dst))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("File copied.");
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
