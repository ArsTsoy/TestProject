package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArsList implements MyList {
    private int size;
    Object[] massive;
    private Object Exception;

    ArsList(){
        this.size = 0;
        this.massive = new Object[size];
    }

    @Override
    public void add(Object o) {

        Object[] temp = new Object[size + 1];
        for(int i = 0; i < size; i++){
            temp[i] = this.massive[i];
        }
        temp[size] = o;

        this.massive = temp;
        size ++;
    }

    @Override
    public Object get(int index) {
        if(index >= size || index < 0){
            return "Ошибка";
        } else {
            return massive[index];
        }
    }

    @Override
    public void remove(int index) throws Exception {
        if(index >= size || index < 0){
            throw new Exception();
        } else {
            Object[] temp = new Object[size - 1];
            boolean wasIndex = false;
            for(int i = 0; i < size; i++){
//                System.out.println(i);
                if(i == index ){
                    wasIndex = true;
                } else if(!wasIndex){
                    temp[i] = massive[i];
                } else if(wasIndex){
                    temp[i-1] = massive[i];
                }
            }
            this.massive = temp;
            size --;
        }

    }
//    @Override
//    public void remove(int index) {
//        if(index >= size || index < 0){
//            return "Ошибка";
//        } else {
//            return massive[index];
//        }
//    }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i< size; i++){
            str.append(massive[i] + " ");
        }
        return str.toString();
    }

    public int getSize() {
        return size;
    }
}
