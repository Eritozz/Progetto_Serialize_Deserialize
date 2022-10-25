package com.it.em.meucci;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;


public class App2 {


    public static void main( String[] args ) throws Exception
    {
        File file = new File("classe.json");
        ObjectMapper objectMapper = new ObjectMapper();
    Classe value = objectMapper.readValue(file, Classe.class);

    System.out.println(value.getAula());
    }
    
}
