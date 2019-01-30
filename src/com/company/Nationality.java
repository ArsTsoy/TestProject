package com.company;

public class Nationality {
    private String name;
    private String mainCountry;
    private int ammountPeople;
    private int ammountPeople1;
    private int ammountPeople2;
    private int ammountPeople3;
    private int ammountPeople4;
    private int ammountPeople5;
    private int ammountPeople6;
    private int ammountPeople7;
    private int ammountPeople8;
    private int ammountPeople9;
    private int ammountPeople0;


    private static final String NOT_EXIST = "Народ не существует";

    boolean isDisappeared = false;

    Nationality(String name, String mainCountry, int ammountPeople){
        this.name = name;
        this.mainCountry = mainCountry;
        this.ammountPeople = ammountPeople;

    }

    public void setName(String name){
        if(!isDisappeared){

            this.name = name;
        }else{
            System.out.println(NOT_EXIST);
        }
    }

    public String getName(){
        return name;
    }

    public void setMainCountry(String mainCountry){
        if(!isDisappeared){
            this.mainCountry = mainCountry;
        }
        else {
            System.out.println(NOT_EXIST);
        }

    }

    public String getMainCountry(){
        return mainCountry;
    }

    public void setAmmountPeople(int ammountPeople){
        if(!isDisappeared){

            this.ammountPeople = ammountPeople;
        }else {
            System.out.println(NOT_EXIST);
        }
    }

    public int getAmmountPeople(){
        return ammountPeople;
    }


    void disappear(){
        this.isDisappeared = true;
        this.ammountPeople = 0;
        this.name = null;
        this.mainCountry = null;

    }


    public void setAmmountPeople1(int ammountPeople1) {
        this.ammountPeople1 = ammountPeople1;
    }

    public void setAmmountPeople2(int ammountPeople2) {
        this.ammountPeople2 = ammountPeople2;
    }

    public void setAmmountPeople3(int ammountPeople3) {
        this.ammountPeople3 = ammountPeople3;
    }

    public void setAmmountPeople4(int ammountPeople4) {
        this.ammountPeople4 = ammountPeople4;
    }

    public void setAmmountPeople5(int ammountPeople5) {
        this.ammountPeople5 = ammountPeople5;
    }

    public void setAmmountPeople6(int ammountPeople6) {
        this.ammountPeople6 = ammountPeople6;
    }

    public void setAmmountPeople7(int ammountPeople7) {
        this.ammountPeople7 = ammountPeople7;
    }

    public void setAmmountPeople8(int ammountPeople8) {
        this.ammountPeople8 = ammountPeople8;
    }

    public void setAmmountPeople9(int ammountPeople9) {
        this.ammountPeople9 = ammountPeople9;
    }


    public void setAmmountPeople0(int ammountPeople0) {
        this.ammountPeople0 = ammountPeople0;
    }
}
