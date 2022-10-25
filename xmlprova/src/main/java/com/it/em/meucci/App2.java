package com.it.em.meucci;

import java.io.File;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App2 {


    public static void main(String[] args) throws Exception {
        File file = new File("classe.xml");
        XmlMapper xmlMapper = new XmlMapper();
        Classe value = xmlMapper.readValue(file, Classe.class);

        System.out.println(value.getAula());
    }

}