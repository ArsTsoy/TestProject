package com.company;

public class MyInt {
    private int num;

    MyInt(int num){
        if(num > 1000 || num < -1000){
            System.out.println("Error");
        }else{
            this.num = num;
        }
    }


    public int getDifference(int n){
        int d = Math.abs(this.num - n);
        return d;
    }

    public int getDifference(MyInt n){
        int d = Math.abs(this.num - n.getNum());
        return d;
    }


    public int pow(int stepen){
        this.num = (int)Math.pow(num, stepen);
        return num;
    }


    public int getNum() {
        return num;
    }


    @Override
    public String toString() {
        String ans = "";
        if(num<0){
            ans += "минус ";
        }

        int num1 = num%10;
        int num10 = num/10%10;
        int num100 = num/100;




        switch (num1){
            case 1:
                ans += "один ";
                break;
            case 2:
                ans += "два ";
        }

        return ans;
    }
}
