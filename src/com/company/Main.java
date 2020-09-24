package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for (int i = 1; i < 6; i++) {
         Ranner r = new Ranner(i, 1);
            r.start();
            try {
            r.join();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        for (int i = 4; i >=1 ; i--) {
            Ranner r = new Ranner(i,-1);
            r.start();
        try {
            r.join();
        }catch (InterruptedException e){

        }
        }
    }
}
