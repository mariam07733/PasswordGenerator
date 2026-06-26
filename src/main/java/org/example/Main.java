package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" GENERATEUR DE MOTS DE PASSE ");
        System.out.println(" Java 21 + Docker");
        System.out.println("=================================");

        System.out.print("Entrez la longueur du mot de passe : ");
        int longueur = scanner.nextInt();

        System.out.print("Inclure des majuscules ? (O/N) : ");
        String reponseMaj = scanner.next();

        System.out.print("Inclure des minuscules ? (O/N) : ");
        String reponseMin = scanner.next();

        System.out.print("Inclure des chiffres ? (O/N) : ");
        String reponseChiffres = scanner.next();

        System.out.print("Inclure des symboles ? (O/N) : ");
        String reponseSymboles = scanner.next();
        System.out.println("\n===== PARAMÈTRES CHOISIS =====");
        System.out.println("Longueur : " + longueur);
        System.out.println("Majuscules : " + reponseMaj);
        System.out.println("Minuscules : " + reponseMin);
        System.out.println("Chiffres : " + reponseChiffres);
        System.out.println("Symboles : " + reponseSymboles);

        System.out.print("Inclure des majuscules ? (true/false) : ");
        boolean majuscules = scanner.nextBoolean();

        System.out.print("Inclure des minuscules ? (true/false) : ");
        boolean minuscules = scanner.nextBoolean();

        System.out.print("Inclure des chiffres ? (true/false) : ");
        boolean chiffres = scanner.nextBoolean();

        System.out.print("Inclure des symboles ? (true/false) : ");
        boolean symboles = scanner.nextBoolean();

        System.out.println("\n===== PARAMÈTRES CHOISIS =====");
        System.out.println("Longueur : " + longueur);
        System.out.println("Majuscules : " + majuscules);
        System.out.println("Minuscules : " + minuscules);
        System.out.println("Chiffres : " + chiffres);
        System.out.println("Symboles : " + symboles);

        String motDePasse = PasswordGenerator.generer(
                longueur,
                majuscules,
                minuscules,
                chiffres,
                symboles
        );

        System.out.println("\n===== MOT DE PASSE GÉNÉRÉ =====");
        System.out.println(motDePasse);
    }
}