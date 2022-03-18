package com.harman.files;

import java.io.FileOutputStream;
import java.io.IOException;

public class Fileout {
    public static void main(String[] args) {

        try
        {
            FileOutputStream object = new FileOutputStream("Output_Write.txt");
            String data = "Welcome to Java";
            byte b[] = data.getBytes();
            object.write(b);
            object.close();
            System.out.println("File has been Created Successfully !! ");
        }

        catch (IOException e)
        {
            System.out.println(e);
        }

    }
}

