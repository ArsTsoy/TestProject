package com.company;

import java.io.*;

public class FileWork {

    public static void main(String[] args) throws IOException {

        File fileTo = new File("resources/otvet");
        File fileIn = new File("resources/deposit");

        FileReader fileReader = new FileReader(fileIn);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String[] num1 = bufferedReader.readLine().split(" ");
        String[] num2 = bufferedReader.readLine().split(" ");

        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }

//        FileWriter fileWriter = new FileWriter(fileTo);
//
//        String answer = "";
//        try{
//            answer = String.valueOf(Integer.valueOf(num1) / Integer.valueOf(num2));
//        }catch (NumberFormatException ex){
//            answer = "Неправильный формат числа";
//        }
//
//        fileWriter.write(answer);
//        fileWriter.close();








    }
}
