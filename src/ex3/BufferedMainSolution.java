package ex3;

import java.io.*;
import java.util.Scanner;

public class BufferedMainSolution {
    public static void main(String[] args) throws IOException {
        formatText("\nZeile 2\nZeile 3");
    }

    public static void formatText(String input) throws IOException{
        StringWriter output = new StringWriter();
        try (BufferedReader reader = new BufferedReader(new StringReader(input));
             BufferedWriter writer = new BufferedWriter(output)) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            writer.flush();
        }
        System.out.println("Formatted output:\n" + output.toString());
    }
}

