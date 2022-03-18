package com.harman.files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Name {
        public static void main(String[] args) {
            try {
                FileWriter writer=new FileWriter("Name.txt");
                String x,xresult;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the String:");
                x=input.next();
                writer.write(x);
                writer.close();
                System.out.println("File has successfully created");
            } catch (IOException e) {
                System.out.println(e);
            }
        }
}
