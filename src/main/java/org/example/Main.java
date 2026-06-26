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
        System.out.print("Combien de mots de passe voulez-vous générer ? ");
        int nombre = scanner.nextInt();


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
        PasswordStrength niveau = PasswordValidator.evaluate(motDePasse);

        System.out.println();
        System.out.println("===== NIVEAU DE SÉCURITÉ =====");
        System.out.println("Force : " + niveau);
    }
}