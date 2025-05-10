package ex3;

import java.io.*;
import java.util.Scanner;

public class BufferedMain {
    public static void main(String[] args) throws IOException {
        formatText("BUFFERED\nREADER\nis\nuseful");
    }

    public static void formatText(String input) throws IOException{
        StringWriter output = new StringWriter();
        // Format the Input...
        System.out.println("Formatted output:\n" + output.toString());
    }
}
