package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //LogIn
        System.out.println("Already Have an account?? (yes / no )");
        String acc = scanner.nextLine();

        if (acc.equals("Yes") || acc.equals("yes")) {
            System.out.println("Sign In: ");

            //
            System.out.print("Enter your Username: ");
            String user = scanner.nextLine();

            if (user.equals("Frank")){
                System.out.println("Your user name is: " + user);

                System.out.print("Enter Password: ");
                int pass = scanner.nextInt();

                if (pass == 123){
                    System.out.println("Correct Password ");
                } else {
                    System.out.print("Definitely the wrong password ");
                }
            } else {
                System.out.print("No such user name");
            }

        } else if (acc.equals("No") || acc.equals("no")) {
            System.out.println("Please create an account?");
        } else {
            System.out.println("Err: You can only input yes/no answers");
        }
    }

}