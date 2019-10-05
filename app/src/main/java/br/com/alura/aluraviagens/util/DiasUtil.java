package br.com.alura.aluraviagens.util;

public class DiasUtil {

    public static final String PLURAL = "dias";
    public static final String SINGULAR = "dia";

    public static String formataEmTexto(int quantidadeDeDias) {
        return quantidadeDeDias + " " + (quantidadeDeDias > 1 ? PLURAL : SINGULAR);
    }

}
