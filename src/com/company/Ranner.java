package com.company;

public class Ranner extends Thread {

    private int player;
    private int direction;


    public Ranner(int player, int direction) {
        this.player = player;
        this.direction = direction;
    }

    public synchronized void run() {
        try {
            if (player < 5 && direction == 1) {
                System.out.println(" бегун " + player + " берет палочку ");
                System.out.println(" бегун " + player + " бежит к бегуну " + (player + 1));
                sleep(5000);
            }
            if (player == 5) {
                System.out.println(" бегун " + player + " Берет палочку ");
                System.out.println(" бегун " + player + " Бежит к финишу ");
                sleep(5000);
                System.out.println(" бегун " + player + " Бежит к бегуну " + (player - 1));
            }
            if (player > 1 && direction == -1) {
                System.out.println(" бегун " + player + " Берет палочку ");
                System.out.println(" бегун " + player + " Бежит к бегуну " + (player - 1));
                sleep(5000);
            }

            if (player == 1 && direction == -1) {
                System.out.println(" бегун " + player + " Берет палочку ");
            }

        } catch (InterruptedException ie) {

        }
    }
}
