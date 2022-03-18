package com.harman.files;

import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("Sample.txt");
            writer.write("Hello World");
            writer.close();
            System.out.println("File has successfully created");
        } catch (IOException e) {
                System.out.println(e);
        }
    }
}
