package com.harman.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileread {
    public static void main(String[] args) {
        try
        {
            FileInputStream file=new FileInputStream("Name.txt");
            int i=0;
            while((i=file.read())!=-1)
            {
                System.out.println((char)i);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }
    }

