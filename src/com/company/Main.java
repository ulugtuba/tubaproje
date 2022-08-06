package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz: ");
        String ad = scan.nextLine();

        System.out.println("Lütfen soyadınızı giriniz");
        String soyad= scan.nextLine();

        System.out.println("Vize notunuzu giriniz: ");
        int vize = scan.nextInt();

        System.out.println("Final notunu giriniz: ");
        int fınal = scan.nextInt();

        System.out.println("Quiz notunu giriniz: ");
        int quiz = scan.nextInt();

        double not = (vize * 0.3) + (fınal * 0.6)+ (quiz*0.1);

        System.out.println("Yıl sonu notunuz = " + not);

        if(not > 85) {
            System.out.println("AA ile dersi geçtiniz.");
        }
        else if(not >70) {
            System.out.println("BB ile dersi geçtiniz.");
        }
        else if(not > 60) {
            System.out.println("CC ile dersi geçtiniz.");
        }
        else if(not > 45) {
            System.out.println("DD ile dersi geçtiniz.");
        }
        else if(not <45) {
            System.out.println("Sayın Halil İbrahim Ayhan Not Ortalamanız: F ");
        }
        else {
            System.out.println("Sınıfta kaldınız ");
        }
    }
}