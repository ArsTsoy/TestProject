package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Contact {

    private String name;
    private String number;
    private Date birthDate;

    Contact(){

    }

    public Contact(String name, String number, Date birthDate) {
        this.name = name;
        this.number = number;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBirthDate(String birthDate) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date date = simpleDateFormat.parse(birthDate);


        this.birthDate = date;
    }


    @Override
    public String toString() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E dd.MM.yyyy z");
        return name + " " + number + " " + simpleDateFormat.format(birthDate);
    }
}
