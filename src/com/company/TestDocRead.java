package com.company;

import java.io.*;

public class TestDocRead {

    public static void main(String[] args) throws IOException {
        File file = new File("resources/Tests.docx");
        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = "";

        while( (line = bufferedReader.readLine()) != null ){
            System.out.println(line);
        }

    }
}
