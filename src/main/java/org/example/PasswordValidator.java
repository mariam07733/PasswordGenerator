package org.example;

public class PasswordValidator {

    public static PasswordStrength evaluate(String password) {

        int score = 0;

        if (password.length() >= 8)
            score++;

        if (password.matches(".*[A-Z].*"))
            score++;

        if (password.matches(".*[a-z].*"))
            score++;

        if (password.matches(".*\\d.*"))
            score++;

        if (password.matches(".*[!@#$%^&*()_+=<>?/{}\\[\\]-].*"))
            score++;

        return switch (score) {
            case 0, 1 -> PasswordStrength.TRES_FAIBLE;
            case 2 -> PasswordStrength.FAIBLE;
            case 3 -> PasswordStrength.MOYEN;
            case 4 -> PasswordStrength.FORT;
            default -> PasswordStrength.TRES_FORT;
        };
    }
}