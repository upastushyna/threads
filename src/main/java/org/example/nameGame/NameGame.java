package org.example.nameGame;

import java.util.Arrays;
import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please provide your name:");
        System.out.print("Enter your name: ");

        NameThread thread = new NameThread();
        Thread thread1 = new Thread(thread);
        thread1.setDaemon(true);
        thread1.start();

        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        scanner.close();
    }
}
