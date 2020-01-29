package com.mycompany.innerclass;

import java.util.Scanner;

// Albaik Sale App
public class ThreeDExampleAlBaik {

    public static void main(String[] args) {
        // creating and filling data required for the problem
        String[] month = {"Jan", "Feb", "March"};
        String[] city = {"Jeddah", "Makkah", "Madina"};
        String[][] branch = {
            {"AzizMall", "JamiaMall", "AndalusMall"},
            {"HaramMall", "SittinMall"},
            {"M1Mall", "M2Mall", "M3Mall", "M4Mall"}
        };

        int[][][] sales = new int[city.length][][];
        // define the structure for each city
        for (int i = 0; i < city.length; i++) {
            sales[i] = new int[branch[i].length][month.length];
        }

        inputeSale(month, city, branch, sales);
        printSale(month, city, branch, sales);

    }

    //-----------
    public static void inputeSale(String[] month,
            String[] city, String[][] branch, int[][][] sales) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < sales.length; i++) {
            System.out.println("Enter Sale for City [" + city[i] + "]");
            for (int j = 0; j < sales[i].length; j++) {

                System.out.println("Branch [" + branch[i][j] + "]");
                for (int k = 0; k < sales[i][j].length; k++) {
                    System.out.println("Month: " + month[k]);
                    sales[i][j][k] = in.nextInt();
                }

            }

        }

    }

    //----------- 
    public static void printSale(String[] month,
            String[] city, String[][] branch, int[][][] sales) {
        for (int i = 0; i < sales.length; i++) {
            System.out.println("Sale for City [" + city[i] + "]");
            for (int j = 0; j < sales[i].length; j++) {

                System.out.println("Branch [" + branch[i][j] + "]");
                for (int k = 0; k < sales[i][j].length; k++) {
                    System.out.println("Month: " + month[k] + ": " + sales[i][j][k]);

                }

            }

        }

    }
    //---------------------------------------

    // input sales random data in the 3-d Matrix
    public static void inputSaleRandom(int[][][] sales) {
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                for (int k = 0; k < sales[i][j].length; k++) {
                    sales[i][j][k] = (int) (Math.random() * 10000);
                } // k loop
            }// j loop
        }// i loop

    }// inputSaleRandom Method ends here

    //------------------------------Total Sales ----------------
    public static void totalSaleReport(String[] city,
            String[][] branch, int[][][] sales) {
        System.out.println("--------------------------------------");
        int total = 0;
        int branchTotal = 0;
        for (int i = 0; i < sales.length; i++) {
            System.out.println(" Total For City :" + city[i]);
            branchTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                total = 0;
                System.out.println("Branch :" + branch[i][j]);
                for (int k = 0; k < sales[i][j].length; k++) {
                    total = total + sales[i][j][k];
                    branchTotal += sales[i][j][k];
                } // k loop
                System.out.println("branch Total :" + total);
            }// j loop
            System.out.println("City Total :" + branchTotal);
            System.out.println("--------------------------------------");

        }// i loop
    }

}
