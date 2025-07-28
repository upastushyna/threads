package org.example.nameGame;

public class NameThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(i ==5){
                System.out.println("Time's up");
            }

        }
    }
}
