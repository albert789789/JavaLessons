package com.mycompany.prepare.io;

import java.io.*;
import java.util.Scanner;

public class Test {

    private static final String FILE_PATH = "C:\\Users\\user\\IdeaProjects\\JavaLessons\\src\\com\\mycompany\\prepare\\io\\file1.txt";

    static void outputStreamAndInputStream() throws IOException {
        try(final OutputStream outputStream = new FileOutputStream(new File(FILE_PATH))) {
            final String s = "Some String";
            for (int i = 0; i < s.length(); ++i) {
                outputStream.write((s.charAt(i)));
            }
        }

        try(final InputStream inputStream = new FileInputStream(new File(FILE_PATH))) {
            int read;
            while ((read = inputStream.read()) != -1) {
                System.out.print((char) read);
            }
            System.out.println();
        }
    }
    static void writeAndReadFromFile() throws IOException {

        try(final OutputStream outputStream = new FileOutputStream(FILE_PATH);
            final PrintWriter pw = new PrintWriter(outputStream);
        ) {
            pw.println("Albert Ohanyan");
            pw.println("Karen Ohanyan");
        }

        final Scanner sc = new Scanner(new File(FILE_PATH));
        while(sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        System.out.println("END");
    }

    public static void main(String[] args) throws IOException {
        // outputStreamAndInputStream();
        // writeAndReadFromFile();

        try(InputStream in = System.in) {
            int read;
            while ((read = in.read()) != -1) {
                System.out.print((char)read);
            }
        }

        System.out.println(500);

        System.err.println("System error");
        System.err.println("System error");

    }
}
