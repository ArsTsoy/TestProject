package com.company;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLesson {



    public static void main(String[] args) throws IOException {

        int [] arr = new int[10];
        System.out.println(arr);


        ArsList arr2 = new ArsList();
        arr2.add(10);
        arr2.add(10);
        arr2.add(10);
        arr2.add(10);

        System.out.println(arr2 );
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(old35(num));
//
//        Scanner scan = new Scanner(System.in);
//        int year = scan.nextInt();
//        if(year % 4 == 0 && year % 400 != 0) {
//            System.out.println("366 dney");
//        }
//        else
//            {
//            System.out.println("365 dney");
//        }

    }

    public static boolean old35(int n) {
        if(n%3==0 && n%5==0)
            return false;
        else if(n%3==0)
            return true;
        else if(n%5==0)
            return true;
        else return false;
    }





//        System.out.println(s);
//        System.out.println(s2);



//        File fileRead = new File("resources/test");
//        FileReader fileReader = new FileReader(fileRead);
//
//        BufferedReader bfr = new BufferedReader(fileReader);
//
//        String line = "";
//        StringBuilder stringBuilder = new StringBuilder();
//
//        while( (line = bfr.readLine()) != null ){
//            stringBuilder.append("\n" + line);
//
//        }
//
//
//
//        Pattern emailPattern = Pattern.compile("[a-zA-Z0-9]+[@][a-z]+[.][a-z]+");
//
//        Matcher matcher = emailPattern.matcher(stringBuilder);
//
//        while(matcher.find()){
//            System.out.println(matcher.group());
//        }


//
//        Pattern pat = Pattern.compile("[0-9]+");
//        Matcher mat = pat.matcher();
//
//
//        while(mat.find()){
//            System.out.println(mat.group());
//
////            for (int i = 1; i <= mat.groupCount(); i++) {
////                System.out.println("Group " + i + ": " + mat.group(i));
////            }
//
//        }


//
//        final String regex = ".(at)";
//        final String string = "The fat cat sat on the mat.";
//
//        final Pattern pattern = Pattern.compile(regex);
//        final Matcher matcher = pattern.matcher(string);
//
//        while (matcher.find()) {
//            System.out.println("Full match: " + matcher.group(0));
//            for (int i = 1; i <= matcher.groupCount(); i++) {
//                System.out.println("Group " + i + ": " + matcher.group(i));
//            }
//        }


}
