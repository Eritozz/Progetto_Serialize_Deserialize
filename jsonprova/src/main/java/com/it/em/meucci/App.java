package com.it.em.meucci;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Alunno al1 = new Alunno();
        Alunno al2 = new Alunno();
        Alunno al3 = new Alunno();
        Alunno al4 = new Alunno();

        Classe cl1 = new Classe();

        cl1.aggiungiAlunno(al1);
        cl1.aggiungiAlunno(al2);
        cl1.aggiungiAlunno(al3);
        cl1.aggiungiAlunno(al4);



        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("classe.json"), cl1);
    }
}