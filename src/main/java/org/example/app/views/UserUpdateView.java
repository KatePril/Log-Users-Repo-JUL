package org.example.app.views;

import java.util.Scanner;

public class UserUpdateView {
    public String[] getData() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user's ID: ");
        String id = scanner.nextLine();

        System.out.println("Enter the email in format example@mail.com: ");
        String email = scanner.nextLine();

        return new String[] {id, email};
    }
    public void getOutput(String output) {
        System.out.println(output);
    }
}
