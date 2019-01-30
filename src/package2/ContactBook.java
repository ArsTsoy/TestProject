package package2;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactBook {

    static Scanner in = new Scanner(System.in);
    static ArrayList<String[]> contBook = new ArrayList<>();


    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите команду\n1 - добавить\n2 - показать\n3 - изменить\n4 - удалить");

            switch (in.nextInt()) {
                case 1:
                    add();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    show();
                    change();
                    break;
                case 4:
                    show();
                    delete();
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }

    public static void add(){
        String[] newContact = new String[2];
        newContact[0] = getName();
        newContact[1] = getNumber();
        contBook.add(newContact);
        System.out.println(contBook);
        System.out.println("-----Контакт успешно добавлен-----");
    }


    public static void delete(){

        contBook.remove(getPlace());
        System.out.println("------Контакт успешно удален-----");
    }

    public static void change(){

        int place = getPlace();
        String[] contact = contBook.get(place);
        System.out.println("Введите\n1-изменить имя\n2-изменить номер");
        switch (in.nextInt()) {
            case 1:
                contact[0] = getName();
                break;
            case 2:
                contact[1] = getNumber();
                break;
        }
        contBook.set(place, contact);
        System.out.println("-----Контакт успешно изменен-----");
    }


    public static void show() {
        System.out.println("-----Список контактов-----");
        for (int i = 0; i < contBook.size(); i++) {
            System.out.println((i + 1) + ")" + contBook.get(i)[0] + " " + contBook.get(i)[1]);
        }
        System.out.println("--------------------------");
    }

    public static String getName() {
        System.out.println("Введите имя");
        return in.next();
    }

    public static String getNumber() {
        System.out.println("Введите номер");
        return in.next();
    }

    public static int getPlace() {
        System.out.println("Введите место контакта");
        return in.nextInt() - 1;
    }
}
