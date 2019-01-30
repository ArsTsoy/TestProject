package com.company;


import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//class OnlyExt implements FilenameFilter {
//    String ext;
//    OnlyExt(String ext){
//        this.ext = ext;
//    }
//
//    @Override
//    public boolean accept(File dir, String name) {
//        return name.endsWith(ext);
//    }
//}
public class Main {




    static Scanner scan = new Scanner(System.in);
    static ArrayList<Contact> telbook = new ArrayList<>();


    public static void main(String[] args) {


    }


    public static int choose(){
        return scan.nextInt() - 1;
    }
    public static void remove(){

        telbook.remove(choose());
    }

    public static void show() {
        System.out.println("--------Контакты--------");

        for (int i = 0; i < telbook.size(); i++) {
            System.out.println((i + 1) + ")" + telbook.get(i));
        }
        System.out.println("--------------------------------");
    }

    public static String getName() {
        System.out.println("setName");
        return scan.next();
    }

    public static String getNumber() {
        System.out.println("setNumber");
        return scan.next();
    }

//    public static void main(String[] args) {
//
//
//
//
//
//
////        Scanner scanner = new Scanner(System.in);
////        ArrayList<Contact> telBook = new ArrayList<>();
////
////
////        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
////
////
////        String str = scanner.next();
////
////        System.out.print("Строка " + str + " распаршена как ");
////        Date parsingDate;
////        try {
////            parsingDate = simpleDateFormat.parse(str);
////            System.out.println(parsingDate);
////        }catch (ParseException e) {
////            System.out.println("Нераспаршена с помощью " + simpleDateFormat);
////        }
//
//
//    }





    public static void printStudent(ArrayList<Student> studentArrayList, int course){

        for (Student s:studentArrayList) {

            if(s.getCourse() == course){
                System.out.println(s.getName());
            }

        }



    }

    static int lineUp(String commands) {

        int size = commands.length();
        int[] dirs = new int[size];
        int[] wrongDirs = new int[size];
        int sum = 0;


        for (int i = 0; i < commands.length(); i++) {
            if (commands.charAt(i) == 'R') {

                if (i == 0) {
                    dirs[i] = 1;
                    wrongDirs[i] = 3;
                } else {
                    dirs[i] = (dirs[i - 1] + 1) % 4;
                    wrongDirs[i] = (dirs[i - 1] + 1) % 4;
                }

            }
            if (commands.charAt(i) == 'L') {
                if (i == 0) {
                    dirs[i] = 3;
                    wrongDirs[i] = 1;
                } else {
                    dirs[i] = (dirs[i - 1] + 3) % 4;
                    wrongDirs[i] = (dirs[i - 1] + 3) % 4;
                }

            }
            if (commands.charAt(i) == 'A') {
                if (i == 0) {
                    dirs[i] = 2;
                    wrongDirs[i] = 2;
                } else {
                    dirs[i] = (dirs[i - 1] + 2) % 4;
                    wrongDirs[i] = (dirs[i - 1] + 2) % 4;
                }

            }
        }


        for (int i = 0; i < size; i++) {
            if (dirs[i] == wrongDirs[i]) {
                sum++;
            }
        }


        for (int i = 0; i < size; i++) {
            System.out.println("dirs = " + dirs[i]);
            System.out.println("wrongDirs = " + wrongDirs[i]);
            System.out.println("----------------------");
        }

        return sum;

    }


    public static void someMethod() {
        System.out.println("sfahgsfjbkanjslmf;");
    }


    public static int[] createArray(int size, int start, int end) {
        int[] mas = new int[size];

        int range = end - start;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * range + start);
        }
        return mas;
    }


    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void task1(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void showStr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static String[] change(int[] mass) {
        String[] massStr = new String[mass.length];
        for (int i = 0; i < mass.length; i++) {
            massStr[i] = String.valueOf(mass[i]);
        }
        return massStr;
    }


    public static void div(int[] mas, int index, int index2) throws ArrayIndexOutOfBoundsException {

        System.out.println(mas[index] / mas[index2]);
    }

    private static void task2() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 || i == 9) {
                    System.out.print("* ");
                    continue;
                }
                if ((j == 0 || j == 9) && (i != 0 || i != 9)) {
                    System.out.print("* ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println("");
        }
    }

    private static void task3() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 || j == 0 || i == 9 || j == 9 || i == j || j == 9 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    private static void task4() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j % 2 == i % 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }


    private static void task5() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    private static void task6() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j >= 9 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    private static void task7() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (j >= 9 - i && j <= 19 - (10 - i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    private static void task8() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (j >= 9 - i && j <= 19 - (10 - i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }


}







