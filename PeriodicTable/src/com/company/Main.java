package com.company;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        Set<String> set = new TreeSet<>();
        for (int i = 0; i < count; i++) {
            String[] el = scan.nextLine().split(" ");
            Collections.addAll(set, el);
        }
        System.out.println(String.join(" ", set));
    }
}
