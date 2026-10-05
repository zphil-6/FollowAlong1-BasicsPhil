package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        rewatch 39:25–47:00 for Scanner, and 43:34 for the nextInt trap
// Guide: GUIDE.md in this folder, steps 5–11
//
// SECTION D — Challenge. Mad Libs. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adj = scanner.nextLine();

        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.println("\n--- Your Mad Libs Story ---");
        System.out.println("The " + adj + " programmer wrote code that printed a " + noun + " on the screen.");

        scanner.close();
    }
}
