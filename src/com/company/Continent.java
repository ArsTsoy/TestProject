package com.company;

public class Continent {



    private String name;
    private int amountCountry;
    private String pol;


    public Continent(String name, int amountCountry, String pol){
        this.name = name;
        this.amountCountry = amountCountry;
        this.pol = pol;
    }


    String method(){
        return "dasdasdasd";
    }





    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public int getAmountCountry() {
        return amountCountry;
    }

    public void setAmountCountry(int amountCountry) {

        if(amountCountry < 0){
            System.out.println("Нельзя ставить отрицательное значение");
        }
        else{

            this.amountCountry = amountCountry;
        }
    }
}
