package com.esame.esame;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class SortingReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("\n\nEnter how many strings you want, please insert a number: ");
        int numb;
        try {
            numb = sc.nextInt();
        }
        catch (InputMismatchException e){
            sc.next();
            out.println("PLEASEEE insert a NUMBER");
            numb = sc.nextInt();
        }

        out.println("Now enter strings one by one: ");
        String[] str = new String[numb];

        int i;
        for (i = 0; i < numb; i++){
            str[i] = sc.next();
        }

        Arrays.sort(str, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));

        out.println("Your strings in reverse order: ");
        out.println(Arrays.toString(str));
    }
}