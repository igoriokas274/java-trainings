package fileWriterAndReader;

import java.io.*;

public class Application {

    public static void main(String[] args) {

        String fileName = "test.txt";

        File file = new File(fileName);

        /*
            Create file and write lines of text in it
         */
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {

            bufferedWriter.write("First line in the document");
            bufferedWriter.newLine();
            bufferedWriter.write("Second line");
            bufferedWriter.newLine();
            bufferedWriter.write("Final line in the document");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        /*
            Read created file and print results in the Console
         */
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            String lines;

            while ((lines = bufferedReader.readLine()) != null) {
                System.out.println(lines);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
