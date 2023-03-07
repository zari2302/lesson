import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("What's suname:");
        String surName =scanner.nextLine();
        System.out.print("What's you're name:");
        String name = scanner.nextLine();
        System.out.print("age:");
        int age = scanner.nextInt();
        System.out.println("How old are you: Surname is : " + surName);
        System.out.println("you't nome is:" + name);
        System.out.println( "age:" + age);
        System.out.println();
        System.out.println();
    }

}
