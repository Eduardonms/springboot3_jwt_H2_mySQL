package com.javainuse.bootmysqlcrud.validator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EndpointValidator {
    public static String validateEndpoint(String endpoint) {
    	// Expressão regular que valida os endpoints conforme os critérios descritos
        String regex = "^/api/\\w+(/\\w+)*$";
        
        // Compilando o padrão da expressão regular
        Pattern pattern = Pattern.compile(regex);
        
        // Verificando se a entrada corresponde ao padrão
        Matcher matcher = pattern.matcher(endpoint);
        
        // Retornando a validação
        if (matcher.matches()) {
            return "Endpoint valido.";
        } else {
            return "Endpoint invalido.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String endpoint = scanner.nextLine();
        System.out.println(validateEndpoint(endpoint));
    }
}