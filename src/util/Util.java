package util;

import java.time.LocalDate;

public class Util {
    private static int nextLivroId = 1;
    private static int nextUsuarioId = 1;
    private static int nextEmprestimoId = 1;

    public static int generateLivroId() {
        return nextLivroId++;
    }

    public static int generateUsuarioId() {
        return nextUsuarioId++;
    }

    public static int generateEmprestimoId() {
        return nextEmprestimoId++;
    }

    public static boolean validateString(String input) {
        return input != null && !input.trim().isEmpty();
    }

    public static boolean validateLocalDate(LocalDate input) {
        LocalDate now = LocalDate.now(); 
        return input != null && (input.isBefore(now) || input.isEqual(now));
    }

    public static boolean validateQuantity(int quantity) {
        return quantity >= 0;
    }

     public static String normalizeString(String input) {
        if (validateString(input)) {
            return input.strip().toLowerCase();
        }
        return null;
    }

    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

}