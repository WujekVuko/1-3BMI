package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj swoją wagę  i swój wzrost (w m) (np:80 176): ");
        String measurments = in.nextLine();
        Scanner s = new Scanner(measurments);


        BmiCalc twoData = new BmiCalc((s.nextInt()), (s.nextInt()));
        twoData.setBmi();
        System.out.println(twoData.getwig());
        System.out.println(twoData.gethig());
        System.out.println(twoData.getBmi());
        System.out.println(twoData.yourBmi());
    }
}
