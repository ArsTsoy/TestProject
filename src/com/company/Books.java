package com.company;

public class Books {

    String writer;
    String name;
    int pages;
    String colour;
    String janr;

    Books(String writer,String name,String colour,String janr,int pages){
        this.writer = writer;
        this.name = name;
        this.colour = colour;
        this.janr = janr;
        this.pages = pages;
    }


    public String getInfo(){
        return "Writer: " + this.writer + "\nName: " + this.name + "\nJanr: " + this.janr;
    }

}
