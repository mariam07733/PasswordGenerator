package org.example;

import java.security.SecureRandom;

public class PasswordGenerator {

    private static final String MAJUSCULES = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String MINUSCULES = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHIFFRES = "0123456789";
    private static final String SYMBOLES = "!@#$%^&*()-_=+<>?";

    public static String generer(int longueur,
                                 boolean majuscules,
                                 boolean minuscules,
                                 boolean chiffres,
                                 boolean symboles) {

        String caracteres = "";

        if (majuscules)
            caracteres += MAJUSCULES;

        if (minuscules)
            caracteres += MINUSCULES;

        if (chiffres)
            caracteres += CHIFFRES;

        if (symboles)
            caracteres += SYMBOLES;

        if (caracteres.isEmpty()) {
            return "Erreur : aucun type de caractère sélectionné.";
        }

        SecureRandom random = new SecureRandom();
        StringBuilder motDePasse = new StringBuilder();

        for (int i = 0; i < longueur; i++) {
            int index = random.nextInt(caracteres.length());
            motDePasse.append(caracteres.charAt(index));
        }

        return motDePasse.toString();
    }
}
