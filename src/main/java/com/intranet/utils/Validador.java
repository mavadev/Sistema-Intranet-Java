package com.intranet.utils;

public class Validador {
    public static boolean esCorreoValido(String correo) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return correo != null && correo.matches(regex);
    }

    public static boolean esPasswordValido(String password) {
        return password != null && password.length() >= 8;
    }

    public static boolean esPasswordSegura(String password) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return password != null && password.matches(regex);
    }
}
